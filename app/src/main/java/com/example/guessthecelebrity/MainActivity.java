package com.example.guessthecelebrity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    public ImageView imageView;
    public Button button0, button1, button2, button3;
    public int celebritiesCount = 0;
    public ArrayList<String> celebritiesURL = new ArrayList<>();
    public ArrayList<String> celebritiesName = new ArrayList<>();
    public Bitmap celebrityImage;
    public ArrayList<Integer> askedQuestions;
    public int correctAnswerTag;

    public void regexGetImageUrlAndName(String htmlContent) {

        int i = 0;
        int j = 0;
        Pattern pattern = Pattern.compile("(celebrities class=exit_trigger_set><img src=//|celebrities class=exit_trigger_set>)(.*?)( alt=|</a>)");
        Matcher matcher = pattern.matcher(htmlContent);
        while (matcher.find()) {
            if (j % 2 == 0) {
                celebritiesURL.add("https://" + matcher.group(2));
                Log.i("HTML_URL" + i, matcher.group(2));
            } else {
                celebritiesName.add(matcher.group(2));
                Log.i("HTML_Name" + i, matcher.group(2));
            }
            j++;
            if (j % 2 == 0 && j > 0) {
                j = 0;
                i++;
            }
        }
        celebritiesCount = i;
        generateRandomQuestion();
    }

    public void downloadImage(int imageForQuestion) {
        DownloadImageFromUrl downloadImageFromUrl = new DownloadImageFromUrl();
        try {
            celebrityImage = downloadImageFromUrl.execute(celebritiesURL.get(imageForQuestion)).get();
        } catch (Exception e) {
            Log.i("HTML_Error_DImageMethod", e.getMessage());
        }
    }

    public void generateRandomQuestion() {
        Random random = new Random();
        int randomWrongCelebrity;
        ArrayList<Integer> options = new ArrayList<>();//keep track of random options

        int correctCelebrity = random.nextInt(celebritiesCount); //select a random celebrity for questioning
        if (askedQuestions.size() != celebritiesCount) { //if game is not over
            if (askedQuestions.size() > 0) { //if game has started before
                while (askedQuestions.contains(correctCelebrity)) { //ignore repetitive questions
                    correctCelebrity = random.nextInt(celebritiesCount);
                }
            }
            askedQuestions.add(correctCelebrity);
            downloadImage(correctCelebrity);
            imageView.setImageBitmap(celebrityImage);

            correctAnswerTag = random.nextInt(4);
            options.add(correctCelebrity);

            for (int i = 0; i < 4; i++) {
                if (i != correctAnswerTag) {
                    randomWrongCelebrity = random.nextInt(celebritiesCount);
                    while (options.contains(randomWrongCelebrity)) { //ignore repetitive options
                        randomWrongCelebrity = random.nextInt(celebritiesCount);
                    }
                    Log.i("HTML_randomWrongCeleb", i + " , " + randomWrongCelebrity);
                    options.add(randomWrongCelebrity);
                    assignButtonText(i, celebritiesName.get(randomWrongCelebrity));
                } else {
                    assignButtonText(correctAnswerTag, celebritiesName.get(correctCelebrity));
                }
            }
        } else {
            Toast.makeText(this, "Finished!", Toast.LENGTH_LONG).show();
        }
    }

    public void assignButtonText(int tag, String name) {
        if (tag == 0) {
            button0.setText(name);
        }
        if (tag == 1) {
            button1.setText(name);
        }
        if (tag == 2) {
            button2.setText(name);
        }
        if (tag == 3) {
            button3.setText(name);
        }
    }

    public void checkAnswer(View view) {
        final Button button = (Button) view;

        try {
            if (Integer.parseInt(view.getTag().toString()) == correctAnswerTag) {
                button.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                button.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button.setBackgroundResource(R.drawable.back);
                        generateRandomQuestion();
                    }
                }, 800);
            } else {
                button.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
                changeBackgroundColor(correctAnswerTag, android.R.color.holo_green_light);
                button.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button.setBackgroundResource(R.drawable.back);
                        changeBackgroundColor(correctAnswerTag, R.drawable.back);
                        generateRandomQuestion();
                    }
                }, 800);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.i("HTML_WrongSelection", e.getMessage());
        }
    }

    public void changeBackgroundColor(int tag, int resid) {
        if (tag == 0) {
            button0.setBackgroundResource(resid);
        }
        if (tag == 1) {
            button1.setBackgroundResource(resid);
        }
        if (tag == 2) {
            button2.setBackgroundResource(resid);
        }
        if (tag == 3) {
            button3.setBackgroundResource(resid);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        askedQuestions = new ArrayList<>();

        imageView = findViewById(R.id.imageView);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        DownloadWebContent downloadWebContent = new DownloadWebContent();
        try {
            String htmlContent = downloadWebContent.execute("https://www.forbes.com/celebrities/list/").get();

            String htmlContentReplaced = htmlContent.replace("\"", "");
            htmlContentReplaced = htmlContentReplaced.replace("amp;", "");

            regexGetImageUrlAndName(htmlContentReplaced);
        } catch (Exception e) {
            Log.i("HTML_Error_onCreate", e.getMessage());
        }
    }
}



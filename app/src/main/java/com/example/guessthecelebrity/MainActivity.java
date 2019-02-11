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
import java.util.HashMap;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    public int celebritiesCount = 0;
    public int correctAnswerTag;
    public Bitmap[] celebritiesImage;
    public String[] celebritiesName;
    public HashMap<String, String> celebritiesList;
    public String[] imageURL;
    public ImageView imageView;
    public Button button0, button1, button2, button3;
    public ArrayList<Integer> askedQuestions;

    public HashMap regexGetImageUrlAndName(String htmlContent) {
        HashMap<String, String> extractedList = new HashMap<>();
        int i = 0;
        int j = 0;
        Pattern pattern = Pattern.compile("(celebrities class=exit_trigger_set><img src=//|celebrities class=exit_trigger_set>)(.*?)( alt=|</a>)");
        Matcher matcher = pattern.matcher(htmlContent);
        while (matcher.find()) {
            if (j % 2 == 0) {
                extractedList.put("URL" + i, matcher.group(2));
                Log.i("HTML_URL" + i, extractedList.get("URL" + i));
            } else {
                extractedList.put("Name" + i, matcher.group(2));
                Log.i("HTML_Name" + i, extractedList.get("Name" + i));
            }
            j++;
            if (j % 2 == 0 && j > 0) {
                j = 0;
                i++;
            }
        }
        celebritiesCount = i;
        return extractedList;
    }

    public void downloadImage(HashMap<String, String> list) {
        imageURL = new String[celebritiesCount];

        //extract image urls from input HashMap which contains images and names
        for (int i = 0; i <= celebritiesCount - 1; i++) {
            imageURL[i] = "https://" + list.get("URL" + i);
            celebritiesName[i] = list.get("Name" + i);
        }
        DownloadImageFromUrl downloadImageFromUrl = new DownloadImageFromUrl();
        //Download all Bitmap images from urls and put them inside the celebritiesImage
        try {
            celebritiesImage = downloadImageFromUrl.execute(imageURL).get();
            generateRandomQuestion();
        } catch (Exception e) {
            Log.i("HTML_Error_DImageMethod", e.getMessage());
        }
    }

    public void generateRandomQuestion() {
        Random random = new Random();
        int randomOptionNames;

        //keep track of random options
        ArrayList<Integer> options = new ArrayList<>();
        int selectedCelebrity = random.nextInt(celebritiesCount);
        if (askedQuestions.size() != celebritiesCount) { //if game is not over
            if (askedQuestions.size() > 0) { //if game has started before
                while (askedQuestions.contains(selectedCelebrity)) {
                    selectedCelebrity = random.nextInt(celebritiesCount);
                }
            }
            askedQuestions.add(selectedCelebrity);
            imageView.setImageBitmap(celebritiesImage[selectedCelebrity]);

            correctAnswerTag = random.nextInt(4);
            assignButtonText(correctAnswerTag, celebritiesName[selectedCelebrity]);
            options.add(selectedCelebrity);


            for (int i = 0; i < 4; i++) {
                if (i != correctAnswerTag) {
                    randomOptionNames = random.nextInt(celebritiesCount);
                    while (options.contains(randomOptionNames)) {
                        randomOptionNames = random.nextInt(celebritiesCount);
                    }
                    Log.i("HTML_radomOptionNames", i + " , " + randomOptionNames);
                    options.add(randomOptionNames);
                    assignButtonText(i, celebritiesName[randomOptionNames]);
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

            celebritiesList = regexGetImageUrlAndName(htmlContentReplaced);
            celebritiesImage = new Bitmap[celebritiesCount];
            celebritiesName = new String[celebritiesCount];
            downloadImage(celebritiesList);
        } catch (Exception e) {
            Log.i("HTML_Error_onCreate", e.getMessage());
        }
    }
}



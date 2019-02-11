package com.example.guessthecelebrity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadImageFromUrl extends AsyncTask<String, Void, Bitmap[]> {
    @Override
    protected Bitmap[] doInBackground(String... urls) {
        Bitmap[] image = new Bitmap[100];
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        int i =0;
        try {
            for (String url : urls) {
                Log.i("HTML_ImageUrl","url_"+i+": "+url);
                URL imageUrl = new URL(url);
                httpURLConnection = (HttpURLConnection) imageUrl.openConnection();
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                image[i] = BitmapFactory.decodeStream(inputStream);
                i++;
                httpURLConnection.disconnect();
            }
            return image;

        } catch (Exception e) {
            Log.i("HTML_Error_DImageClass", e.getMessage());
            return null;
        }
    }
}

package com.example.guessthecelebrity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadImageFromUrl extends AsyncTask<String, Void, Bitmap> {
    @Override
    protected Bitmap doInBackground(String... urls) {
        Bitmap image = null;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        try {
            Log.i("HTML_ImageUrl", "url " + urls[0]);
            URL imageUrl = new URL(urls[0]);
            httpURLConnection = (HttpURLConnection) imageUrl.openConnection();
            httpURLConnection.connect();
            inputStream = httpURLConnection.getInputStream();
            image = BitmapFactory.decodeStream(inputStream);
            httpURLConnection.disconnect();
            return image;

        } catch (Exception e) {
            Log.i("HTML_Error_DImageClass", e.getMessage());
            return null;
        }
    }
}

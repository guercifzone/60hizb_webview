package com.guercif.a60hizb.koraa.Class;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;
import com.guercif.a60hizb.koraa.AbdrahmanNaboulsi_Activity;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
/*
public class DownloadFileAsync extends AsyncTask<String,String,String> {
    public static final int DIALOG_DOWNLOAD_PROGRESS = 0;
    private ProgressDialog mProgressDialog;

    private Context context;

    public ProgressDialog DownloadFileAsync(Context context) {

            switch (context) {
                case DIALOG_DOWNLOAD_PROGRESS: // we set this to 0
                    mProgressDialog = new ProgressDialog(this);
                    mProgressDialog.setMessage("Downloading file. Please wait...");
                    mProgressDialog.setIndeterminate(false);
                    mProgressDialog.setMax(100);
                    mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                    mProgressDialog.setCancelable(true);
                    mProgressDialog.show();
                    return mProgressDialog;
                default:
                    return null;
            }
    }



    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mProgressDialog.show();
    }
    @Override
    protected String doInBackground(String... aurl) {
        try {
            File root = Environment.getExternalStorageDirectory();
            URL u = new URL(aurl[0]);
            HttpURLConnection c = (HttpURLConnection) u.openConnection();
            c.setRequestMethod("GET");
            c.setDoOutput(true);
            c.connect();

            int lenghtOfFile = c.getContentLength();

            FileOutputStream f = new FileOutputStream(new File(root + "/download/", aurl[1]));

            InputStream in = c.getInputStream();

            byte[] buffer = new byte[1024];
            int len1 = 0;
            long total = 0;

            while ((len1 = in.read(buffer)) > 0) {
                total += len1; //total = total + len1
                publishProgress("" + (int)((total*100)/lenghtOfFile));
                f.write(buffer, 0, len1);
            }
            f.close();
        } catch (Exception e) {
            Log.d("Downloader", e.getMessage());
        }

        return null;
    }
    protected void onProgressUpdate(String... progress) {
        Log.d("ANDRO_ASYNC",progress[0]);
        mProgressDialog.setProgress(Integer.parseInt(progress[0]));
    }

    @Override
    protected void onPostExecute(String unused) {
        mProgressDialog.dismiss();
    }
}*/

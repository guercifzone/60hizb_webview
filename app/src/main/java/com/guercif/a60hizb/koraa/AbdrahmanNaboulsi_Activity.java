package com.guercif.a60hizb.koraa;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.IntentService;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.*;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import com.guercif.a60hizb.R;
import com.guercif.a60hizb.koraa.Adapters.OnclickListView_Adapter;
import android.widget.Toast;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONException;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.app.PendingIntent.getActivity;
import static androidx.core.content.PackageManagerCompat.LOG_TAG;

public class AbdrahmanNaboulsi_Activity extends AppCompatActivity implements  OnclickListView_Adapter.customButtonListener {
    private ListView listView;
    private WebView mywebview;
    OnclickListView_Adapter adapter;
    ProgressDialog mProgressDialog;
    ArrayList<String> dataItems = new ArrayList<String>();
    final AbdrahmanNaboulsi_Activity.DownloadTask downloadTask = new DownloadTask(AbdrahmanNaboulsi_Activity.this);





    //region Variables video
    String hizb1 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F150553560171094%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>",
            hizb2 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F416452313042546%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>",
            hizb3 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1044735685964638%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>",
            hizb4 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1933222893480677%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>",
            hizb5 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1596835100705556%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>",
            hizb6 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1368021003397264%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>",
            hizb7 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1289799838100597%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb8 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=308&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1046314349140105%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb9 = "",
            hizb10 = "",
            hizb11 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1073013603136846%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb12 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1073014203136786%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb13 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1073014929803380%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb14 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F953691835164496%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb15 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1107627869677008%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb16 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F268664428000236%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb17 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1087576758347197%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb18 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1087582031680003%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb19 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fchett.rach%2Fvideos%2F3152651128295602%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb20 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1087614975010042%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb21 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F3957430274296882%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb22 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F2037488519722775%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb23 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F759367938035701%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb24 = "",
            hizb25 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F512589483033292%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb26 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F684794842130028%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb27 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F401349677632630%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb28 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F812202669379265%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb29 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fwac.dima.581%2Fvideos%2F702639020876339%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb30 = "",
            hizb31 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F3657112321000988%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb32 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F737311433652335%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb33 = "",
            hizb34 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F3693951173960799%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb35 = "",
            hizb36 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F760063218124263%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb37 = "",
            hizb38 = "",
            hizb39 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=260&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F525567444791446%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb40 = "",
            hizb41 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F798181687666604%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb42 = "",
            hizb43 = "",
            hizb44 = "",
            hizb45 = "",
            hizb46 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1126578467780359%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb47 = "",
            hizb48 = "",
            hizb49 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=260&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F688888068592968%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb50 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1161947990910073%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb51 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1161963604241845%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb52 = "",
            hizb53 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1163794894058716%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb54 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F274386684108049%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb55 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1163881777383361%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb56 = "",
            hizb57 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=260&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F459089775049216%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb58 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=260&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F459089775049216%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb59 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2F100008452237249%2Fvideos%2F2352950231663362%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>",
            hizb60 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F943243812796528%2F&show_text=false&width=560&t=0\" width=\"360\" height=\"260\" style=\"border:none,overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay, clipboard-write, encrypted-media, picture-in-picture, web-share\" allowFullScreen=\"true\"></iframe>";

    //endregion
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desplay_data);
        mywebview = findViewById(R.id.web_video);
        String[] dataArray = getResources().getStringArray(R.array.listdata);
        List<String> dataTemp = Arrays.asList(dataArray);
        dataItems.addAll(dataTemp);
        listView = (ListView) findViewById(R.id.list_view);
        adapter = new OnclickListView_Adapter(AbdrahmanNaboulsi_Activity.this, dataItems);
        adapter.setCustomButtonListner(AbdrahmanNaboulsi_Activity.this);
        listView.setAdapter(adapter);
        mProgressDialog = new ProgressDialog(AbdrahmanNaboulsi_Activity.this);
        mProgressDialog.setMessage("A message");
        mProgressDialog.setIndeterminate(true);
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        mProgressDialog.setCancelable(true);
       // final AbdrahmanNaboulsi_Activity.DownloadTask downloadTask = new DownloadTask(AbdrahmanNaboulsi_Activity.this);
    }
    private void permission_check() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 100);
                return;
            }
        }
    }
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            permission_check();
        } else {
            //   permission_check();
        }
    }

    @Override
    public void onButtonClickListner(int position, String value) {
        // Toast.makeText(AbdrahmanNaboulsi_Activity.this, "تم الضغط على  " + value, Toast.LENGTH_SHORT).show();
        switch (position) {

            case 0:
                mywebview.loadData(hizb1, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 1:
                mywebview.loadData(hizb2, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 2:
                mywebview.loadData(hizb3, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 3:
                mywebview.loadData(hizb4, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 4:
                mywebview.loadData(hizb5, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 5:
                mywebview.loadData(hizb6, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 6:
                mywebview.loadData(hizb7, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 7:
                mywebview.loadData(hizb8, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 8:
                mywebview.loadData(hizb9, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 9:
                mywebview.loadData(hizb10, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 10:
                mywebview.loadData(hizb11, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 11:
                mywebview.loadData(hizb12, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 12:
                mywebview.loadData(hizb13, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 13:
                mywebview.loadData(hizb14, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 14:
                mywebview.loadData(hizb15, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 15:
                mywebview.loadData(hizb16, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 16:
                mywebview.loadData(hizb17, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 17:
                mywebview.loadData(hizb18, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 18:
                mywebview.loadData(hizb19, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 19:
                mywebview.loadData(hizb20, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 20:
                mywebview.loadData(hizb21, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 21:
                mywebview.loadData(hizb22, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 22:
                mywebview.loadData(hizb23, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 23:
                mywebview.loadData(hizb24, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 24:
                mywebview.loadData(hizb25, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 25:
                mywebview.loadData(hizb26, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 26:
                mywebview.loadData(hizb27, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 27:
                mywebview.loadData(hizb28, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 28:
                mywebview.loadData(hizb29, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 29:
                mywebview.loadData(hizb30, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 30:
                mywebview.loadData(hizb31, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 31:
                mywebview.loadData(hizb32, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 32:
                mywebview.loadData(hizb33, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 33:
                mywebview.loadData(hizb34, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 34:
                mywebview.loadData(hizb35, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 35:
                mywebview.loadData(hizb36, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 36:
                mywebview.loadData(hizb37, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 37:
                mywebview.loadData(hizb38, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 38:
                mywebview.loadData(hizb39, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 39:
                mywebview.loadData(hizb40, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 40:
                mywebview.loadData(hizb41, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 41:
                mywebview.loadData(hizb42, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 42:
                mywebview.loadData(hizb43, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 43:
                mywebview.loadData(hizb44, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 44:
                mywebview.loadData(hizb45, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 45:
                mywebview.loadData(hizb46, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 46:
                mywebview.loadData(hizb47, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 47:
                mywebview.loadData(hizb48, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 48:
                mywebview.loadData(hizb49, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 49:
                mywebview.loadData(hizb50, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 50:
                mywebview.loadData(hizb51, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 51:
                mywebview.loadData(hizb52, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 52:
                mywebview.loadData(hizb53, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 53:
                mywebview.loadData(hizb54, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 54:
                mywebview.loadData(hizb55, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 55:
                mywebview.loadData(hizb56, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 56:
                mywebview.loadData(hizb57, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 57:
                mywebview.loadData(hizb58, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 58:
                mywebview.loadData(hizb59, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            case 59:
                mywebview.loadData(hizb60, "text/html", null);
                mywebview.getSettings().setJavaScriptEnabled(true);
                break;
            default:
                break;
        }
    }

    @Override
    public void onButtonClickListner1(int position, String value) {
        //Toast.makeText(AbdrahmanNaboulsi_Activity.this, "تحميل " + value, Toast.LENGTH_SHORT).show();
switch (position){
    case 0:

        downloadTask.execute( "https://dl.sndup.net/f6vv/hizb01.mp3");


        break;
    case 1:
        downloadTask.execute("https://hizb60.000webhostapp.com/02.mp3");

        break;
    case 2:
        downloadTask.execute("https://hizb60.000webhostapp.com/03.mp3");

        break;
    case 3:
        downloadTask.execute("https://hizb60.000webhostapp.com/04.mp3");

        break;
    case 4:
        downloadTask.execute("https://hizb60.000webhostapp.com/05.mp3");
        break;
    case 5:
        downloadTask.execute("https://hizb60.000webhostapp.com/06.mp3");

        break;
    case 6:
        downloadTask.execute("https://hizb60.000webhostapp.com/07.mp3");

        break;
    case 7:
        downloadTask.execute("https://hizb60.000webhostapp.com/08.mp3");

        break;
    case 8:
        downloadTask.execute("https://hizb60.000webhostapp.com/09.mp3");

        break;
    case 9:
        downloadTask.execute("https://hizb60.000webhostapp.com/10.mp3");

        break;
    case 10:
        downloadTask.execute("https://hizb60.000webhostapp.com/11.mp3");
        break;
    case 11:
        downloadTask.execute("https://hizb60.000webhostapp.com/12.mp3");
        break;
    case 12:
        downloadTask.execute("https://hizb60.000webhostapp.com/13.mp3");

        break;
    case 13:
        downloadTask.execute("https://hizb60.000webhostapp.com/14.mp3");

        break;
    case 14:
        downloadTask.execute("https://hizb60.000webhostapp.com/15.mp3");

        break;
    case 15:
        downloadTask.execute("https://hizb60.000webhostapp.com/16.mp3");

        break;
    case 16:
        downloadTask.execute("https://hizb60.000webhostapp.com/17.mp3");

        break;
    case 17:
        downloadTask.execute("https://hizb60.000webhostapp.com/18.mp3");

        break;
    case 18:
        downloadTask.execute("https://hizb60.000webhostapp.com/19.mp3");

        break;
    case 19:
        downloadTask.execute("");

        break;
    case 20:
        downloadTask.execute("");

        break;
    case 21:
        downloadTask.execute("");

        break;
    case 22:
        downloadTask.execute("");

        break;
    case 23:
        downloadTask.execute("");

        break;
    case 24:
        downloadTask.execute("");

        break;
    case 25:
      downloadTask.execute("");

        break;
    case 26:
        downloadTask.execute("");

        break;
    case 27:
        downloadTask.execute("");

        break;
    case 28:
        downloadTask.execute("");

        break;
    case 29:
        downloadTask.execute("");

        break;
    case 30:
        downloadTask.execute("");

        break;
    case 31:
        downloadTask.execute("");

        break;
    case 32:
        downloadTask.execute("");

        break;
    case 33:
        downloadTask.execute("");

        break;
    case 34:
        downloadTask.execute("");
        break;
    case 35:
        downloadTask.execute("");

        break;
    case 36:
        downloadTask.execute("");

        break;
    case 37:
        downloadTask.execute("");

        break;
    case 38:
        downloadTask.execute("");

        break;
    case 39:
        downloadTask.execute("");

        break;
    case 40:
        downloadTask.execute("");

        break;
    case 41:
        downloadTask.execute("");

        break;
    case 42:
        downloadTask.execute("");

        break;
    case 43:
        downloadTask.execute("");

        break;
    case 44:
        downloadTask.execute("");

        break;
    case 45:
        downloadTask.execute("");

        break;
    case 46:
        downloadTask.execute("");

        break;
    case 47:
        downloadTask.execute("");

        break;
    case 48:
        downloadTask.execute("");

        break;
    case 49:
        downloadTask.execute("");

        break;
    case 50:
        downloadTask.execute("");

        break;
    case 51:
        downloadTask.execute("");

        break;
    case 52:
        downloadTask.execute("");

        break;
    case 53:
        downloadTask.execute("");

        break;
    case 54:
        downloadTask.execute("");

        break;
    case 55:
        downloadTask.execute("");

        break;
    case 56:
        downloadTask.execute("");

        break;
    case 57:
        downloadTask.execute("");

        break;
    case 58:
        downloadTask.execute("");

        break;
    case 59:
        downloadTask.execute("https://docs.google.com/uc?export=open&id=1CJ9ACqPN11NbnSX_ZA2eRQaIo2ZiWoF7");

        break;
    default:
        break;
}
    }

    private class DownloadTask extends AsyncTask<String, Integer, String> {

        private Context context;
        private PowerManager.WakeLock mWakeLock;

        public DownloadTask(Context context) {
            this.context = context;
        }



        @Override
        protected String doInBackground(String... strings) {
            InputStream input = null;
            OutputStream output = null;
            HttpURLConnection connection = null;
            try {
                URL url = new URL(strings[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                    return "Server returned HTTP " + connection.getResponseCode()
                            + " " + connection.getResponseMessage();
                }
                int fileLength = connection.getContentLength();
                input = connection.getInputStream();
                // output = new FileOutputStream("/sdcard/35788286_459134581202714_5305771562597613568_n.jpg");
                output = new FileOutputStream(Environment.getExternalStorageDirectory()+"/Download/video.mp4");
                byte data[] = new byte[4096];
                long total = 0;
                int count;
                while ((count = input.read(data)) != -1) {

                    if (isCancelled()) {
                        input.close();
                        return null;
                    }
                    total += count;

                    if (fileLength > 0)
                        publishProgress((int) (total * 100 / fileLength));
                    output.write(data, 0, count);
                }
            } catch (Exception e) {
                return e.toString();
            } finally {
                try {
                    if (output != null)
                        output.close();
                    if (input != null)
                        input.close();
                } catch (IOException ignored) {
                }

                if (connection != null)
                    connection.disconnect();
            }
            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
            mWakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK,
                    getClass().getName());
            mWakeLock.acquire();
            mProgressDialog.show();
        }
        @Override
        protected void onProgressUpdate(Integer... progress) {
            super.onProgressUpdate(progress);
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.setMax(100);
            mProgressDialog.setProgress(progress[0]);
        }

        @Override
        protected void onPostExecute(String result) {
            mWakeLock.release();
            mProgressDialog.dismiss();
            if (result != null)
                Toast.makeText(context,"Download error: "+result, Toast.LENGTH_LONG).show();
            else
                Toast.makeText(context,"File downloaded", Toast.LENGTH_SHORT).show();
        }
    }

}




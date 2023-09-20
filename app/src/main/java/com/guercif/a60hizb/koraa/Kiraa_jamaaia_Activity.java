package com.guercif.a60hizb.koraa;

import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.guercif.a60hizb.R;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/*
public class Kiraa_jamaaia_Activity extends AppCompatActivity {
    private WebView mywebview;
    private ListView listView;
    private MediaPlayer mediaPlayer;
    ArrayList<String> videolist;
    ArrayAdapter adapter;
  String hizb1,hizb2,hizb3,hizb4,hizb5,hizb6,hizb7,hizb8,hizb9,hizb10,hizb11,hizb12,hizb13,hizb14,hizb15,hizb16,hizb17,hizb18,hizb19,hizb20,hizb21,hizb22,hizb23,hizb24,hizb25,hizb26,hizb27,hizb28,hizb29,hizb30,hizb31,hizb32,hizb33,hizb34,hizb35,hizb36,hizb37,hizb38,hizb39,hizb40,hizb41,hizb42,hizb43,hizb44,hizb45,hizb46,hizb47,hizb48,hizb49,hizb50,hizb51,hizb52,hizb53,hizb54,hizb55,hizb56,hizb57,hizb58,hizb59,hizb60;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desplay_data);
        listView = findViewById(R.id.list_view);
        mywebview = findViewById(R.id.web_video);
       // videoView = findViewById(R.id.list_video);
        releasemedia();
        videolist= new ArrayList<String>();
        String[] dataArraty = getResources().getStringArray(R.array.listdata);
        List<String> dataTemp = Arrays.asList(dataArraty);
        dataTemp.addAll(dataTemp);

        adapter =  new ArrayAdapter(this, android.R.layout.simple_list_item_1,videolist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long ID) {
                switch (position){
                    case 0:
                        String hizb1 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=315&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F401882388277388%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"315\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb1,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 1:
                        String hizb2 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1333462573748282%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb2,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 2:
                        String hizb3 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F4515133915238685%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb3,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 3:
                        String hizb4 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F662435624921553%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb4,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 4:
                        String hizb5 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F4433386230086522%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb5,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 5:
                        String hizb6 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F663361704680635%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb6,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 6:
                        String hizb7 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F289641806361472%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb7,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 7:
                        String hizb8="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F514527186923976%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb8,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 8:
                        String hizb9 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1157798644962640%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb9,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 9:
                        String hizb10 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1024584998120144%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb10,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 10:
                        String hizb11 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F711137583193196%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb11,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 11:
                        String hizb12 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F619944032575688%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb12,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 12:
                        String hizb13 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F280946943959036%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb13,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 13:
                        String hizb14 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F230747265854983%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb14,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 14:
                        String hizb15 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F3044670109134210%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb15,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 15:
                        String hizb16 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F336767591502396%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb16,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 16:
                        String hizb17 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F329845618680828%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb17,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 17:
                        String hizb18 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F911836409456229%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb18,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 18:
                        String hizb19 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F911836409456229%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb19,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 19:
                        String hizb20 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1071562286965857%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb20,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 20:
                        String hizb21 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F282535570366276%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb21,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 21:
                        String hizb22 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F422448179558588%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb22,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 22:
                        String hizb23 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F816832208993612%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb23,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 23:
                        String hizb24 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F235663535331825%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb24,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 24:
                        String hizb25 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F400423165013009%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb25,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 25:
                        String hizb26 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F414563597033931%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb26,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 26:
                        String hizb27 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F412066643621591%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb27,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 27:
                        String hizb28 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F999621217573976%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb28,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 28:
                        String hizb29 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F183090547291596%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb29,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 29:
                        String hizb30 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1279634719223226%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb30,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 30:
                        String hizb31 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F980410222561999%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb31,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 31:
                        String hizb32 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1738799482986261%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb32,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 32:
                        String hizb33 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F586473345741876%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb33,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 33:
                        String hizb34 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1168591167280389%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb34,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 34:
                        String hizb35 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F268076028619635%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb35,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 35:
                        String hizb36 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F874224783462477%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb36,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 36:
                        String hizb37 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1537810256584319%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb37,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 37:
                        String hizb38 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F322678586371999%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb38,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 38:
                        String hizb39 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F247232344034813%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb39,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 39:
                        String hizb40 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F449697890096825%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb40,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 40:
                        String hizb41 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F2979938285594834%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb41,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 41:
                        String hizb42 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F643963277030749%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb42,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 42:
                        String hizb43 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F150928077117946%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb43,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 43:
                        String hizb44 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F707814580606846%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb44,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 44:
                        String hizb45 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F4853207791461446%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb45,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 45:
                        String hizb46 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F2188957541256174%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb46,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 46:
                        String hizb47 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1357668347968893%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb47,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 47:
                        String hizb48 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F337489101544711%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb48,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 48:
                        String hizb49 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F672798553698525%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb49,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 49:
                        String hizb50 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F910851459633232%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb50,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 50:
                        String hizb51 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F756484615307680%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb51,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 51:
                        String hizb52 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F877731132890976%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb52,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 52:
                        String hizb53 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F443521583996871%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb53,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 53:
                        String hizb54 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F377358944179423%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb54,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 54:
                        String hizb55 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F918244502393550%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb55,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 55:
                        String hizb56 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F942942079985414%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb56,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 56:
                        String hizb57 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F4625732810840481%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb57,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 57:
                        String hizb58 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F5393919553957207%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb58,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 58:
                        String hizb59 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F613709990048717%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb59,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 59:
                        String hizb60 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F496107721365400%2F&show_text=false&width=560&t=0\" width=\"100%\" height=\"100%\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb60,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    default:
                        break;

                }

            }
        });

        return null;
    }

    private void releasemedia(){
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        //videoView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
       // videoView.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        releasemedia();
    }
}*/
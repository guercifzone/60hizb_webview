package com.guercif.a60hizb.koraa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.widget.MediaController;
import android.widget.VideoView;

import com.guercif.a60hizb.R;

import java.util.ArrayList;
/*
public class Omar_kzabriActivity extends AppCompatActivity {
    private WebView mywebview;
    private ListView listView;
    private MediaPlayer mediaPlayer;
    ArrayList<String> videolist;
    ArrayAdapter adapter;
    String hizb1,hizb2,hizb3,hizb4,hizb5,hizb6,hizb7,hizb8,hizb9,hizb10,hizb11,hizb12,hizb13,hizb14,hizb15,hizb16,hizb17,hizb18,hizb19,hizb20,hizb21,hizb22,hizb23,hizb24,hizb25,hizb26,hizb27,hizb28,hizb29,hizb30,hizb31,hizb32,hizb33,hizb34,hizb35,hizb36,hizb37,hizb38,hizb39,hizb40,hizb41,hizb42,hizb43,hizb44,hizb45,hizb46,hizb47,hizb48,hizb49,hizb50,hizb51,hizb52,hizb53,hizb54,hizb55,hizb56,hizb57,hizb58,hizb59,hizb60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desplay_data);
        listView = findViewById(R.id.list_view);
        mywebview = findViewById(R.id.web_video);
        releasemedia();
        videolist= new ArrayList<>();
        videolist.add("الحزب  الأول");
        videolist.add("الحزب الثاني");
        videolist.add("الحزب الثالث");
        videolist.add("الحزب الرابع");
        videolist.add("الحزب الخامس");
        videolist.add("الحزب السادس");
        videolist.add("الحزب السابع");
        videolist.add("الحزب الثامن");
        videolist.add("الحزب التاسع");
        videolist.add("الحزب العاشر");
        videolist.add("الحزب الحادي عشر");
        videolist.add("الحزب الثاني عشر");
        videolist.add("جاري الرفع");
        videolist.add("الحزب الرابع عشر");
        videolist.add("الحزب الخامس عشر");
        videolist.add("جاري الرفع");
        videolist.add("الحزب السابع عشر");
        videolist.add("الحزب الثامن عشر");
        videolist.add("الحزب التاسع عشر");
        videolist.add("الحزب العشرون");
        videolist.add("جاري الرفع");
        videolist.add("الحزب الثاني وعشرون");
        videolist.add("جاري الرفع");
        videolist.add("الحزب الرابع وعشرون");
        videolist.add("الحزب الخامس وعشرون");
        videolist.add("جاري الرفع");
        videolist.add("الحزب السابع وعشرون");
        videolist.add("الحزب الثامن وعشرون");
        videolist.add("جاري الرفع");
        videolist.add("الحزب الثلاثون");
        videolist.add("جاري الرفع");
        videolist.add("الحزب الثاني والثلاثون");
        videolist.add("جاري الرفع");
        videolist.add("جاري الرفع");
        videolist.add("الحزب الخامس والثلاثون");
        videolist.add("جاري الرفع");
        videolist.add("جاري الرفع");
        videolist.add("الحزب الثامن والثلاثون");
        videolist.add("جاري الرفع");
        videolist.add("الحزب الاربعين");
        videolist.add("جاري الرفع");
        videolist.add("جاري الرفع");
        videolist.add("جاري الرفع");
        videolist.add("جاري الرفع");
        videolist.add("جاري الرفع");
        videolist.add("جاري الرفع");
        videolist.add("الحزب السابع واربعون");
        videolist.add("الحزب الثامن واربعون");
        videolist.add("جاري الرفع");
        videolist.add("الحزب الخمسين");
        videolist.add("جاري الرفع");
        videolist.add("الحزب الثاني وخمسون");
        videolist.add("جاري الرفع");
        videolist.add("جاري الرفع");
        videolist.add("الحزب الخامس وخمسون");
        videolist.add("الحزب السادس وخمسون");
        videolist.add("الحزب السابع وخمسون");
        videolist.add("جاري الرفع");
        videolist.add("جاري الرفع");
        videolist.add("جاري الرفع");

        adapter =  new ArrayAdapter(this, android.R.layout.simple_list_item_1,videolist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long ID) {
                switch (position){
                    case 0:
                        String hizb1 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F447344549532476%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb1,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 1:
                        String hizb2 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F625253415094898%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb2,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 2:
                        String hizb3 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2F100678372618997%2Fvideos%2F944239359603146%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb3,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 3:
                        String hizb4 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2F100678372618997%2Fvideos%2F299611045620938%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb4,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 4:
                        String hizb5 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F186328490011060%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb5,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 5:
                        String hizb6 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F575053763400131%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb6,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 6:
                        String hizb7 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F3860436024044835%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb7,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 7:
                        String hizb8="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F792631131341343%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb8,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 8:
                        String hizb9 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F243440770860878%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb9,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 9:
                        String hizb10 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F701154533909575%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb10,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 10:
                        String hizb11 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F3701309426619166%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb11,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 11:
                        String hizb12 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F421401648968147%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb12,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 12:
                        String hizb13 ="";
                        mywebview.loadData(hizb13,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 13:
                        String hizb14 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F245352547288149%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb14,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 14:
                        String hizb15 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1150822112017368%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb15,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 15:
                        String hizb16 ="";
                        mywebview.loadData(hizb16,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 16:
                        String hizb17 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1094491391061306%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb17,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 17:
                        String hizb18 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F147602153971941%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb18,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 18:
                        String hizb19 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F2084087468399364%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb19,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 19:
                        String hizb20 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F431621661596861%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb20,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 20:
                        String hizb21 ="";
                        mywebview.loadData(hizb21,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 21:
                        String hizb22 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F839594609929785%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb22,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 22:
                        String hizb23 ="";
                        mywebview.loadData(hizb23,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 23:
                        String hizb24 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F687624488508140%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb24,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 24:
                        String hizb25 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F2853737614896948%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb25,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 25:
                        String hizb26 ="";
                        mywebview.loadData(hizb26,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 26:
                        String hizb27 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F187373049422995%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb27,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 27:
                        String hizb28 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F756588551889219%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb28,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 28:
                        String hizb29 ="";
                        mywebview.loadData(hizb29,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 29:
                        String hizb30 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F472540017316498%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb30,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 30:
                        String hizb31 ="";
                        mywebview.loadData(hizb31,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 31:
                        String hizb32 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F447300206533220%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb32,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 32:
                        String hizb33 ="";
                        mywebview.loadData(hizb33,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 33:
                        String hizb34 ="";
                        mywebview.loadData(hizb34,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 34:
                        String hizb35 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F147751130570939%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb35,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 35:
                        String hizb36 ="";
                        mywebview.loadData(hizb36,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 36:
                        String hizb37 ="";
                        mywebview.loadData(hizb37,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 37:
                        String hizb38 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F487608022291936%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb38,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 38:
                        String hizb39 ="";
                        mywebview.loadData(hizb39,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 39:
                        String hizb40 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=322&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F3940468702692700%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"322\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb40,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 40:
                        String hizb41 ="";
                        mywebview.loadData(hizb41,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 41:
                        String hizb42 ="";
                        mywebview.loadData(hizb42,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 42:
                        String hizb43 ="";
                        mywebview.loadData(hizb43,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 43:
                        String hizb44 ="";
                        mywebview.loadData(hizb44,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 44:
                        String hizb45 ="";
                        mywebview.loadData(hizb45,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 45:
                        String hizb46 ="";
                        mywebview.loadData(hizb46,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 46:
                        String hizb47 ="";
                        mywebview.loadData(hizb47,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 47:
                        String hizb48 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F175256300659310%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb48,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 48:
                        String hizb49 ="";
                        mywebview.loadData(hizb49,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 49:
                        String hizb50 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=322&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F2947034422051046%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"322\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb50,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 50:
                        String hizb51 ="";
                        mywebview.loadData(hizb51,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 51:
                        String hizb52 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F190027829204048%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb52,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 52:
                        String hizb53 ="";
                        mywebview.loadData(hizb53,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 53:
                        String hizb54 ="";
                        mywebview.loadData(hizb54,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 54:
                        String hizb55 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F263909208511505%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb55,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 55:
                        String hizb56 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1185755578526915%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb56,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 56:
                        String hizb57 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F296420241984720%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb57,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 57:
                        String hizb58 ="";
                        mywebview.loadData(hizb58,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 58:
                        String hizb59 ="";
                        mywebview.loadData(hizb59,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 59:
                        String hizb60 ="";
                        mywebview.loadData(hizb60,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    default:
                        break;


                }

            }
        });

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
     //   videoView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //videoView.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        releasemedia();
    }
}*/
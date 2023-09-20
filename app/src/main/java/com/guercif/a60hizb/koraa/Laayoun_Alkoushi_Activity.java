package com.guercif.a60hizb.koraa;

import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;
import com.guercif.a60hizb.R;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;
/*
public class Laayoun_Alkoushi_Activity extends AppCompatActivity {
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
        videolist.add("في طور  الرفع");
        videolist.add("في طور  الرفع");
        videolist.add("الحزب الحادي عشر");
        videolist.add("الحزب الثاني عشر");
        videolist.add("الحزب الثالث عشر");
        videolist.add("الحزب الرابع عشر");
        videolist.add("الحزب الخامس عشر");
        videolist.add("الحزب السادس عشر");
        videolist.add("الحزب السابع عشر");
        videolist.add("الحزب الثامن عشر");
        videolist.add("الحزب التاسع عشر");
        videolist.add("الحزب العشرون");
        videolist.add("الحزب الحادي وعشرون");
        videolist.add("الحزب الثاني وعشرون");
        videolist.add("الحزب الثالث وعشرون");
        videolist.add("في طور  الرفع");
        videolist.add("الحزب الخامس وعشرون");
        videolist.add("الحزب السادس وعشرون");
        videolist.add("الحزب السابع وعشرون");
        videolist.add("الحزب الثامن وعشرون");
        videolist.add("الحزب التاسع وعشرون");
        videolist.add("في طور  الرفع");
        videolist.add("الحزب الحادي وثلاثون");
        videolist.add("الحزب الثاني والثلاثون");
        videolist.add("في طور  الرفع");
        videolist.add("الحزب الرابع والثلاثون");
        videolist.add("في طور  الرفع");
        videolist.add("الحزب السادس والثلاثون");
        videolist.add("في طور  الرفع");
        videolist.add("في طور  الرفع");
        videolist.add("الحزب التاسع والثلاثون");
        videolist.add("في طور  الرفع");
        videolist.add("الحزب الحادي واربعون");
        videolist.add("افي طور  الرفع");
        videolist.add("في طور  الرفع");
        videolist.add("في طور  الرفع");
        videolist.add("في طور  الرفع");
        videolist.add("الحزب السادس واربعون");
        videolist.add("في طور  الرفع");
        videolist.add("في طور  الرفع");
        videolist.add("الحزب  التاسع واربعون");
        videolist.add("الحزب الخمسين");
        videolist.add("في طور  الرفع");
        videolist.add("الحزب الثاني وخمسون");
        videolist.add("الحزب الثالث وخمسون");
        videolist.add("الحزب الرابع وخمسون");
        videolist.add("الحزب الخامس وخمسون");
        videolist.add("في طور  الرفع");
        videolist.add("الحزب السابع وخمسون");
        videolist.add("الحزب الثامن وخمسون");
        videolist.add("الحزب التاسع وخمسون");
        videolist.add("الحزب الستون");

        adapter =  new ArrayAdapter(this, android.R.layout.simple_list_item_1,videolist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long ID) {
                switch (position){

                    case 0:
                        String hizb1 = "<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F150553560171094%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb1,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 1:
                        String hizb2 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F416452313042546%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb2,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 2:
                        String hizb3 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1044735685964638%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb3,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 3:
                        String hizb4 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1933222893480677%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb4,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 4:
                        String hizb5 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1596835100705556%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb5,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 5:
                        String hizb6 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1368021003397264%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb6,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 6:
                        String hizb7 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1289799838100597%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb7,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 7:
                        String hizb8="<iframe src=\"https://www.facebook.com/plugins/video.php?height=308&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1046314349140105%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"308\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb8,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 8:
                        String hizb9 ="";
                        mywebview.loadData(hizb9,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 9:
                        String hizb10 ="";
                        mywebview.loadData(hizb10,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 10:
                        String hizb11 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1073013603136846%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb11,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 11:
                        String hizb12 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1073014203136786%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb12,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 12:
                        String hizb13 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1073014929803380%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb13,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 13:
                        String hizb14 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F953691835164496%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb14,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 14:
                        String hizb15 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F1107627869677008%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb15,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 15:
                        String hizb16 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F268664428000236%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb16,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 16:
                        String hizb17 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1087576758347197%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb17,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 17:
                        String hizb18 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1087582031680003%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb18,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 18:
                        String hizb19 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fchett.rach%2Fvideos%2F3152651128295602%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb19,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 19:
                        String hizb20 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1087614975010042%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb20,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 20:
                        String hizb21 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F3957430274296882%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb21,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 21:
                        String hizb22 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F2037488519722775%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb22,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 22:
                        String hizb23 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F759367938035701%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb23,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 23:
                        String hizb24 ="";
                        mywebview.loadData(hizb24,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 24:
                        String hizb25 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F512589483033292%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb25,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 25:
                        String hizb26 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F684794842130028%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb26,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 26:
                        String hizb27 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F401349677632630%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb27,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 27:
                        String hizb28 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F812202669379265%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb28,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 28:
                        String hizb29 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fwac.dima.581%2Fvideos%2F702639020876339%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb29,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 29:
                        String hizb30 ="";
                        mywebview.loadData(hizb30,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 30:
                        String hizb31 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F3657112321000988%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb31,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 31:
                        String hizb32 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=420&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F737311433652335%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"420\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb32,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 32:
                        String hizb33 ="";
                        mywebview.loadData(hizb33,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 33:
                        String hizb34 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F3693951173960799%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb34,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 34:
                        String hizb35 ="";
                        mywebview.loadData(hizb35,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 35:
                        String hizb36 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F760063218124263%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb36,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 36:
                        String hizb37 ="";
                        mywebview.loadData(hizb37,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 37:
                        String hizb38 ="";
                        mywebview.loadData(hizb38,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 38:
                        String hizb39 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=322&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F525567444791446%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"322\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb39,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 39:
                        String hizb40 ="";
                        mywebview.loadData(hizb40,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 40:
                        String hizb41 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F798181687666604%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
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
                        String hizb46 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1126578467780359%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb46,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 46:
                        String hizb47 ="";
                        mywebview.loadData(hizb47,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 47:
                        String hizb48 ="";
                        mywebview.loadData(hizb48,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 48:
                        String hizb49 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=322&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F688888068592968%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"322\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb49,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 49:
                        String hizb50 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1161947990910073%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb50,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 50:
                        String hizb51 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1161963604241845%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb51,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 51:
                        String hizb52 ="";
                        mywebview.loadData(hizb52,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 52:
                        String hizb53 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1163794894058716%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb53,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 53:
                        String hizb54 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F274386684108049%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb54,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 54:
                        String hizb55 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fhassan.saidi.1999%2Fvideos%2F1163881777383361%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb55,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 55:
                        String hizb56 ="";
                        mywebview.loadData(hizb56,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 56:
                        String hizb57 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=322&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F459089775049216%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"322\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb57,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 57:
                        String hizb58 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=322&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F459089775049216%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"322\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb58,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 58:
                        String hizb59 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2F100008452237249%2Fvideos%2F2352950231663362%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
                        mywebview.loadData(hizb59,"text/html",null);
                        mywebview.getSettings().setJavaScriptEnabled(true);
                        break;
                    case 59:
                        String hizb60 ="<iframe src=\"https://www.facebook.com/plugins/video.php?height=314&href=https%3A%2F%2Fweb.facebook.com%2Fministere.habous%2Fvideos%2F943243812796528%2F&show_text=false&width=560&t=0\" width=\"560\" height=\"314\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowfullscreen=\"true\" allow=\"autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share\" allowFullScreen=\"true\"></iframe>";
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
       // videoView.pause();
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
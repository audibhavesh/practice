package com.example.user.practice;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class openlistactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openlistactivity);
        RelativeLayout layoutMain = findViewById(R.id.li);
//        layoutMain.setOrientation(RelativeLayout.VERTICAL);
//        setContentView(layoutMain);
        LayoutInflater inflate = getLayoutInflater();
        RelativeLayout layoutLeft;
        Bundle b = getIntent().getExtras();
        int a = b.getInt("key");
        switch (a) {
            case 0:
                layoutLeft = (RelativeLayout) inflate.inflate(R.layout.activity_heart_intro, null);
                layoutMain.addView(layoutLeft);
                setContentView(layoutMain);
                break;
            case 1:
                RelativeLayout.LayoutParams li2 = new RelativeLayout
                        .LayoutParams(200, 500);
                li2.addRule(RelativeLayout.BELOW, R.id.textView);
                RelativeLayout li = (RelativeLayout) inflate.inflate(R.layout.internal, null);
                ImageView imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.heart);
                imageView.setLayoutParams(li2);
                li.addView(imageView);
                layoutMain.addView(li);
                setContentView(layoutMain);
                break;
        }
    }

}

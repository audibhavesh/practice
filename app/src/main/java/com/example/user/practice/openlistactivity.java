package com.example.user.practice;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class openlistactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openlistactivity);
        LinearLayout layoutMain = new LinearLayout(this);
        layoutMain.setOrientation(LinearLayout.VERTICAL);
        setContentView(layoutMain);
        LayoutInflater inflate = getLayoutInflater();
        RelativeLayout layoutLeft = (RelativeLayout) inflate.inflate(
                R.layout.activity_heart_intro, null);
        layoutMain.addView(layoutLeft);
    }

}

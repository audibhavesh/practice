package com.example.user.practice;

import android.os.Trace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView re;
    private RecyclerView.Adapter myadpt;
    private String[] medli={"brain","eyes","ear","neck","heart","kideny","liver","pancreas"};
    private int[] img={
            R.drawable.brain,
            R.drawable.eye,
            R.drawable.ear,
            R.drawable.neck,
            R.drawable.heart2,
            R.drawable.kideny,
            R.drawable.liver,
            R.drawable.pancrea
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        re= findViewById(R.id.re_layout);
        re.setHasFixedSize(true);
        re.setLayoutManager(new LinearLayoutManager(this));
//        re.getLayoutManager().setMeasurementCacheEnabled(true);

  
        myadpt =new Myadapter(this,medli,this.img);
         re.setAdapter(myadpt);
    }
}

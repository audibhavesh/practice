package com.example.user.practice;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class seconlist extends AppCompatActivity {
    private RecyclerView re;
    private RecyclerView.Adapter myadpt;
    private String[] brain = {"CNS", "PNS", "ANS"};
    private String[] eyes = {"Introduction", "Internal", "External", "eyes"};
    private String[] ear = {"Introduction", "Internal", "External", "ear"};
    private String[] neck = {"Introduction", "Internal", "External", "neck"};
    private String[] heart = {
            "Introduction",
            "Internal",
            "External",
            "Auricles",
            "Ventricles",
            "Heart Beat",
            "Conducting System",
            "Working",
            "Double Circulation",
            "Blood Pressure"};
    private String[] kideny = {"Introduction", "Internal", "External", "kideny"};
    private String[] liver = {"Introduction", "Internal", "External", "liver"};
    private String[] pancreas = {"Introduction", "Internal", "External", "pancreas"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconlist);
        re = (RecyclerView) findViewById(R.id.sub_re);
        re.setHasFixedSize(true);
        re.setLayoutManager(new LinearLayoutManager(this));
//        re.getLayoutManager().setMeasurementCacheEnabled(true);
        Bundle b = getIntent().getExtras();
        int ch = b.getInt("key");
        switch (ch) {
            case 0:
                myadpt = new Myadapter2(this, brain);
                break;

            case 1:
                myadpt = new Myadapter2(this, eyes);
                break;

            case 2:
                myadpt = new Myadapter2(this, ear);
                break;

            case 3:
                myadpt = new Myadapter2(this, neck);
                break;

            case 4:
                myadpt = new Myadapter2(this, heart);
                break;

            case 5:
                myadpt = new Myadapter2(this, kideny);
                break;

            case 6:
                myadpt = new Myadapter2(this, liver);
                break;

            case 7:
                myadpt = new Myadapter2(this, pancreas);
                break;

        }

        re.setAdapter(myadpt);
////        Fragment myFragment = new secondlist();
//        this.getSupportFragmentManager().beginTransaction().replace(R.id.frame, myFragment).addToBackStack(null).commit();
    }
}

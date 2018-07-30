package com.example.user.practice;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class seconlist extends AppCompatActivity {
    private RecyclerView re;
    private RecyclerView.Adapter myadpt;
    private String[] medli = {"Introduction", "internal", "external", "circulation", "sense", "kideny", "liver", "leg"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconlist);
        re= (RecyclerView)findViewById(R.id.sub_re);
        re.setHasFixedSize(true);
        re.setLayoutManager(new LinearLayoutManager(this));
//        re.getLayoutManager().setMeasurementCacheEnabled(true);


        myadpt =new Myadapter2(this,medli);
        re.setAdapter(myadpt);
////        Fragment myFragment = new secondlist();
//        this.getSupportFragmentManager().beginTransaction().replace(R.id.frame, myFragment).addToBackStack(null).commit();
    }
}

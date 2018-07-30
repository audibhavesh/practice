package com.example.user.practice;


import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Context;


import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {
    String medli[];
    Context context;
    Context context2;
    FragmentManager manager;
    int img[];
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_list_layout, parent, false);
        return new ViewHolder(v);
    }

    public Myadapter(Context context, String[] medli,int[] img) {
        this.context = context;
        this.medli = medli;
        this.img=img;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.t.setText(medli[position]);
        holder.img.setImageResource(img[position]);
        final String TAG = "MyActivity";

        holder.l.setOnClickListener(new View.OnClickListener() {
            Intent intent;
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "you clicked " + medli[position], Toast.LENGTH_SHORT).show();
                switch (position){
                    case 4:
                        intent=new Intent(context,seconlist.class);
                        context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return medli.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView t;
        LinearLayout l;
        ImageView img;
        public ViewHolder(View itemView) {

            super(itemView);
            t = (TextView) itemView.findViewById(R.id.title);
            l = (LinearLayout) itemView.findViewById(R.id.linear);
            img=(ImageView)itemView.findViewById(R.id.img);
//            itemView.setClickable(true);
        }


    }
}

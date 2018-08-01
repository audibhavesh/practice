package com.example.user.practice;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Myadapter2 extends RecyclerView.Adapter<Myadapter2.ViewHolder> {
    String medli2[];
    Context context;
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler2,parent,false);
        return new ViewHolder(v);
    }
     public Myadapter2(Context context, String[] medli2){
        this.context=context;
        this.medli2=medli2;
     }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.t.setText(medli2[position]);
//        holder.l.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context,"you clicked "+medli2[position],Toast.LENGTH_SHORT).show();
//
//
//
//
//            }
//        });
        holder.l.setOnClickListener(new View.OnClickListener() {
            Intent intent;
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "you clicked " + medli2[position], Toast.LENGTH_SHORT).show();
                switch (position){
                    case 0:
                        intent=new Intent(context,openlistactivity.class);
                        context.startActivity(intent);

//                    case 1:
//                        intent=new Intent(context,openlistactivity.class);
//                        intent.putExtra("internal","");
//                        context.startActivity(intent);
                }
            }
        });
}

    @Override
    public int getItemCount() {
        return medli2.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView t;
        LinearLayout l;
        public ViewHolder(View itemView) {

            super(itemView);
            t=(TextView)itemView.findViewById(R.id.subtitle);
            l=(LinearLayout)itemView.findViewById(R.id.linear2);

        }
    }
}

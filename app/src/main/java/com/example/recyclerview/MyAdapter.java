package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[], data2[] , data3[] , data4[];
    int images[];
    Context context;

    public MyAdapter( Context ct, String s1[],String s2[],String s3[], String s4[], int img[] ){
        context = ct;
        data1 =s1;
        data2 = s2;
        data3 = s3;
        data4 =s4;
        images = img;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder( @NonNull MyViewHolder holder, int position ) {
        holder.mytext1.setText(data1[position]);
        holder.mytext2.setText(data2[position]);
        holder.mytext3.setText(data3[position]);
        holder.mytext4.setText(data4[position]);
        holder.myimagView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView mytext1,mytext2,mytext3,mytext4;
        ImageView myimagView;
        public MyViewHolder( @NonNull View itemView ) {
            super(itemView);
            mytext1 = itemView.findViewById(R.id.mytext1);
            mytext2 = itemView.findViewById(R.id.mytext2);
            mytext4 = itemView.findViewById(R.id.mytext4);
            mytext3 = itemView.findViewById(R.id.mytext3);
            myimagView = itemView.findViewById(R.id.myimagView);
        }
    }
}

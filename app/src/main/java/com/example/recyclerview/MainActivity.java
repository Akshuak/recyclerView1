package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
     RecyclerView recyclerView;
    String s1[], s2[],s3[], s4[];
    int images[] = {R.drawable.i, R.drawable.a, R.drawable.e,
            R.drawable.img_09654, R.drawable.o,R.drawable.q, R.drawable.w};


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        s1 = getResources().getStringArray(R.array.programming_languages);
        s2 = getResources().getStringArray(R.array.description);
        s3 = getResources().getStringArray(R.array.Page);
        s4 = getResources().getStringArray(R.array.About);

        MyAdapter myAdapter = new MyAdapter(this,s1, s2,s3,s4, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
package com.geektech.lesson3_4_kutman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        ArrayList<String> names = new ArrayList<>();
        names.add("Kutman");
        names.add("Kutman");
        names.add("Kutman");
        names.add("Kutman");
        names.add("Kutman");
        names.add("Kutman");
        names.add("Kutman");
        names.add("Kutman");
        names.add("Kutman");
        names.add("Kutman");
        names.add("Kutman");
        names.add("Kutman");
        names.add("Kutman");
        names.add("Kutman");
        names.add("Kutman");
        NameAdapter adapter = new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}
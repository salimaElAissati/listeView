package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ListView listView = (ListView) findViewById(R.id.listView);



    Article article1 = new Article(1, "pain", 2);
    Article article2 = new Article(2, "apple", 12);
    Article article3 = new Article(3, "banana", 5);

    Article[] articles = new Article[]{article1, article2, article3};


    // android.R.layout.simple_list_item_1 is a constant predefined layout of Android.
    // used to create a ListView with simple ListItem (Only one TextView).

//    ArrayAdapter<Article> arrayAdapter = new ArrayAdapter<Article>(this, android.R.layout.simple_list_item_1 , articles);
//    listView.setAdapter(arrayAdapter);
    ArrayAdapter <Article> arrayAdapter =
            new ArrayAdapter<Article>(this, android.R.layout.simple_list_item_1,articles);
    listView.setAdapter(arrayAdapter);



}



package com.example.abdulrahman.project4;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<Songster> songsters=new ArrayList<>();
        songsters.add(new Songster("Mohamed abdo","Saudi Arabia",68,"2017",R.drawable.mod,1,""));
        songsters.add(new Songster("Talal maddah","Saudi Arabia",60,"1998",R.drawable.tall,2,"2000"));
        songsters.add(new Songster("om kalthoum","Egypt",78,"1974",R.drawable.omklo,3,"1975"));
        songsters.add(new Songster("Abdel halim","Egypt",47,"1889",R.drawable.halem,3,"1977"));

        GridView albom=(GridView) findViewById(R.id.grid);
        AdapterAlbom adapterAlbom=new AdapterAlbom(this,songsters);
        albom.setAdapter(adapterAlbom);

        albom.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Songster songs=songsters.get(i);
                Intent intent=new Intent(MainActivity.this,Albom.class);
                intent.putExtra("name",songs.getName());
                intent.putExtra("country",songs.getCountry());
                intent.putExtra("lastalbom",songs.getLastAlbom());
                intent.putExtra("age",songs.getAge());
                intent.putExtra("image",songs.getImage());
                intent.putExtra("id",songs.getId());
                intent.putExtra("dead",songs.getDead());
                startActivity(intent);
            }
        });

    }
}

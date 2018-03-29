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
        final ArrayList<Songster> songsterArrayList = new ArrayList<>();
        songsterArrayList.add(new Songster("Mohamed abdo", "Saudi Arabia", 68, "2017", R.drawable.mod, 1, ""));
        songsterArrayList.add(new Songster("Talal maddah", "Saudi Arabia", 60, "1998", R.drawable.tall, 2, "2000"));
        songsterArrayList.add(new Songster("om kalthoum", "Egypt", 78, "1974", R.drawable.omklo, 3, "1975"));
        songsterArrayList.add(new Songster("Abdel halim", "Egypt", 47, "1889", R.drawable.halem, 3, "1977"));

        GridView albom = (GridView) findViewById(R.id.grid);
        AdapterAlbom adapterAlbom = new AdapterAlbom(this, songsterArrayList);
        albom.setAdapter(adapterAlbom);

        albom.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Songster songs = songsterArrayList.get(i);
                Intent albomIntent = new Intent(MainActivity.this, Albom.class);
                albomIntent.putExtra("name", songs.getName());
                albomIntent.putExtra("country", songs.getCountry());
                albomIntent.putExtra("lastalbom", songs.getLastAlbom());
                albomIntent.putExtra("age", songs.getAge());
                albomIntent.putExtra("image", songs.getImage());
                albomIntent.putExtra("id", songs.getId());
                albomIntent.putExtra("dead", songs.getDead());
                startActivity(albomIntent);
            }
        });

    }
}

package com.example.abdulrahman.project4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class song extends AppCompatActivity {
    String songName;
    int image;
    ArrayList<SongsItem> arrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        arrayList = new ArrayList<>();
        image = getIntent().getExtras().getInt("images");
        int id = getIntent().getExtras().getInt("id");
        String year = getIntent().getExtras().getString("years");
        addSong(id, year);
        listView = (ListView) findViewById(R.id.list_song);
        AdpaterSong adpaterSong = new AdpaterSong(this, arrayList);
        listView.setAdapter(adpaterSong);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                songName = arrayList.get(i).getSong();
                Toast.makeText(getApplicationContext(), songName + " is play", Toast.LENGTH_LONG).show();
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                startActivity(new Intent(song.this,MainActivity.class));
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void playSong(View view) {
        Toast.makeText(getApplicationContext(), songName + " is play", Toast.LENGTH_LONG).show();
    }

    public void stopSong(View view) {
        Toast.makeText(getApplicationContext(), songName + " is stop", Toast.LENGTH_LONG).show();
    }

    public void addSong(int idSong, String year) {
        if (idSong == 1) {
            if (year.equals("2017")) {
                arrayList.add(new SongsItem("song 1", 2017, image));
                arrayList.add(new SongsItem("song 2", 2017, image));
                arrayList.add(new SongsItem("song 3", 2017, image));
                arrayList.add(new SongsItem("song 4", 2017, image));
                arrayList.add(new SongsItem("song 5", 2017, image));
                arrayList.add(new SongsItem("song 6", 2017, image));
                arrayList.add(new SongsItem("song 7", 2017, image));
                arrayList.add(new SongsItem("song 8", 2017, image));
                arrayList.add(new SongsItem("song 9", 2017, image));
                arrayList.add(new SongsItem("song 10", 2017, image));
            } else if (year.equals("2016")) {
                arrayList.add(new SongsItem("song 1", 2016, image));
                arrayList.add(new SongsItem("song 2", 2016, image));
                arrayList.add(new SongsItem("song 3", 2016, image));
                arrayList.add(new SongsItem("song 4", 2016, image));
                arrayList.add(new SongsItem("song 5", 2016, image));
                arrayList.add(new SongsItem("song 6", 2016, image));
                arrayList.add(new SongsItem("song 7", 2016, image));
                arrayList.add(new SongsItem("song 8", 2016, image));
                arrayList.add(new SongsItem("song 9 ", 2016, image));
                arrayList.add(new SongsItem("song 10", 2016, image));

            } else if (year.equals("2015")) {
                arrayList.add(new SongsItem("song 1", 2015, image));
                arrayList.add(new SongsItem("song 2", 2015, image));
                arrayList.add(new SongsItem("song 3", 2015, image));
                arrayList.add(new SongsItem("song 4", 2015, image));
                arrayList.add(new SongsItem("song 5", 2015, image));
                arrayList.add(new SongsItem("song 6", 2015, image));
                arrayList.add(new SongsItem("song 7", 2015, image));
                arrayList.add(new SongsItem("song 8", 2015, image));
                arrayList.add(new SongsItem("song 9 ", 2015, image));
                arrayList.add(new SongsItem("song 10", 2015, image));

            }
        } else if (idSong == 2) {
            if (year.equals("1993")) {
                arrayList.add(new SongsItem("song 1", 1993, image));
                arrayList.add(new SongsItem("song 2", 1993, image));
                arrayList.add(new SongsItem("song 3", 1993, image));
                arrayList.add(new SongsItem("song 4", 1993, image));
                arrayList.add(new SongsItem("song 5", 1993, image));
                arrayList.add(new SongsItem("song 6", 1993, image));
                arrayList.add(new SongsItem("song 7", 1993, image));
                arrayList.add(new SongsItem("song 8", 1993, image));
                arrayList.add(new SongsItem("song 9 ", 1993, image));
                arrayList.add(new SongsItem("song 10", 1993, image));
            } else if (year.equals("1992")) {
                arrayList.add(new SongsItem("song 1", 1992, image));
                arrayList.add(new SongsItem("song 2", 1992, image));
                arrayList.add(new SongsItem("song 3", 1992, image));
                arrayList.add(new SongsItem("song 4", 1992, image));
                arrayList.add(new SongsItem("song 5", 1992, image));
                arrayList.add(new SongsItem("song 6", 1992, image));
                arrayList.add(new SongsItem("song 7", 1992, image));
                arrayList.add(new SongsItem("song 8", 1992, image));
                arrayList.add(new SongsItem("song 9 ", 1992, image));
                arrayList.add(new SongsItem("song 10", 1992, image));
            } else if (year.equals("1995")) {
                arrayList.add(new SongsItem("song 1", 1995, image));
                arrayList.add(new SongsItem("song 2", 1995, image));
                arrayList.add(new SongsItem("song 3", 1995, image));
                arrayList.add(new SongsItem("song 4", 1995, image));
                arrayList.add(new SongsItem("song 5", 1995, image));
                arrayList.add(new SongsItem("song 6", 1995, image));
                arrayList.add(new SongsItem("song 7", 1995, image));
                arrayList.add(new SongsItem("song 8", 1995, image));
                arrayList.add(new SongsItem("song 9 ", 1995, image));
                arrayList.add(new SongsItem("song 10", 1995, image));

            }
        } else if (idSong == 3) {
            if (year.equals("1970")) {
                arrayList.add(new SongsItem("song 1", 1970, image));
                arrayList.add(new SongsItem("song 2", 1970, image));
                arrayList.add(new SongsItem("song 3", 1970, image));
                arrayList.add(new SongsItem("song 4", 1970, image));
                arrayList.add(new SongsItem("song 5", 1970, image));
                arrayList.add(new SongsItem("song 6", 1970, image));
                arrayList.add(new SongsItem("song 7", 1970, image));
                arrayList.add(new SongsItem("song 8", 1970, image));
                arrayList.add(new SongsItem("song 9 ", 1970, image));
                arrayList.add(new SongsItem("song 10", 1970, image));
            } else if (year.equals("1969")) {
                arrayList.add(new SongsItem("song 1", 1969, image));
                arrayList.add(new SongsItem("song 2", 1969, image));
                arrayList.add(new SongsItem("song 3", 1969, image));
                arrayList.add(new SongsItem("song 4", 1969, image));
                arrayList.add(new SongsItem("song 5", 1969, image));
                arrayList.add(new SongsItem("song 6", 1969, image));
                arrayList.add(new SongsItem("song 7", 1969, image));
                arrayList.add(new SongsItem("song 8", 1969, image));
                arrayList.add(new SongsItem("song 9 ", 1969, image));
                arrayList.add(new SongsItem("song 10", 1969, image));
            } else if (year.equals("1968")) {
                arrayList.add(new SongsItem("song 1", 1968, image));
                arrayList.add(new SongsItem("song 2", 1968, image));
                arrayList.add(new SongsItem("song 3", 1968, image));
                arrayList.add(new SongsItem("song 4", 1968, image));
                arrayList.add(new SongsItem("song 5", 1968, image));
                arrayList.add(new SongsItem("song 6", 1968, image));
                arrayList.add(new SongsItem("song 7", 1968, image));
                arrayList.add(new SongsItem("song 8", 1968, image));
                arrayList.add(new SongsItem("song 9 ", 1968, image));
                arrayList.add(new SongsItem("song 10", 1968, image));

            }

        } else if (idSong == 4) {
            if (year.equals("1970")) {
                arrayList.add(new SongsItem("song 1", 1970, image));
                arrayList.add(new SongsItem("song 2", 1970, image));
                arrayList.add(new SongsItem("song 3", 1970, image));
                arrayList.add(new SongsItem("song 4", 1970, image));
                arrayList.add(new SongsItem("song 5", 1970, image));
                arrayList.add(new SongsItem("song 6", 1970, image));
                arrayList.add(new SongsItem("song 7", 1970, image));
                arrayList.add(new SongsItem("song 8", 1970, image));
                arrayList.add(new SongsItem("song 9 ", 1970, image));
                arrayList.add(new SongsItem("song 10", 1970, image));
            } else if (year.equals("1969")) {
                arrayList.add(new SongsItem("song 1", 1969, image));
                arrayList.add(new SongsItem("song 2", 1969, image));
                arrayList.add(new SongsItem("song 3", 1969, image));
                arrayList.add(new SongsItem("song 4", 1969, image));
                arrayList.add(new SongsItem("song 5", 1969, image));
                arrayList.add(new SongsItem("song 6", 1969, image));
                arrayList.add(new SongsItem("song 7", 1969, image));
                arrayList.add(new SongsItem("song 8", 1969, image));
                arrayList.add(new SongsItem("song 9 ", 1969, image));
                arrayList.add(new SongsItem("song 10", 1969, image));
            } else if (year.equals("1968")) {
                arrayList.add(new SongsItem("song 1", 1968, image));
                arrayList.add(new SongsItem("song 2", 1968, image));
                arrayList.add(new SongsItem("song 3", 1968, image));
                arrayList.add(new SongsItem("song 4", 1968, image));
                arrayList.add(new SongsItem("song 5", 1968, image));
                arrayList.add(new SongsItem("song 6", 1968, image));
                arrayList.add(new SongsItem("song 7", 1968, image));
                arrayList.add(new SongsItem("song 8", 1968, image));
                arrayList.add(new SongsItem("song 9 ", 1968, image));
                arrayList.add(new SongsItem("song 10", 1968, image));

            }

        }
    }
}

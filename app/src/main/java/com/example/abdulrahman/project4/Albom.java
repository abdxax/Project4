package com.example.abdulrahman.project4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Albom extends AppCompatActivity {
    ImageView imageView;
    TextView nameT;
    TextView countryT;
    TextView ageT;
    TextView lastAlbomT;
    TextView dead;
    String[] years;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albom);
        String name = getIntent().getExtras().getString("name");
        String country = getIntent().getExtras().getString("country");
        int age = getIntent().getExtras().getInt("age");
        String lastalbom = getIntent().getExtras().getString("lastalbom");
        final int image = getIntent().getExtras().getInt("image");
        final int id = getIntent().getExtras().getInt("id");
        String deads = getIntent().getExtras().getString("dead");
        addYears(id);
        imageView = (ImageView) findViewById(R.id.imageView2);
        nameT = (TextView) findViewById(R.id.textView2);
        countryT = (TextView) findViewById(R.id.textView3);
        ageT = (TextView) findViewById(R.id.textView4);
        lastAlbomT = (TextView) findViewById(R.id.textView5);
        dead = (TextView) findViewById(R.id.textView6);
        ListView listView = (ListView) findViewById(R.id.list_year);
        ArrayAdapter<String> yearsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, years);
        imageView.setImageResource(image);
        nameT.setText("Name: " + name);
        countryT.setText("Country: " + country);
        ageT.setText("Age: " + age);
        lastAlbomT.setText("Last Albom: " + lastalbom);
        dead.setText("Death: " + deads + "-");
        listView.setAdapter(yearsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent songIntent = new Intent(Albom.this, song.class);
                songIntent.putExtra("years", years[i]);
                songIntent.putExtra("id", id);
                songIntent.putExtra("images", image);
                startActivity(songIntent);
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
                startActivity(new Intent(Albom.this,MainActivity.class));
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void addYears(int ids) {
        if (ids == 1) {

            String[] y = {"2017", "2016", "2015"};
            years = y;
        } else if (ids == 2) {
            String[] y = {"1993", "1992", "1995"};
            years = y;
        } else if (ids == 3) {
            String[] y = {"1970", "1969", "1968"};
            years = y;
        } else if (ids == 4) {
            String[] y = {"1975", "1974", "1972"};
            years = y;
        }

    }
}

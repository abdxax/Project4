package com.example.abdulrahman.project4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Abdulrahman on 29/03/18.
 */

public class AdpaterSong extends ArrayAdapter<Songs> {

    ArrayList<Songs> songs;

    public AdpaterSong(@NonNull Context context,  ArrayList<Songs> songs) {
        super(context, 0,songs);
        this.songs = songs;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(getContext());
        View view=inflater.inflate(R.layout.list_songdis,parent,false);
        ImageView imageView=(ImageView) view.findViewById(R.id.imageView3);
        TextView name=(TextView)view.findViewById(R.id.textView7);
        TextView year=(TextView)view.findViewById(R.id.textView8);
        Songs songs1=songs.get(position);
        imageView.setImageResource(songs1.getImage());
        name.setText(songs1.getSong());
        year.setText(songs1.getYear()+"");
        return view;
    }
}

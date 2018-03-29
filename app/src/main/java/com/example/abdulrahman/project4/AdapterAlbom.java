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
 * Created by Abdulrahman on 28/03/18.
 */

public class AdapterAlbom extends ArrayAdapter<Songster> {
    ArrayList<Songster> songsters;

    public AdapterAlbom(@NonNull Context context, ArrayList<Songster> songsters) {
        super(context, 0, songsters);
        this.songsters = songsters;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.list_albom, parent, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView name = (TextView) view.findViewById(R.id.textView);
        imageView.setImageResource(songsters.get(position).getImage());
        name.setText(songsters.get(position).getName());
        return view;
    }
}

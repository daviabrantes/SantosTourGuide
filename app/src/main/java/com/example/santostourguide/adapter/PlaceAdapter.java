package com.example.santostourguide.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.santostourguide.R;
import com.example.santostourguide.model.Place;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(@NonNull Context context, ArrayList<Place> places) {
        super(context,0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_adapter, parent, false);
        }

        Place currentPlace = getItem(position);
        TextView txtTitle = listItemView.findViewById(R.id.title);
        txtTitle.setText(currentPlace.getName());
        TextView txtDescription = listItemView.findViewById(R.id.description);
        txtDescription.setText(currentPlace.getDescription());
        ImageView imgPlace = listItemView.findViewById(R.id.image);
        imgPlace.setImageResource(currentPlace.getImage());
        return listItemView;
    }
}

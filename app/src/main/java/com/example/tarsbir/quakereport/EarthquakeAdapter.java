package com.example.tarsbir.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
     EarthquakeAdapter(@NonNull Context context, List<Earthquake> earthquakes) {
        super(context,0,earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_listitem,parent,false);
        }
        Earthquake currentEarthquake = getItem(position);
        TextView magnitude= listItemView.findViewById(R.id.magnitude);
        magnitude.setText(currentEarthquake.getMagnitude());
        TextView location= listItemView.findViewById(R.id.location);
        location.setText(currentEarthquake.getLocation());
        TextView date = listItemView.findViewById(R.id.date);
        date.setText(currentEarthquake.getDate());
        return listItemView;
    }
}

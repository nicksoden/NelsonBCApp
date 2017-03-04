package com.example.android.nelsonbcapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nicholas Soden on 2017-03-02.
 */

public class PlacesAdapter extends ArrayAdapter<Places> {

    /**Resource ID for the background color for this list of words*/
    private int mColorResourceId;
    /**
     * Create a new {@link PlacesAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Places}s to be displayed.
     */
    public PlacesAdapter(Context context, ArrayList<Places> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Places currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the Places name from the currentPlace object and set this text on
        // the name TextView.
        nameTextView.setText(currentPlace.getPlaceName());

        // Find the TextView in the list_item.xml layout with the ID address_text_view.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the Places address from the currentPlace object and set this text on
        // the address TextView.
        addressTextView.setText(currentPlace.getPlaceAddress());

        // Find the TextView in the list_item.xml layout with the ID hours_text_view.
        TextView hoursTextView = (TextView) listItemView.findViewById(R.id.hours_text_view);
        // Get the Places hours from the currentPlace object and set this text on
        // the hours TextView.
        hoursTextView.setText(currentPlace.getPlaceHours());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentPlace.getPlaceImage());

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;

    }
    }

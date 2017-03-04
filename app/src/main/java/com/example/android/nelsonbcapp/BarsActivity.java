package com.example.android.nelsonbcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nicholas Soden on 2017-03-02.
 */


public class BarsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        String finleysName = getResources().getString(R.string.finleys_name);
        String finleysAddress = getResources().getString(R.string.finleys_address);
        String finleysHours = getResources().getString(R.string.finleys_hours);

        String mikesName = getResources().getString(R.string.mikes_name);
        String mikesAddress = getResources().getString(R.string.mikes_address);
        String mikesHours = getResources().getString(R.string.mikes_hours);

        String uptownName = getResources().getString(R.string.uptown_name);
        String uptownAddress = getResources().getString(R.string.uptown_address);
        String uptownHours = getResources().getString(R.string.uptown_hours);

        String spiritName = getResources().getString(R.string.spirit_name);
        String spiritAddress = getResources().getString(R.string.spirit_address);
        String spiritHours = getResources().getString(R.string.spirit_hours);

        String bloomName = getResources().getString(R.string.bloom_name);
        String bloomAddress = getResources().getString(R.string.bloom_address);
        String bloomHours = getResources().getString(R.string.bloom_hours);

        // Create a list of places
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(finleysName, finleysAddress, finleysHours, R.drawable.finleys));
        places.add(new Places(mikesName, mikesAddress, mikesHours, R.drawable.mikesplace));
        places.add(new Places(uptownName, uptownAddress, uptownHours, R.drawable.uptown));
        places.add(new Places(spiritName, spiritAddress, spiritHours, R.drawable.spiritlounge));
        places.add(new Places(bloomName, bloomAddress, bloomHours, R.drawable.bloom));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s
        PlacesAdapter adapter = new PlacesAdapter(this, places, R.color.tan_background);

        ListView listView = (ListView) findViewById(R.id.lister);

        listView.setAdapter(adapter);

        //*Home* activity intent
        TextView home = (TextView) findViewById(R.id.home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(BarsActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(homeIntent);
            }
        });


        // Find the View that shows the *cafes* activity
        TextView cafes = (TextView) findViewById(R.id.cafes);

        // Set a click listener on that View
        cafes.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(BarsActivity.this, cafesActivity.class);
                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the dining activity
        TextView dining = (TextView) findViewById(R.id.dining_activity);

        // Set a click listener on that View
        dining.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent dining2Intent = new Intent(BarsActivity.this, DiningActivity.class);

                //  Start the new activity
                startActivity(dining2Intent);
            }
        });

        // Find the View that shows the attractions activity
        TextView attractions = (TextView) findViewById(R.id.attractions_activity);

        // Set a click listener on that View
        attractions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent dining2Intent = new Intent(BarsActivity.this, AttractionsActivity.class);

                // Start the new activity
                startActivity(dining2Intent);
            }
        });


    }
}

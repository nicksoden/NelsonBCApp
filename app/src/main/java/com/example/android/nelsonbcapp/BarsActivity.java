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


        // Create a list of words
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places("Finley's Irish Bar and Grill", "705 Vernon St, Nelson", "Mon-Sun: 10am-2am", R.drawable.finleys));
        places.add(new Places("Mike's Place Pub", "422 Verson St, Nelson", "Mon-Thurs: 11am-12am, Fri-Sat: 11:30am-1:30am", R.drawable.mikesplace));
        places.add(new Places("Uptown Tavern", "616 Vernon St, Nelson", "Mon-Sun: 11am-1:30am",  R.drawable.uptown));
        places.add(new Places("Spirit Lounge", "422 Vernon St", "Changing Hours", R.drawable.spiritlounge));
        places.add(new Places("Bloom NightClub", "198 Baker St", "Thurs-Sat: 10pm-2am", R.drawable.bloom));

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

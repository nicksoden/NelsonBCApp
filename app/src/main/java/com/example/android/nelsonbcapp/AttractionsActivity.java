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



public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of words
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places("WhiteWater Ski Resort", "1 Whitewater Rd, BC", "Winter--Mon-Sun: 8:30am-5pm ", R.drawable.whitewater));
        places.add(new Places("Cottonwood Fall Park", "199 Carbonate St, Nelson", "Mon-Sun: 6am - 11pm", R.drawable.cottonwood));
        places.add(new Places("Lakeside Park", "Alonside Lakeside Drive and the Lake", "Mon-Sun: 8am-11pm", R.drawable.beach));
        places.add(new Places("Gyro Park", "298 Richards St, Nelson", "Mon-Sun: 8am-11pm", R.drawable.gyropark));
        places.add(new Places("Civic Center", "305 Hall St, Nelson", "Mon-Sun: 6am-9pm", R.drawable.civiccenter));

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
                Intent homeIntent = new Intent(AttractionsActivity.this, MainActivity.class);
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
                Intent numbersIntent = new Intent(AttractionsActivity.this, cafesActivity.class);
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
                Intent dining2Intent = new Intent(AttractionsActivity.this, DiningActivity.class);

                // Start the new activity
                startActivity(dining2Intent);
            }
        });

        // Find the View that shows the bars activity
        TextView bars = (TextView) findViewById(R.id.bars_activity);

        // Set a click listener on that View
        bars.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent diningIntent = new Intent(AttractionsActivity.this, BarsActivity.class);

                // Start the new activity
                startActivity(diningIntent);
            }
        });

    }
}
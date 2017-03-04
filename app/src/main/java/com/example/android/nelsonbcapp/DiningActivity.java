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



public class DiningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of words
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places("Outer Clove Restaurant", "536 Stanley, Nelson", "Mon: closed, Tues-Sun: 11:30am-8:30pm", R.drawable.outerclove));
        places.add(new Places("Yellow Deli", "202 Vernon St, Nelson", "Mon-Thurs: 24hrs, Fri: 12am-3pm, Sat-Sun: Closed", R.drawable.yellowdeli));
        places.add(new Places("Cantina Del Centro", "561 Baker St, Nelson", "Sun-Thurs: 11:30am-11pm, Fr: 11:30sm-12am, Sat: 11am-12am", R.drawable.cantina));
        places.add(new Places("El Taco","306 Victoria St, Nelson", "Sun-Wed: 11am-8pm, Thurs-Sat: 11am-9pm", R.drawable.eltaco));
        places.add(new Places("Thor's Pizza", "303 Victoria St, Nelson", "Mon-Thurs: 11am - 10pm, Fri-Sat: 11am-12am, Sun: 4-9pm", R.drawable.thors));

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
                Intent homeIntent = new Intent(DiningActivity.this, MainActivity.class);
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
                Intent numbersIntent = new Intent(DiningActivity.this, cafesActivity.class);
                // Start the new activity
                startActivity(numbersIntent);
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
                Intent diningIntent = new Intent(DiningActivity.this, BarsActivity.class);

                // Start the new activity
                startActivity(diningIntent);
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
                Intent dining2Intent = new Intent(DiningActivity.this, AttractionsActivity.class);

                // Start the new activity
                startActivity(dining2Intent);
            }
        });


    }
}

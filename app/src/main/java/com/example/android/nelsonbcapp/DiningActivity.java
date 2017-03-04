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

        String outerCloveName = getResources().getString(R.string.outer_clove_name);
        String outerCloveAddress = getResources().getString(R.string.outer_clove_address);
        String outerCloveHours = getResources().getString(R.string.outer_clove_hours);

        String yellowDeliName = getResources().getString(R.string.yellow_deli_name);
        String yellowDeliAddress = getResources().getString(R.string.yellow_deli_address);
        String yellowDeliHours = getResources().getString(R.string.yellow_deli_hours);

        String cantinaName = getResources().getString(R.string.cantina_name);
        String cantinaAddress = getResources().getString(R.string.cantina_address);
        String cantinaHours = getResources().getString(R.string.cantina_hours);

        String elTacoName = getResources().getString(R.string.taco_name);
        String elTacoAddress = getResources().getString(R.string.taco_address);
        String elTacoHours = getResources().getString(R.string.taco_hours);

        String thorsName = getResources().getString(R.string.thors_name);
        String thorsAddress = getResources().getString(R.string.thors_address);
        String thorsHours = getResources().getString(R.string.thors_hours);


        // Create a list of places
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(outerCloveName, outerCloveAddress, outerCloveHours, R.drawable.outerclove));
        places.add(new Places(yellowDeliName, yellowDeliAddress, yellowDeliHours, R.drawable.yellowdeli));
        places.add(new Places(cantinaName, cantinaAddress, cantinaHours, R.drawable.cantina));
        places.add(new Places(elTacoName, elTacoAddress, elTacoHours, R.drawable.eltaco));
        places.add(new Places(thorsName, thorsAddress, thorsHours, R.drawable.thors));

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

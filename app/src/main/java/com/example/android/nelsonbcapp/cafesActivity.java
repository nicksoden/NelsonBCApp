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


public class cafesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        String osoNegroName = getResources().getString(R.string.oso_name);
        String osoNegroAddress = getResources().getString(R.string.oso_address);
        String osoNegroHours = getResources().getString(R.string.oso_hours);

        String johnWardName = getResources().getString(R.string.john_name);
        String johnWardAddress = getResources().getString(R.string.john_address);
        String johnWardHours = getResources().getString(R.string.john_hours);

        String sidewindersName = getResources().getString(R.string.sidewinders_name);
        String sidewindersAddress = getResources().getString(R.string.sidewinders_address);
        String sidewindersHours = getResources().getString(R.string.sidewinders_hours);

        String empireName = getResources().getString(R.string.empire_name);
        String empireAddress = getResources().getString(R.string.empire_address);
        String empireHours = getResources().getString(R.string.empire_hours);

        String dominionName = getResources().getString(R.string.dominion_name);
        String dominionAddress = getResources().getString(R.string.dominion_address);
        String dominionHours = getResources().getString(R.string.dominion_hours);

        // Create a list of places
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(osoNegroName, osoNegroAddress, osoNegroHours, R.drawable.osonegro));
        places.add(new Places(johnWardName, johnWardAddress, johnWardHours, R.drawable.johnward));
        places.add(new Places(sidewindersName, sidewindersAddress, sidewindersHours, R.drawable.sidewinder));
        places.add(new Places(empireName, empireAddress, empireHours, R.drawable.empire));
        places.add(new Places(dominionName, dominionAddress, dominionHours, R.drawable.dominion));

        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Places}s
        PlacesAdapter adapter = new PlacesAdapter(this, places, R.color.tan_background);

        ListView listView = (ListView) findViewById(R.id.lister);

        listView.setAdapter(adapter);


        // Find the View that shows the numbers activity
        TextView home = (TextView) findViewById(R.id.home);
        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent homeIntent = new Intent(cafesActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });

        // Find the View that shows the dining activity
        TextView dining2 = (TextView) findViewById(R.id.dining_activity);

        // Set a click listener on that View
        dining2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent dining2Intent = new Intent(cafesActivity.this, DiningActivity.class);

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
                Intent diningIntent = new Intent(cafesActivity.this, BarsActivity.class);

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
                Intent dining2Intent = new Intent(cafesActivity.this, AttractionsActivity.class);

                // Start the new activity
                startActivity(dining2Intent);
            }
        });


    }
}



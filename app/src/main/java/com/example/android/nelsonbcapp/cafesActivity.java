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

        // Create a list of words
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places("Oso Negro Coffee", "604 Ward St, Nelson", "M-Sa: 7am-6p, Sun: 7am-6pm", R.drawable.osonegro));
        places.add(new Places("John Ward Fine Coffee", "503 Baker St, Nelson", "M-Sa: 6:30am-5:30pm, Sun: 7am-4:30pm", R.drawable.johnward));
        places.add(new Places("Sidewinders Coffee Co", "696 Baker St, Nelson", "M-Sun: 6:30am-5pm", R.drawable.sidewinder));
        places.add(new Places("Empire Coffee", "616 Vernon St, Nelson", "M-F: 6am-9pm, Sa-Sun:7am-8pm", R.drawable.empire));
        places.add(new Places("Dominion Cafe", "334 Baker St, Nelson", "M-Sun: 7am-5:30pm", R.drawable.dominion));

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



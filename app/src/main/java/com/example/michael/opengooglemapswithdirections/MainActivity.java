package com.example.michael.opengooglemapswithdirections;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //opens up google maps with the
    //directions to monte vista
    public void openMaps(View v)
    {
        //creates a uri
        Uri gmaIntentUri = Uri.parse("google.navigation:q=a+3131 Stone Valley Rd,Danville,CA 94526&mode=d");

        //creates an intent to open google maps
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmaIntentUri);

        //sets the package to the google maps intent
        mapIntent.setPackage("com.google.android.apps.maps");

        //statement test if the device can handle the google maps intent
        if((mapIntent).resolveActivity(getPackageManager()) != null)
        {
            startActivity(mapIntent);
        }
    }
}

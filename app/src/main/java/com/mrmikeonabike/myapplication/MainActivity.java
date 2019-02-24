package com.mrmikeonabike.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Find the Views that shows each category and set a click listener on that View
        //biographies
        TextView biographies = findViewById(R.id.biographies);
        biographies.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent biographiesIntent = new Intent(MainActivity.this, biographies.class);
                startActivity(biographiesIntent);
            }
        });

        //classics
        TextView classics = findViewById(R.id.classics);
        classics.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent classicsIntent = new Intent(MainActivity.this, classics.class);
                startActivity(classicsIntent);
            }
        });

        //romance
        TextView romance = findViewById(R.id.romance);
        romance.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent romanceIntent = new Intent(MainActivity.this, romance.class);
                startActivity(romanceIntent);
            }
        });

        //science fiction
        TextView sci_fi = findViewById(R.id.sci_fi);
        sci_fi.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sci_fiIntent = new Intent(MainActivity.this, sci_fi.class);
                startActivity(sci_fiIntent);
            }
        });

        //technology
        TextView technology = findViewById(R.id.technology);
        technology.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent technologyIntent = new Intent(MainActivity.this, technology.class);
                startActivity(technologyIntent);
            }
        });

        //travel
        TextView travel = findViewById(R.id.travel);
        travel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent travelIntent = new Intent(MainActivity.this, travel.class);
                startActivity(travelIntent);
            }
        });

        //show the "player"
        Button player = findViewById(R.id.nowPlaying);
        player.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(MainActivity.this, player.class);
                startActivity(playerIntent);
            }
        });

    }
}
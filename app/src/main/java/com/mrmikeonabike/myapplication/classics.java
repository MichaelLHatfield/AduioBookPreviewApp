package com.mrmikeonabike.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class classics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        // Create list of classics
        //todo - get real books and images for each category before copying this code to other java files
        final ArrayList<AudioBookDetails> audiobooks = new ArrayList<>();
        audiobooks.add(new AudioBookDetails("Dodge and Twist", "Tony Lee", "2019", R.drawable.classics_book_1));
        audiobooks.add(new AudioBookDetails("The Hobbit", "J.R.R. Tolken", "2012", R.drawable.classics_book_2));
        audiobooks.add(new AudioBookDetails("The Fellowship of The Ring", "J.R.R. Tolken", "2012", R.drawable.classics_book_3));
        audiobooks.add(new AudioBookDetails("The Great Gatsby", "F. Scott Fitzgerald", "2013", R.drawable.classics_book_4));
        audiobooks.add(new AudioBookDetails("The Song of Achilles", "Madeline Miller", "2012", R.drawable.classics_book_5));
        audiobooks.add(new AudioBookDetails("Oliver Twist", "Charles Dickens", "2018", R.drawable.classics_book_6));

        // Create custom adapter and attached it to the GridView list
        AudioBookDetailsAdapter audiobookAdapter = new AudioBookDetailsAdapter(this, audiobooks);
        GridView list = findViewById(R.id.list);
        list.setAdapter(audiobookAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Creating intent and putting inside it information for the selected item, that retrieved from demo books data array list.
                setContentView(R.layout.activity_book_details);
            }
        });
    }

}

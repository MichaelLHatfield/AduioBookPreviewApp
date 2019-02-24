package com.mrmikeonabike.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class sci_fi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        // Create list of science fiction
        //todo - get real books and images for each category before copying this code to other java files
        final ArrayList<AudioBookDetails> audiobooks = new ArrayList<>();
        audiobooks.add(new AudioBookDetails("Dune", "Frank Herbert", "2005", R.drawable.sci_fi_book_1));
        audiobooks.add(new AudioBookDetails("We Are Legion", "Dennis E. Taylor", "2016", R.drawable.sci_fi_book_2));
        audiobooks.add(new AudioBookDetails("Norse Mythology", "Neil Gaiman", "2017", R.drawable.sci_fi_book_3));
        audiobooks.add(new AudioBookDetails("A Discovery of Witches", "Deborah Harkness", "2011", R.drawable.sci_fi_book_4));
        audiobooks.add(new AudioBookDetails("Good Omens", "Terry Pratchett", "2019", R.drawable.sci_fi_book_5));
        audiobooks.add(new AudioBookDetails("One Second After", "William R. Forstchen", "2019", R.drawable.sci_fi_book_6));

        // Create custom adapter and attached it to the GridView list
        AudioBookDetailsAdapter audiobookAdapter = new AudioBookDetailsAdapter(this, audiobooks);
        GridView list = findViewById(R.id.list);
        list.setAdapter(audiobookAdapter);

        //clicked on book - show details...
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setContentView(R.layout.activity_book_details);
            }
        });
    }

}

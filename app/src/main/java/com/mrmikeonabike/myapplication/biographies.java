package com.mrmikeonabike.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class biographies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        // Create list of biographies
        //todo - get 8 real books and images for each category before copying this code to other java files
        final ArrayList<AudioBookDetails> audiobooks = new ArrayList<>();
        audiobooks.add(new AudioBookDetails("Folsum Untold", "Danny Robins", "2019", R.drawable.biographies_book_1));
        audiobooks.add(new AudioBookDetails("Becoming", "Michelle Obama", "2018", R.drawable.biographies_book_2));
        audiobooks.add(new AudioBookDetails("Can't Hurt Me", "David Coggins", "2016", R.drawable.biographies_book_3));
        audiobooks.add(new AudioBookDetails("Educated", "Tara Westover", "2016", R.drawable.biographies_book_4));
        audiobooks.add(new AudioBookDetails("Born a Crime", "Trevor Noah", "2016", R.drawable.biographies_book_5));
        audiobooks.add(new AudioBookDetails("In My Own Words", "Ruth Bader Ginsburg", "2016", R.drawable.biographies_book_6));
        audiobooks.add(new AudioBookDetails("Five Presidents", "Clint Hill", "2016", R.drawable.biographies_book_7));
        audiobooks.add(new AudioBookDetails("It's Not Supposed to Be This Way", "Lysa TerKeurst", "2018", R.drawable.biographies_book_8));

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

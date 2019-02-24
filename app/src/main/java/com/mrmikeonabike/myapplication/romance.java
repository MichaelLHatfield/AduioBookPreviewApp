package com.mrmikeonabike.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class romance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        // Create list of romance
        //todo - get real books and images for each category before copying this code to other java files
        final ArrayList<AudioBookDetails> audiobooks = new ArrayList<>();
        audiobooks.add(new AudioBookDetails("International Player", "Lousie Bay", "2019", R.drawable.romance_book_1));
        audiobooks.add(new AudioBookDetails("Cake: The Newlyweds", "J. Bengtsson", "2019", R.drawable.romance_book_2));
        audiobooks.add(new AudioBookDetails("Birthday Girl", "Penelope Douglas", "2019", R.drawable.romance_book_3));
        audiobooks.add(new AudioBookDetails("Repeat", "Kylie Scott", "2019", R.drawable.romance_book_4));
        audiobooks.add(new AudioBookDetails("Like the Wind", "J. Bengtsson", "2019", R.drawable.romance_book_5));
        audiobooks.add(new AudioBookDetails("Claimed", "M.Never", "2019", R.drawable.romance_book_6));

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

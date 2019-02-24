package com.mrmikeonabike.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mrmikeonabike.myapplication.AudioBookDetails;
import com.mrmikeonabike.myapplication.R;
import java.util.List;

public class AudioBookDetailsAdapter  extends ArrayAdapter<AudioBookDetails> {

    public AudioBookDetailsAdapter(@NonNull Context context, @NonNull List<AudioBookDetails> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        // Getting the object located at this position in the list
        AudioBookDetails currentAudiobook = getItem(position);

        // Find Views
        ImageView bookCoverImageView =  listItemView.findViewById(R.id.book_cover_image_view);
        TextView bookTitleTextView =  listItemView.findViewById(R.id.book_title_text_view);
        TextView bookAuthorTextView =  listItemView.findViewById(R.id.book_author_text_view);
        TextView bookYearTextView =  listItemView.findViewById(R.id.book_year_text_view);

        // Setting values
        bookCoverImageView.setImageResource(currentAudiobook.getImageResourceId());
        bookTitleTextView.setText(currentAudiobook.getTitle());
        bookAuthorTextView.setText(currentAudiobook.getAuthor());
        bookYearTextView.setText(currentAudiobook.getYear());

        return listItemView;
    }
}
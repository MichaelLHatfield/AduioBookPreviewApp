package com.mrmikeonabike.myapplication;

public class AudioBookDetails {
    private String mTitle;
    private String mAuthor;
    private String mYear;
    private int mImageResourceId;


    public AudioBookDetails(String title, String author, String year, int cover_image) {
        mTitle = title;
        mAuthor = author;
        mYear = year;
        mImageResourceId = cover_image;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getYear() {
        return mYear;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}

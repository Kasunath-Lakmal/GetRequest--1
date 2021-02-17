package com.example.getrequest;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int userId;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    private int id;
    private String title;
    @SerializedName("body")
    private String text;
}

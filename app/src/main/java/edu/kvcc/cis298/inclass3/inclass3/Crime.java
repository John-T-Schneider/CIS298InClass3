package edu.kvcc.cis298.inclass3.inclass3;

import java.util.UUID;

/**
 * Created by jschneider5667 on 10/19/2015.
 */
public class Crime {

    //Private variables for our models
    private UUID mId;
    private String mTitle;

    public Crime() {
        //Generate unique identifier
        mId = UUID.randomUUID();
    }

    //Getters and Setters
    //Only need to get UUID, no need to set it

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}

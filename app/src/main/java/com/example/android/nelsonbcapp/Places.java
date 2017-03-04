package com.example.android.nelsonbcapp;

/**
 * Created by Nicholas Soden on 2017-03-02.
 */

public class Places {
    private String placeName;
    private String placeAddress;
    private String placeHours;
    private int placeImage;

    public Places(String placeName, String placeAddress, String placeHours, int placeImage) {
        this.placeName = placeName;
        this.placeAddress = placeAddress;
        this.placeHours = placeHours;
        this.placeImage = placeImage;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public String getPlaceHours() {
        return placeHours;
    }

    public int getPlaceImage() {
        return placeImage;
    }

}



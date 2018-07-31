package com.example.tarsbir.quakereport;

public class Earthquake {
    private String mMagnitude;
    private String mLocation;
    private long mTimeInMillisecods;

    public Earthquake(String mMagnitude, String mLocation, long timeInMillisecods) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMillisecods = timeInMillisecods;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMillisecods;
    }
}

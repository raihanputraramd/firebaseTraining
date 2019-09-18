package com.example.firebasetraining;

public class Track {
    private String trackId;
    private String trackName;
    private Integer trackRating;

    public Track() {

    }

    public Track(String trackId, String trackName, int trackRating) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackRating = trackRating;
    }

    public String getTrackId() {
        return trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public Integer getTrackRating() {
        return trackRating;
    }
}

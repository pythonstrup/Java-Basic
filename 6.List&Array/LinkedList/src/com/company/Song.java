package com.company;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String toString(){
        String msg = title + ": " + duration;
        return msg;
    }

    public String getTitle() {
        return title;
    }

}

package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title, duration));
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String title) {
        for(int i  = 0; i<songs.size(); i++){
            if(songs.get(i).getTitle().equals(title)){
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> linkedList){
        if(trackNumber < songs.size() && trackNumber > 0){
            linkedList.add(songs.get(trackNumber-1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> linkedList){
        Song song = findSong(title);
        if(song != null){
            linkedList.add(song);
            return true;
        }
        return false;
    }

}

package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        return this.songs.add(new Song(title, duration));
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkedSong = this.songs.findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        return false;
    }


    private static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song){
            if(songs.contains(song)){
                return false;
            } else {
                songs.add(song);
                return true;
            }
        }

        private Song findSong(String title) {
            for(Song checkingSong: this.songs){
                if(checkingSong.getTitle().equals(title)){
                    return checkingSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber){
            int track = trackNumber-1;
            if(track >= 0 && track < songs.size()){
                return songs.get(track);
            }
            return null;
        }
    }

}


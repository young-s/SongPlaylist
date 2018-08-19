package com.company;

import java.util.ArrayList;

public class Album {

private String title;
private String artist;
ArrayList<Song> albumSongs;



    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.albumSongs = new ArrayList<Song>();
    }

    public boolean addSongtoAlbum(String songTitle, String runtime){

        Song newSongToBeAdded = new Song(songTitle, runtime);
        this.albumSongs.add(newSongToBeAdded);
        System.out.println((newSongToBeAdded.getTitle() + " has been added to: " + this.getTitle() + " by Artist: " + this.getArtist()));
        return true;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int trackCount(){
        return this.albumSongs.size();
    }
}

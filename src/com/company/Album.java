package com.company;

import java.util.ArrayList;

public class Album {

private String title;
private String artist;
    ArrayList<Song> albumSongs;



    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        ArrayList<Song> albumSongs = new ArrayList<Song>();
    }

    public String addSongtoAlbum(Album albumtitle, String songTitle, String runtime){

        Song newSongToBeAdded = new Song(songTitle, runtime);
        albumtitle.albumSongs.add(newSongToBeAdded);
        System.out.println((newSongToBeAdded.getTitle() + " has been added to " + albumtitle.getTitle()));
        return "Complete";
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}

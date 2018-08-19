package com.company;

import java.util.LinkedList;

public class Playlist {
    private String playListName;
    LinkedList<Song> playlistTracks;


    public Playlist(String playListName) {
        this.playListName = playListName;
        this.playlistTracks = new LinkedList<Song>();
    }

    public String getPlayListName() {
        return playListName;
    }

   // public boolean addAlbumToPlayList(Album albumToAdd);

    //int albumlength = albumToAdd.al

}

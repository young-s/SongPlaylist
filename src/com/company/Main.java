package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //create new album
        Album album1 = new Album("Black", "Metallica");
        //add songs
        album1.addSongtoAlbum("Sandman", "5");
        album1.addSongtoAlbum("Lightning", "5");
        album1.addSongtoAlbum("Battery", "5");
        System.out.println(album1.trackCount());

        Album album2 = new Album("Crossroads", "Clapton");
        //add songs
        album2.addSongtoAlbum("Layla", "5");
        album2.addSongtoAlbum("Cocaine", "5");
        album2.addSongtoAlbum("Help", "5");

        Playlist hotMix = new Playlist("Seany Mix");

        System.out.println( hotMix.getPlayListName());


    }
}

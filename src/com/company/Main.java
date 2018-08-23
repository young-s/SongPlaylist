package com.company;

import java.util.Scanner;

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

        hotMix.addAlbumToPlayList(album2);
        hotMix.addAlbumToPlayList(album1);

        listSongs(hotMix );

        Scanner scanner = new Scanner(System.in);
        int chosenOption = scanner.nextInt();
        boolean quit = false;

        printMenu();

    }

    private static void printMenu() {

        System.out.println("Please select an option\n" +
                "0 - to Quit\n" +
                "1 - to start playing\n" +
                "2 - to go to next song\n" +
                "3 - to go to previous song\n" +
                "4 - to remove current song from playlist\n" +
                "5 - to see the menu options again");

    }

    private static void listSongs( Playlist playlist){
        int count = playlist.playlistTracks.size();
        for (int i =0; i<count; i++){
            System.out.println("Track: " + playlist.playlistTracks.get(i).getTitle());
        }
    }
}

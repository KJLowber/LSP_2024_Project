package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SongsDatabaseJUnitTest {

    @Test
    @DisplayName("Test case for addSong")
    public void testAddSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Pop", "Thriller");
        db.addSong("Pop", "One Dance");
        db.addSong("Rap", "Through the Storm");
        db.addSong("Rap", "Hardley Breathe");

        Set<String> pop_songs = db.getSongs("Pop");
        Set<String> rap_songs = db.getSongs("Rap");

        assertTrue(pop_songs.contains("Thriller"));
        assertTrue(rap_songs.contains("Through the Storm"));
        assertFalse(pop_songs.contains("One Dance"));
        assertFalse(rap_songs.contains("Hadley Breathe"));
        
        System.out.println(db.getGenreOfSong("Thriller"));
        System.out.println(db.getGenreOfSong("Hardley Breathe"));
        System.out.println(db.getSongs("Pop"));
        System.out.println(db.getSongs("Rap"));
      
    }

    @Test
    @DisplayName("Test case for getSong")
    public void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Jazz", "Mr. Magic");
        db.addSong("Jazz", "Blue in Green");
        db.addSong("HipHop", "Workinonit");
        db.addSong("HipHop", "Fall in Love");

        Set<String> jazz_songs = db.getSongs("Jazz");
        assertTrue(jazz_songs.contains("Mr. Magic"));
        assertTrue(jazz_songs.contains("Blue in Green"));
        
        System.out.println(db.getGenreOfSong("Mr. Magic"));
        System.out.println(db.getGenreOfSong("Blue in Green"));
        System.out.println(db.getSongs("Jazz"));
        System.out.println(db.getSongs("HipHop"));
    }

    @Test
    @DisplayName("Test case for getGenreOfSong")
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Country", "Buckin");
        db.addSong("Indie", "Washing Machine");
        db.addSong("Country", "Jolene");
        db.addSong("Indie", "Sofia");

        assertEquals("Country", db.getGenreOfSong("Buckin"));
        assertEquals("Indie", db.getGenreOfSong("Sofia"));
        assertEquals("That song is not in the Database.", db.getGenreOfSong("One Beer"));
        
        System.out.println(db.getSongs("Indie"));
        System.out.println(db.getSongs("Country"));
        System.out.println(db.getGenreOfSong("Jolene"));
        System.out.println(db.getGenreOfSong("Sofia"));
    }
		
}

package org.howard.edu.lsp.oopfinal.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    private Map<String, HashSet<String>> map = 
    new HashMap<String, HashSet<String>>();

 /* Add a song title to a genre */
 public void addSong(String genre, String songTitle) {
	 HashSet<String> song = map.get(genre);
	 if(song == null) {
		 song = new HashSet<String>();
		 map.put(genre, song);
	 }
	 song.add(songTitle);
	 
	}

	/* Return genre, i.e., jazz, given a song title */
 public String getGenreOfSong(String songTitle) {
	 String g = null;
	 for(String genre : map.keySet()){
    	 HashSet<String> song = map.get(genre);
    	 if(song.contains(genre)) {
    		 g = genre;
    	 }
	 }
	
	return g;
 }

  
 /* Return the Set that contains all songs for a genre */
 public Set<String> getSongs(String genre) {
	 HashSet<String> setSongs = map.get(genre);
	 if(setSongs == null) {
		 setSongs = new HashSet<String>();
	 }
	 return setSongs;
 }
}

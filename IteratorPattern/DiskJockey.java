package com.collabera.iteratordesign;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiskJockey {
	
	SongsOfTheSeventies songs70s;
	SongsOfTheEighties songs80s;
	SongsOfTheNineties songs90s;
	
	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;
	
	public DiskJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {
		
		iter70sSongs = newSongs70s;
		iter80sSongs = newSongs80s;
		iter90sSongs = newSongs90s;
		
	}
	
	public void showTheSongs() {
		
		ArrayList aL70s = songs70s.getBestSongs();
		System.out.println("Songs of the 70's\n");
		for(int i = 0; i < aL70s.size(); i++) {
			SongInfo bestSongs = (SongInfo) aL70s.get(i);
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());

		}
		
		SongInfo[] array80Songs = songs80s.getBestSongs();
		System.out.println("Songs of the 80's\n");
		for(int i = 0; i < array80Songs.length; i++) {
			SongInfo bestSongs = (SongInfo) array80Songs[i];
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());

		}
		
		Hashtable<Integer, SongInfo> array90Songs = songs90s.getBestSongs();
		System.out.println("Songs of the 90's\n");
		for(Enumeration<Integer> e = array90Songs.keys(); e.hasMoreElements();) {
			SongInfo bestSongs = (SongInfo) array90Songs.get(e.nextElement());
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());

		}		
		
	}
	
	public void showTheSongs2() {
		
		Iterator songs70s = iter70sSongs.createIterator();
		Iterator songs80s = iter80sSongs.createIterator();
		Iterator songs90s = iter90sSongs.createIterator();
		
		System.out.println("Songs of the 70's\n");
		printTheSongs(songs70s);
		
		System.out.println("Songs of the 80's\n");
		printTheSongs(songs80s);
		
		System.out.println("Songs of the 90's\n");
		printTheSongs(songs90s);
	}

	public void printTheSongs(Iterator iterator) {
		while(iterator.hasNext()) {
			
			SongInfo songInfo = (SongInfo) iterator.next();

			System.out.println(songInfo.getSongName());
			System.out.println(songInfo.getBandName());
			System.out.println(songInfo.getYearReleased());
		}
	}
}

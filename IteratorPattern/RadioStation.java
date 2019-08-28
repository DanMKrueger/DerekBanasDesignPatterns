package com.collabera.iteratordesign;

public class RadioStation {
	
	public static void main(String args[]) {
		SongsOfTheSeventies songs70s = new SongsOfTheSeventies();
		SongsOfTheEighties songs80s = new SongsOfTheEighties();
		SongsOfTheNineties songs90s = new SongsOfTheNineties();
		
		DiskJockey madMike = new DiskJockey(songs70s, songs80s, songs90s);
		
		madMike.showTheSongs2();
		
	}

}

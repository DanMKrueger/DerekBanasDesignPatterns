package com.collabera.templatedesign;

public class SandwhichSculptor {
	
	public static void main(String args[]) {
		Hoggie customer12 = new ItalianHoggie();
		customer12.makeSandwhich();
		
		System.out.println();
		
		Hoggie customer98 = new VeggieHoggie();
		customer98.makeSandwhich();
	}

}

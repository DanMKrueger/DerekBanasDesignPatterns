package com.collabera.templatedesign;

public abstract class Hoggie {
	
	boolean afterFirstCondiment = false;

	final void makeSandwhich() {
		
		cutBun();
		if(customerWantsMeat()) {
			addMeat();
			afterFirstCondiment = true;
		}
			
		if(customerWantsCheese()) {
			if(afterFirstCondiment) {
				System.out.println();
			}
			addChese();
			afterFirstCondiment = true;

		}
		if(customerWantsCondiments()) {
			if(afterFirstCondiment) {
				System.out.println();
			}
			addCondiments();
			afterFirstCondiment = true;

		}
		if(customerWantsVegtables()) {
			if(afterFirstCondiment) {
				System.out.println();
			}
			addVegtables();
			afterFirstCondiment = true;

		}
		
		wrapTheHoggie();
		
	}
	
	public void cutBun() {
		System.out.println("The hoggie is cut.");
	}
		
	abstract void addChese();
	abstract void addMeat();
	abstract void addVegtables();
	abstract void addCondiments();
	
	boolean customerWantsMeat() {
		return true;
	}
	boolean customerWantsCheese() {
		return true;
	}
	boolean customerWantsCondiments() {
		return true;
	}
	boolean customerWantsVegtables() {
		return true;
	}
	
	public void wrapTheHoggie() {
		System.out.println("Wrapped the hoggie.");
	}
	
}

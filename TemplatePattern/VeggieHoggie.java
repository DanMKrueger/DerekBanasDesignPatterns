package com.collabera.templatedesign;

public class VeggieHoggie extends Hoggie {
	
	String[] vegtablesUsed = { "Lettuce", "Tomato", "Onions", "Sweet Peppers"};
	String[] condimentsUsed = { "Oil", "Vinegar"};
	
	boolean customerWantsMeat() {
		return false;
	}
	boolean customerWantsCheese() {
		return false;
	}
	
	@Override
	void addChese() {
		
	}
	@Override
	void addMeat() {
		
	}
	@Override
	void addVegtables() {
		System.out.print("Adding the veggies: " );
		for(String veggie: vegtablesUsed) {
			System.out.print(veggie + " ");
		}
	}
	@Override
	void addCondiments() {
		System.out.print("Adding the condiments: " );
		for(String topping: condimentsUsed) {
			System.out.print(topping + " ");
		}		
	}

}

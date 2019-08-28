package com.collabera.templatedesign;

public class ItalianHoggie extends Hoggie{

	String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };
	String[] cheeseUsed = { "Provolone" };
	String[] vegtablesUsed = { "Lettuce", "Tomato", "Onions", "Sweet Peppers"};
	String[] condimentsUsed = { "Oil", "Vinegar"};
	
	@Override
	void addChese() {
		System.out.print("Adding the cheese: " );
		for(String cheese: cheeseUsed) {
			System.out.print(cheese + " ");
		}		
	}

	@Override
	void addMeat() {
		
		System.out.print("Adding the meat: " );
		for(String meat: meatUsed) {
			System.out.print(meat + " ");
		}
		
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

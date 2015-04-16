package com.monecole;

public class Garage {

	Voiture voiture1 = new Voiture();
	Voiture voiture2 = new Voiture();
	
	public void creerVoiture() {
		
		voiture1.setMarque("Audi");
		voiture2.setMarque("Opel");
		
		System.out.println(voiture1.getMarque());
		System.out.println(voiture2.getMarque()); 
		
	}
	
}

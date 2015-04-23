package com.constructsio;

public class Batiment {

	int prix = 0;
	boolean construction;
	
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public void enConstruction(){
		construction = true;
	}
	public void pasEnConstruction(){
		construction = false;
	}
	
	
	public Batiment(int prix){
		super();
		this.prix=prix;
		if (prix <= 0) {
			throw new RuntimeException("prix invalide");
		}
	}

	Option option1 = new Option(5000,"terasse");
	Option option2 = new Option(10000,"jardin");
	
	public int CalculerPrix() {
		return prix + option1.prix + option2.prix;
	}
}
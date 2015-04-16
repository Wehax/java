package com.assusio;

public class Vehicule {

	int prix;
	public String nom;

	public Vehicule(int prix, String nom) {
		super();
		this.prix = prix;
		this.nom = nom;
		if (prix <= 0) {
			throw new RuntimeException("prix invalide");
		}
	}

	Option option1 = new Option(100, "");
	Option option2 = new Option(200, "");

	public int CalculerPrix() {
		return prix + option1.prix + option2.prix;
	}
}

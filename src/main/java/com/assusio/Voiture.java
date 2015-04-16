package com.assusio;

public class Voiture extends Vehicule {

	boolean tatouageVitre;

	public Voiture() {
		super(40000, "audi");
	}

	public void tatouerVitre() {
		tatouageVitre = true;
	}

	public void detatouerVitre() {
		tatouageVitre = false;
	}
}

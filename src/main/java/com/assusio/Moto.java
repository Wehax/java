package com.assusio;

public class Moto extends Vehicule {

	boolean antivol;

	public Moto() {
		super(3000, "ktm");
	}

	public void setAntivol() {
		antivol = true;
	}

	public void removeAntivol() {
		antivol = false;
	}

	public boolean hasAntivol() {
		return antivol;
	}
}

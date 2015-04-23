package com.constructsio;

public class Immeuble extends Batiment {
	
	int etage;
	
	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
		if (etage <= 0) {
			throw new RuntimeException("prix invalide");
		}
	}

	public Immeuble(int prix){
		super(1000000);
	}
}

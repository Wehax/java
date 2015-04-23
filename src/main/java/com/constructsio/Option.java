package com.constructsio;

public class Option {
	int prix = 0;
	String description = "option non defini";
	
	public Option(int prix, String description){
		super();
		this.prix = prix;
		this.description = description;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
}

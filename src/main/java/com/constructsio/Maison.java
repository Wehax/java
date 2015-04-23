package com.constructsio;

public class Maison extends Batiment{

	boolean etage;
	
	public Maison(){
		super(150000);
	}
	
	public void avecEtage(){
		etage = true;
	}
	
	public void sansEtage(){
		etage = false;
	}
}

package Tpjava;

public class Moto extends Vehicule {
boolean antivol;
	

	public Moto(int prix, String nom) {
		super(prix, nom);
		this.prix = prix;
		this.nom = nom;
	}

	public void setAntivol() {
		antivol = true;
	}
	
	public void removeAntivol() {
		antivol = false;
	}
	
	public boolean hasAntivol(){
		return antivol;
	}
}

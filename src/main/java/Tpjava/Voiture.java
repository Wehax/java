package Tpjava;

public class Voiture extends Vehicule {
boolean tatouageVitre;

	public Voiture(int prix, String nom) {
		super(prix,nom);
		this.prix= prix;
		this.nom= nom;
	}
	
	public void tatouageVitre(){
		tatouageVitre=true;
	}
	
	public void detatouageVitre(){
		tatouageVitre=false;
	}
}
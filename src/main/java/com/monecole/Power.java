package com.monecole;

public class Power {
	
	Calculette calculette = new Calculette();
	
	public Integer carre(Integer nombre1) {
		if (nombre1 == null){
			throw new RuntimeException("impossible de faire un carre si le nombre est null");
		}
		return calculette.multiplication(nombre1, nombre1);
	}
	
}

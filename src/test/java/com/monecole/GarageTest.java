package com.monecole;

import org.junit.Assert;
import org.junit.Test;

public class GarageTest {

	@Test
	public void testCreerVoiture() {
		
		Garage garage = new Garage();	
		garage.creerVoiture();
		
		Assert.assertEquals("Audi", garage.voiture1.getMarque());
		Assert.assertEquals("Opel", garage.voiture2.getMarque());
		
	}

}

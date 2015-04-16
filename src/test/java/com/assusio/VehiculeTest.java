package com.assusio;

import org.junit.Assert;
import org.junit.Test;

public class VehiculeTest {

	@Test
	public void testPrix() {
		Vehicule vehicule = new Vehicule(2000, "");

		Assert.assertEquals(2000, vehicule.prix);
		Assert.assertEquals(2100, vehicule.prix + vehicule.option1.prix);
		Assert.assertEquals(2200, vehicule.prix + vehicule.option2.prix);
		Assert.assertEquals(2300, vehicule.prix + vehicule.option2.prix
				+ vehicule.option1.prix);

	}

}

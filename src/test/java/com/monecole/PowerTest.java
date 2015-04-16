package com.monecole;

import junit.framework.Assert;

import org.junit.Test;


public class PowerTest {

	Power power = new Power();
	
	@Test
	public void testCarre() {
		int resultat = power.carre(2);
		Assert.assertEquals("Mauvais resultat du carre", 4, resultat);
	}
	
	@Test(expected = RuntimeException.class)
	public void testCarreNeDoitPasAccepterDeParametrenull() {
		power.carre(null);
	}

}

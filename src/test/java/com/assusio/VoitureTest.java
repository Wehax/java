package com.assusio;

import static org.junit.Assert.*;

import org.junit.Test;

public class VoitureTest {
	
	@Test
	public void test() {
		Voiture voiture=new Voiture();
		assertEquals(40000, voiture.prix);
	}

}

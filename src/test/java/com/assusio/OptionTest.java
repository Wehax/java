package com.assusio;

import org.junit.Assert;
import org.junit.Test;

public class OptionTest {

	@Test
	public void test() {
		Option option1 = new Option();
		option1.prix=50;
		option1.nom="cuir";
		Assert.assertEquals("mauvais prix", 50 , option1.prix);
		Assert.assertEquals("mauvais nom", "cuir" , option1.nom);
	}

}

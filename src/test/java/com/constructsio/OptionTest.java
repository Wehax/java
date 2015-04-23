package com.constructsio;

import junit.framework.Assert;

import org.junit.Test;

public class OptionTest {

	@Test
	public void TestOption(){
		Option option1 = new Option(2000,"terasse");
		Assert.assertEquals(2000, 2000, option1.prix);
		Assert.assertEquals("terasse", "terasse", option1.description);
	}

}

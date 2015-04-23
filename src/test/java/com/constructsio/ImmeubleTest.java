package com.constructsio;

import junit.framework.Assert;

import org.junit.Test;

public class ImmeubleTest {

	@Test
	public void test() {
		Immeuble Immeuble1 = new Immeuble(1000000);
		Assert.assertEquals(1000000, 1000000, Immeuble1.prix);
	}

}

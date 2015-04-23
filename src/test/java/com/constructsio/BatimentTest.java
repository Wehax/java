package com.constructsio;

import static org.junit.Assert.*;
import junit.framework.Assert;
import 

import org.junit.Test;

public class BatimentTest {

	@Test
	public void test() {
		Batiment bat1 = new Batiment(20000);
		Assert.assertEquals(20000, 200, bat1.prix );
	}
}

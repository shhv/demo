package com.mydomain;

import org.junit.Assert;
import org.junit.Test;

//demo test
public class CalculatorTest {

	@Test
	public void testAdd() {
		Assert.assertEquals(7,new Calculator().add(3, 4));
	}
}

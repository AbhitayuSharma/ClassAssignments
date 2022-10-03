package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OverridingTest {
	@Test
	public void evaluatesExpression() {
		Overriding ride = new Overriding();
		
		String testcase1 = ride.display();        //Testcase1
		assertEquals("Hi, This is Overrided Method Display",testcase1);
	}
}


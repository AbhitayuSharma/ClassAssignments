package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiamondPorbTryTest {
	@Test
	public void evaluatesExpression() {
		DiamondProbTry dp = new DiamondProbTry();
		
		int testcase1 = dp.add(7,5);        //Testcase1
		assertEquals(12,testcase1);
		
		
		int testcase2 = dp.add(3, 5,4);
		assertEquals(12,testcase2);        //Testcase2
	}
}

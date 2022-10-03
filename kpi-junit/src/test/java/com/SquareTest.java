package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Square class is Extending an Abstract Class 
public class SquareTest {
	@Test
	public void evaluatesExpression() {
		Square s = new Square();
		
		int testcase1 = s.sqaureit(7);        //Testcase1
		assertEquals(49,testcase1);
		
		int testcase2 = s.sqaureit(5);
		assertEquals(25,testcase2);           //Testcase2
	}
}

package com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OverloadingTest {
	@Test
	public void evaluatesExpression() {
		Overloading load = new Overloading();
		
		int testcase1 = load.add(10,12);        //Testcase1 for add(int,int)
		assertEquals(22,testcase1);
		
		
		int testcase2 = load.add(10,10,10);     //Testcase2 for add(int,int,int)
		assertEquals(30,testcase2);
		

		
	}
}

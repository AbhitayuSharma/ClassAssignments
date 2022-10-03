package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShapesTest {
	@Test
	public void evaluatesExpression() {
		Square s = new Square();
		
		String testcase1 = s.sides();    
		String testcasedraw1 = s.draw();      //Testcase1
		assertEquals("I have 4 Sides",testcase1);
		assertEquals("Drawing Square",testcasedraw1);
		
		
		Rectangle r = new Rectangle();
		String testcase2 = r.sides();
		String testcasedraw2  = r.draw();      //Testcase2
		assertEquals("I have 4 Sides",testcase2);
		assertEquals("Drawing Rectangle",testcasedraw2);
		
		Circle c = new Circle();
		String testcase3 = c.sides();
		String testcasedraw3  = c.draw();      //Testcase3
		assertEquals("I have no Sides",testcase3);
		assertEquals("Drawing Circle",testcasedraw3);
		
		Pentagon p = new Pentagon();
		String testcase4 = p.sides();
		String testcasedraw4  = p.draw();      //Testcase4
		assertEquals("I have 5 Sides",testcase4);
		assertEquals("Drawing Pentagon",testcasedraw4);
	}

}

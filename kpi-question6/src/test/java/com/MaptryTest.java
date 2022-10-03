package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaptryTest {
	@Test
	public void evaluatesExpression() {
		EmployeeTry em = new EmployeeTry();
		
		em.id = 1001;
		em.Name = "Abhitayu";
		em.mp.put(em.id, em.Name);
		String name = em.mp.get(1001);      //Testcase1
		assertEquals("Abhitayu",name);
	}
}

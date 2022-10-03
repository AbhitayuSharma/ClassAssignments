package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Used Data Engineer Class to show Inheritance, it is extending Programmer class and Programmer extending Employee
public class DataEngineerTest {
	@Test
	public void evaluatesExpression() {
		DataEngineer de = new DataEngineer();
		
		de.setEmpid(7);        
		de.setDesignation("Data Engineer");
		int id = de.getEmpid();
		String designation = de.getDesignation();
		int sal = de.sal();
		assertEquals(7,id);
		assertEquals("Data Engineer",designation);
		assertEquals(700000,sal);
	}
}

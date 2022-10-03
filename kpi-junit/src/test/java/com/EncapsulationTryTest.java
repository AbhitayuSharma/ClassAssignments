package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EncapsulationTryTest {
	@Test
	public void evaluatesExpression() {
		EncapsulationTry encap = new EncapsulationTry();
		encap.setAccountnum(98765);
		encap.setName("Levi");
		encap.setBank("Axis");
		
		int accn = encap.getAccountnum();
		String name = encap.getName();
		String bank = encap.getBank();
		
		assertEquals(98765,accn);
		assertEquals("Levi",name);
		assertEquals("Axis",bank);
		
	}
}

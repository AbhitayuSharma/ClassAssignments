package com;


public class Maptry {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeTry e = new EmployeeTry();
		e.id = 101;
		e.Name = "Abhitayu";
		
		EmployeeTry e2 = new EmployeeTry();
		e2.id = 102;
		e2.Name = "Anurag";
		
		EmployeeTry m = new EmployeeTry();
		m.mp.put(e.id,e.Name);
		m.mp.put(e2.id,e2.Name);
		
		System.out.println(m.mp.get(101));

	}

}

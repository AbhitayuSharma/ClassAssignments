package com;
//Multi-level Inheritance 
public class DataEngineer extends Programmer{
	int sal() {                  //Programmer Inheriting Employee and Data Eng. Inheriting Programmer
		return 700000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataEngineer d = new DataEngineer();
		d.setEmpid(9181);
		d.setDesignation("Data Enginner");
		int emp = d.getEmpid();
		String desig = d.getDesignation();
		int sal = d.sal();
		System.out.println("Employee Id is "+emp);
		System.out.println("Designation is "+desig);
		System.out.println("Salary is "+sal);
	}

}

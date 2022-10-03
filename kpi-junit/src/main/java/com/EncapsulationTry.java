package com;

public class EncapsulationTry {
	int Accountnum;
	String Name;
	String Bank;

	public int getAccountnum() {
		return Accountnum;
	}

	public void setAccountnum(int accountnum) {
		Accountnum = accountnum;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	public String getBank() {
		return Bank;
	}

	public void setBank(String bank) {
		Bank = bank;
	}
	
	public static void main(String args[]) {
		EncapsulationTry et = new EncapsulationTry();
		et.setAccountnum(12345);
		et.setName("Abhitayu");
		et.setBank("HDFC");
		int acc = et.getAccountnum();
		String name = et.getName();
		String Bank = et.getBank();
		System.out.println(acc);
		System.out.println(name);
		System.out.println(Bank);
	}
	
}

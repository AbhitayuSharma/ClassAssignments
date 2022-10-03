package com;

public class Overloading {
	
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {          //Overloading add
		return a+b+c;
	}
	double add (double a,double b) {      //Overloading add
		return a+b;
	}
	double add(double a,double b,double c) {    //Overloading add
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading a = new Overloading();
		int ans = a.add(5, 6);
		int ansoverload  = a.add(5, 3, 2);
		double ansdou = a.add(5.2, 4.3);
		double ansdouoverload = a.add(5.7,7.4,9.7);
		System.out.println(ans);
		System.out.println(ansoverload);
		System.out.println(ansdou);
		System.out.println(ansdouoverload);
	}

}

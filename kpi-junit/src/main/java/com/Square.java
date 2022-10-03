package com;
//Extending Abstract Class to show Abstraction
public class Square extends AbstractTest{

	@Override
	int sqaureit(int a) {    //Abstract Class Method Defined here
		// TODO Auto-generated method stub
		return a*a;
	}
	public static void main(String args[]) {
		Square s = new Square();
		int ans = s.sqaureit(7);
		System.out.println(ans);
	}
}

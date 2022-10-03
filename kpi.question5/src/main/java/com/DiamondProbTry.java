package com;

public class DiamondProbTry implements SampleInterface1,SampleInterface2{
	public int add(int a,int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiamondProbTry dp = new DiamondProbTry();
		int ans = dp.add(10,9);
		int ans2 = dp.add(7,5,4);
		System.out.println(ans);
		System.out.println(ans2);
	}

	

}

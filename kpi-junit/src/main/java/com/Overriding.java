package com;
//Overriding Question
public class Overriding extends Parentclass{ //used Parentclass to show Overriding
	String display() {
		return "Hi, This is Overrided Method Display";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding o = new Overriding();
		String data = o.display();         //It is Calling Override Method Not the Parent class Method
		System.out.println(data);
	}

}

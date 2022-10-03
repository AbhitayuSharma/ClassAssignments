package com;

public class Circle extends Shapes{

	@Override
	String sides() {
		// TODO Auto-generated method stub
		return "I have no Sides";
		
	}

	@Override
	String draw() {
		// TODO Auto-generated method stub
		return "Drawing Circle";
		
	}
	public static void main(String args[]) {
		Circle c = new Circle();
		String side = c.sides();
		String draw = c.draw();
		System.out.println(side);
		System.out.println(draw);
	}
}

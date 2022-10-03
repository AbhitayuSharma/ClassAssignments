package com;

public class Rectangle extends Shapes{

	@Override
	String sides() {
		// TODO Auto-generated method stub
		return "I have 4 Sides";
		
	}

	@Override
	String draw() {
		// TODO Auto-generated method stub
		return "Drawing Rectangle";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		String side = r.sides();
		String draw = r.draw();
		System.out.println(side);
		System.out.println(draw);
		
	}

}

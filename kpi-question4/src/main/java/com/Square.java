package com;

public class Square extends Shapes{
	@Override
	String sides() {
		// TODO Auto-generated method stub
		return "I have 4 Sides";
		
	}

	@Override
	String draw() {
		return "Drawing Square";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		String side = s.sides();
		String draw = s.draw();
		System.out.println(side);
		System.out.println(draw);
	}

}

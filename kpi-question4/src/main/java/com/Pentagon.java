package com;

public class Pentagon extends Shapes{

	@Override
	String sides() {
		// TODO Auto-generated method stub
		return "I have 5 Sides";
		
	}

	@Override
	String draw() {
		// TODO Auto-generated method stub
		return "Drawing Pentagon";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pentagon p = new Pentagon();
		String side = p.sides();
		String draw = p.draw();
		System.out.println(side);
		System.out.println(draw);

	}
}

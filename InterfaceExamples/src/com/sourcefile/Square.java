package com.sourcefile;

public class Square implements Drawable {
	private double side;

	
	public Square(double s){
		this.side=s;
		
	}
	@Override
	public void drawShape() {
		System.out.println("Drawing Square");
	}

	@Override
	public double calculateArea() {
		return this.side*this.side;
	}
}

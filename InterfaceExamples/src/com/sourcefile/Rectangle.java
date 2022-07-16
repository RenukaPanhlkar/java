package com.sourcefile;

public class Rectangle implements Drawable {

	private double width;
	private double height;
	
	public Rectangle(double w, double h){
		this.width=w;
		this.height=h;
	}
	@Override
	public void drawShape() {
		System.out.println("Drawing Rectangle");
	}

	@Override
	public double calculateArea() {
		return this.height*this.width;
	}
	
	
}

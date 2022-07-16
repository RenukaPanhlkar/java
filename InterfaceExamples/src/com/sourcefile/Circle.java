package com.sourcefile;

public class Circle implements Drawable {

	private double radius;

	public Circle(double r){
		this.radius = r;
	}
	
	@Override
	public void drawShape() {
		System.out.println("Drawing Circle");
	}
	
	@Override
	public double calculateArea(){
		return Math.PI*this.radius*this.radius;
	}

	public double getRadius(){
		return this.radius;
	}
}

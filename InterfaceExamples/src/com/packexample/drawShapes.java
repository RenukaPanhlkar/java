package com.packexample;
import com.sourcefile.*;
public class drawShapes {
	
public static void main(String[] args) {
		
		//programming for interfaces not implementation
		 Drawable d = new Circle(6);
		
		d.drawShape();
		System.out.println("Area="+d.calculateArea());
		
		//switching from one implementation to another easily
		 Drawable d1=new Rectangle(10,10);
		d1.drawShape();
		System.out.println("Area="+d1.calculateArea());
		Drawable d2=new Square(8);
		d2.drawShape();
		System.out.println("Area=" +d2.calculateArea());
}
}

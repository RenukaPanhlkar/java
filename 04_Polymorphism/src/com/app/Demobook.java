package com.app;

import com.module.*;
import java.util.Scanner;
public class Demobook {
	public static void display(Book []arr) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getprice()>=500)
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		String name;
		double price;
		int choice;
		Book []b=new Book[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter book name");
			name=sc.next();
			System.out.println("Enter book price");
			price=sc.nextDouble();
			System.out.println("1. Ebook");
			System.out.println("2. Printed Book");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				b[i]=new Ebook(name,price);
				break;
			case 2:
				b[i]=new Printedbook(name,price);
				break;
			}
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.println(b[i]);
			b[i].calculatecost();
		}
	display(b);
	
	
	}
	
	
}

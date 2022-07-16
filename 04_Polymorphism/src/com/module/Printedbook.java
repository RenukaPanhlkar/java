package com.module;

public class Printedbook extends Book {
private double charges;
public Printedbook(String name,double price)
{
	super(name,price);
	charges=500;
	
}
public String toString()
{
	return super.toString()+"\t"+charges;
}
public void calculatecost()
{
	double netprice=price+charges;
	System.out.println("*********Net Price: "+netprice+"*********");
}

	
}

package com.module;

public abstract class Book {
	private String name;
	protected double price;
	public Book(String name,double price)
	{
		this.name=name;
		this.price=price;
		
	}
	public Book()
	{
		
	}
	
	public String toString()
	{
		return "\t"+name+"\t"+price;
		
	}
	public double getprice()
	{
		return price;
		
	}
	 abstract public void calculatecost();

}

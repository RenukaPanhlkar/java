package com.module;

public class Ebook  extends Book{
	private double discount;
	public Ebook(String name,double price)
	{
		super(name,price);
		if(price>=500 && price<1000)
			discount=price*0.5;
		else if(price>=1000&&price<1500)
			discount=price*0.7;
		
	}
public String toString()
{
return super.toString()+"\t"+discount;	
}
public void calculatecost()
{
	double netprice=price-discount;
	System.out.println("*******Net Price:  "+netprice+"*******");
}

}

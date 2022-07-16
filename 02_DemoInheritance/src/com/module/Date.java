package com.module;

public class Date {
	private int dd,mm,yy;
	public Date()
	{
		dd=mm=yy=1;
	}
	public Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void display()
	{
		System.out.println("Date:  " +dd+"/"+mm+"/"+yy);
	}
}

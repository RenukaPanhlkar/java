package com.module;

public class Person {
	private String name;
	private Date dob;
	public Person()
	{
		this.name="NA";
		dob=new Date();
		
	}
	public Person(String name,Date d1)
	{
		this.name=name;
		this.dob=d1;
		
	}
	public Person(String name,int dd,int mm,int yy)
	{
		this.name=name;
		this.dob=new Date(dd,mm,yy);
		
	}

	public void display()
	{
		System.out.println("Name:  "+name);
		dob.display();
	}
	}



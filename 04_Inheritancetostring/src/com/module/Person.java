package com.module;

public class Person{

	private String name;
	private String email;
	private  Date bdate;
	public Person()
	{
		name="NA";
		email="NA";
		bdate=new Date();
		
	}
	public Person(String name,String email,Date d1)
	{
		this.name=name;
		this.email=email;
		this.bdate=d1;
		
	}
	
	public Person(String name, String email,int dd,int mm,int yy)
	{
		this.name=name;
		this.email=email;
		this.bdate=new Date(dd,mm,yy);
		
	}
	
	public String toString()
	{
		String str;
		str="Employee Name: "  +name+"\t\t" +"Email: "+email +"\\tt"+"DOB:"+ bdate.toString();
		return str;
	}
}

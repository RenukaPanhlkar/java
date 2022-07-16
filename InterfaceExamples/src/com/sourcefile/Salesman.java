package com.sourcefile;

public class Salesman extends Emp implements ITraveller{
	private double TA;
	private int daystravelled;
	public Salesman(int eid,double salary,int daystravelled)
	{
	super( eid, salary);	
	//this.TA=TA;
	this.daystravelled=daystravelled;

	}

	public void calculateTA()
	{ 	
		TA=(salary*DA)/100*daystravelled;
		System.out.println("Salary of Salesman:"+ (salary+TA));
	}
	/*public double calSalary()
	{
		return salary+calculateTA();
	}*/
	
	public int getDays()
	{
		return daystravelled;
	}
	
	public String toString()
	{
		String str;
		str=super.toString()+"Days travelled:"+daystravelled;
		return str;
	}
}

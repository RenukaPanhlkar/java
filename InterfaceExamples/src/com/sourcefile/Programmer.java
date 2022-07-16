package com.sourcefile;

public class Programmer extends Emp implements ITraveller{
	
	private double TA;
	private int daystravelled;
	public Programmer(int eid,double salary,int daystravelled)
	{
	super( eid, salary);	
	//this.TA=TA;
	this.daystravelled=daystravelled;

	}

	public void calculateTA()
	{ //TA=TA*days;
//netsal=this.salary+(DA/100)+TA;		
	TA=(salary*DA)/100*daystravelled;
	System.out.println("Salary of Programmer:"+ (salary+TA));
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

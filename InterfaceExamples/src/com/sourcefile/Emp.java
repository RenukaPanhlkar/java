package com.sourcefile;

public abstract class Emp implements ITraveller {
private int eid;
protected double salary;
	Emp( int eid,double salary)
	{
		
		this.salary=salary;
		//this.netsal=netsal;
		this.eid=eid;
	}
	public void display()
	{
		System.out.println("emp id:" +eid);
		System.out.println("Salary :" +salary);
	}
		

		
		
		public String toString()
		{
			String str;
			str=super.toString();
			return str;
		}

}

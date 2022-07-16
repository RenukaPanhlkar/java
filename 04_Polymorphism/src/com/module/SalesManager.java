package com.module;

public class SalesManager extends Emp{
	private int target;
	private int inc;
	 protected double netsal=0.0;
	 public SalesManager(int eid,String name,int age,int salary,int target)
	{
		super(eid,name,age,salary);
		this.target=target;
		//this.inc=inc;
		
	}
	public SalesManager() {
		
	}
	public void display()
	{
		super.display();
	CalculateSal();
	System.out.println("The Salary of Salesmanager: " +"["+ "Salary: "+salary+"\t"+"target="+ target+"\t"+"Incentives= "+inc+"\t"+"Netsalary =" +netsal);	
	}
	/*public String toString()
	{
		String str;
		str=super.toString()+"["+ "Salary: "+salary+"\t"+"target="+ target+"\t"+"Incentives= "+inc+"\t"+"Netsalary =" +netsal;
	return str;
	}*/
	public void CalculateSal()
	{
		
		//target=50;
		if(target<50)
			inc=(target*1)/100;
		else
			inc=(target*10)/100;
		netsal=salary+inc;
		//return netsal;
	}

}

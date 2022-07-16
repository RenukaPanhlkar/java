package com.module;

public class Admin extends Emp{
private int bonus;
protected  double netsal=0;
public Admin()
{
	
}
public Admin(int eid,String name ,int age, double salary ,int bonus)
{
	super( eid, name, age,salary);
	this.bonus=bonus;
}

public void display()
{
	super.display();
CalculateSal();
	System.out.println("Salary of Admin: " +"[ Salary: "+salary +"Bonus:  " +bonus+"\t" +"Netsal : "+netsal);
}

public void  CalculateSal()
{
	netsal=salary+bonus;
		
	System.out.println(netsal);
	//return netsal;
}
}

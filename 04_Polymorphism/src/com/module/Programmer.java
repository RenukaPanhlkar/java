package com.module;

public class Programmer extends Emp{
private int extra_hr;
private int chargperhr;
protected double netsal=0;
public Programmer()
{


}
public Programmer(int eid,String name,int age,int salary,int extra_hr,int chargperhr)
{
super(eid,name,age,salary);
this.extra_hr=extra_hr;
this.chargperhr=chargperhr;

}

public void display()
{
	super.display();
CalculateSal();
	System.out.println("Salary of Programmer:  " +"[ Salary: "+salary +"Extra_hr:  " +extra_hr +"\t"+"chargperhr  :" +chargperhr +"\t"+"Netsal:=" +netsal);
}

/*public String toString() {
	String str;
	str=super.toString()+"[ Salary: "+salary +"Extra_hr:  " +extra_hr +"\t"+"chargperhr  :" +chargperhr +"\t"+"Netsal:=" +netsal;
return str;
}*/

public void CalculateSal()
{
	netsal=salary+(extra_hr*chargperhr);
	//return netsal;
	
}

}

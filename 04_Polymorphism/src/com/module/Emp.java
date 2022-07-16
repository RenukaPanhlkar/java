package com.module;

public abstract class Emp {
	private int eid;
	protected double salary;
	private String name;
	private int age;
	public Emp()
	{
		eid=0;
		salary=0;
		name="NA";
		age=0;
	}
	public Emp(int eid,String name,int age,double salary )
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
		this.age=age;
	}
	public double getsalary()
	{
		return salary;
	}
	
	public void display()
	{
		System.out.println("-----------------------------------");
		System.out.println("Empid  :" +eid);
		System.out.println("Employee Name  :" +name);
		System.out.println("Salary :"+salary);
		System.out.println("Age  :"   +age);
		//System.out.println("-------------------");
	}
	/*public String toString()
	{
	String str;
	str="Emp id: "+eid+"\t"+"Emp name :"+name+"\t"+"Salary:"+salary+"\t"+"Age:"+age;
	return str;
	
	
}*/
  abstract public  void CalculateSal();
  

	 

}


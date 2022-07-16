package com.module;

public class Employee extends Person{
private String Designation ;
public Employee()
{
	Designation="NA";
	
}
public Employee(String Designation,String name,String email,int dd,int mm,int yy)
{
	super(name,email,dd,mm,yy);
	this.Designation=Designation;
	
}
/*public void display()
{
	System.out.println("-------------------------");
	

System.out.println("Registration no :" +rgno);
super.display();

}*/
public String toString()
{
	String str;
	str=super.toString()+"\t\t"+"Designation:  "+"\t\t"+Designation;
	return str;
}


}

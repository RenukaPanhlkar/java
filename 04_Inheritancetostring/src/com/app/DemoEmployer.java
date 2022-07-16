package com.app;
import com.module.*;
public class DemoEmployer {

public static void main(String []args)
{
	Employee e1=new Employee("Manager","Seema","abc@yahoo.com",1,1,1990);

	System.out.println(e1.toString());
	
	Employee e2=new Employee("Programmer","Geeta","xyz@gmail.com",9,9,2000);
System.out.println( e2);
Employee e3=new Employee();
System.out.println(e3);


}
}

package com.app;
import com.module.*;

public class Demo {

public static void showArray(Student  []a)
{
	System.out.println("---------Array----------");
	for(int i=0;i<3;i++)
	{
		a[i].display();
}
}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
Student []s=new Student[3];
Student s1=new Student(1,"Suresh",1,1,1990,78.0);
Student s2=new Student(2,"Ramesh",10,11,1980,80.0);
Student s3=new Student(3,"Sudhir",11,12,1970,84.0);
s[0]=s1;
s[1]=s2;
s[2]=s3;

Student []arr=new Student[3];
arr[0]=new Student(2,"Seeta",1,2,1990,76.54);
arr[1]=new Student(3,"Geeta",2,3,1998,89.54);
arr[2]=new Student(4,"Sneha",1,2,1987,60.54);
Demo.showArray(s);
}	

}

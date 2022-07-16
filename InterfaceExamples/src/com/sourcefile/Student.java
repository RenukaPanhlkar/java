package com.sourcefile;

public class Student {
public int rollno;
public String name;
public int marks;
public Student(int rollno,String name,int marks)
{
	this.rollno=rollno;
	this.name=name;
	this.marks=marks;
}
public Student()
{
	rollno=marks=0;
	name="NA";
}
 public String toString()
 {
	 return "rollno:"+rollno +"name:"+name+"marks:"+marks;
 }
}

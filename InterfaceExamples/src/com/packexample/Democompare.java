package com.packexample;

//import java.lang.reflect.Array;
import java.util.Arrays;

import com.sourcefile.Student;

public class Democompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s[]=new Student[3];
s[0]=new Student(1,"seeta",34);
s[1]=new Student(2,"Geeta",45);
s[2]=new Student(3,"Leena",89);
for(Student e:s)
{
	System.out.println(e);
	
}
Arrays.sort(s);
System.out.println("After sorting:");

for(Student e:s)
{
	System.out.println(e);
	
}	
	}

}

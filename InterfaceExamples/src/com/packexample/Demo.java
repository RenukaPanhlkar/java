package com.packexample;
import com.sourcefile.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp e[]=new Emp[3];
e[0]=new Programmer(1,2000,10);
e[1]=new Salesman(2,5000,20);
e[2]=new Admin(3, 6000);
e[0].toString();
e[0].calculateTA();

e[1].toString();
e[1].calculateTA()	;
e[2].toString();
e[2].calculateTA();

	}

}

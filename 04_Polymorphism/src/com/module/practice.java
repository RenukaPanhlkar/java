package com.module;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1;
		int no2;
	 int no3, i;
no1=0;
no2=1;
System.out.println(  no1+"\n "+no2);
for(i=2;i<=10;i++)
{
no3=no1+no2;
System.out.println(" "+no3);
no1=no2;
no2=no3;

}
	}

}

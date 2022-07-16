package com.app;

public class stringproperty {
	//private  int count=0;
public static void main(String []args)
{
	String str="Good Morning";
	int arr[]= {32,7,8,5,9,0};
	System.out.println("Size :" +arr.length);
	for(int i=0;i<str.length();i++)
		System.out.println(" "+str.charAt(i));
	int count=0;
	for(int i=0;i<str.length();i++)
		if(str.charAt(i)=='o')
	count++;
	System.out.println("count:" +count);
	
}
}

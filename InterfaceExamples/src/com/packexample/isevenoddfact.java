
package com.packexample;
import com.sourcefile.*;
import java.util.Scanner;
public class isevenoddfact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
MyNumber s=new MyNumber(n);
System.out.println("Check Even or odd:");
if(s.isEven(n)==true)
{
	System.out.println(n +" is Even no");
}
else
{
		System.out.println( n+" is Odd no");
	
}
System.out.println("Check for odd number:");
if(s.isOdd(n)==true)
{
	System.out.println(n+" is Odd no");
}
else
{
		System.out.println(n+ " is Even no");
	
}
System.out.println("Check for Prime number");
if(s.isPrime(n)==true)
	
	{System.out.println( n +"is Prime no");}
else
	{System.out.println(n +"is not Prime");}
		
	
	System.out.println("\nThe Factorial of" + n +" is : " +s.calFactorial(n));
		
	}

}

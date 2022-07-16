package com.sourcefile;

public class MyNumber implements IntOperations{
	private  int num;
	public  double fact=1;
	public MyNumber( int num)
	
	{
		this.num=num;
	}
	
	public boolean isOdd(int num)
	{
		if(this.num%2==0)
			return false;
		else
			return true;
	
	}
	public boolean isEven(int num)
	{if( this.num%2==0)
		return true;
	else
		return false;
		
	}
	public boolean isPrime(int num)
	{
		boolean temp=true;
		for(int i=2;i<this.num;i++) {
			if(this.num%i==0)
			{
				temp=false;
				break;
			}
			
		}
		return temp;
			
		}
	
	public double calFactorial(int num) 
	{
	
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		//return fact;
			
		}
		return fact;
	}
	
}

package com.module;

public class Savingaccount extends Account 
{
	private String address;
	
		 public Savingaccount()
		{
			
		}
		 public Savingaccount(int accno,String name,double balance,String address,double amount)
		 {
			 super(accno,name,balance,amount);
	         this.address=address;
	         //this.amount=amount;
		 }
		 
		 public void withdraw(double amount)
		 {
			 if(balance<=2000)
			 System.out.println("BALANCE LOW");
			 
		 else if(balance <= amount)
			 
			 System.out.println("Transcation declined\n");
		 else
			 balance=balance-(amount);
		
		 System.out.println("The Net balance is:" +balance);
		 
		 }
		 public String toString()
		 {
		 	String str;
		 	str=super.toString()+"Address :"+address+"\t";
		 	return str;
		 }
		 
}

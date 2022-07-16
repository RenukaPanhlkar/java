package com.module;

public class Recuring extends Account{
	private int installment;
	private String address;
	public Recuring()
	{
		
	}
	public Recuring(int accno,String name,double balance,double amount,String address,int installment)
	{
		super( accno, name, balance, amount);
		
		this.installment=installment; 
		this.address=address;
		
	}
	 public String toString()
	 {
	 	String str;
	 	
	 	str=super.toString()+"Address: "+address+"\t"+"Installment: "+installment;
	 	return str;
	 }
	 public void withdraw(double amount)
	 {
		// balance=balance;
		 System.out.println("withdrwal not possible\t");
		 System.out.println("The net balance is:"+balance);
		// System.out.println(+balance);
	 }
	 
	 
}

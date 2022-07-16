package com.module;

public abstract class Account {
	private String name;
	protected double balance=0;
	protected int accno;
	//protected double amount;
	protected double amount;
public Account()
{
	
}
public Account(int accno,String name,double balance,double amount)
{
	this.accno=accno;
	this.name=name;
	this.balance=balance;
	this.amount=amount;
	
}
public String toString()
{
	String str;
	str="Account no :"+accno+"\t"+"Name :"+name+"\t"+"Balance: "+balance+"\t";
	return str;
}
public abstract void withdraw(double amount);


}

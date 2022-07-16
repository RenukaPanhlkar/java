package com.app;
import com.module.*;
import java.util.Scanner;
public class Demoaccount {
	public static void main(String[] args) {

String name;
int accno;
  double balance;
 String address;
 double amount = 0;
 int installment =0;

			int choice;
			Account []b=new Account[3];
			Scanner sc=new Scanner(System.in);
			for(int j=0;j<3;j++)
			{
				
				System.out.println("1. Saving Account");
				System.out.println("2. Recurring Account");
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter  name");
					name=sc.next();
					System.out.println("Enter Acc no");
					accno=sc.nextInt();
					System.out.println("Enter balance");
				balance=sc.nextDouble();
					System.out.println("Enter Address");
					address=sc.next();
					System.out.println("Enter Amount to be withdrawn");
					amount=sc.nextDouble();
					b[j]=new Savingaccount(accno, name, balance, address, amount);
					break;
				case 2:
					System.out.println("Enter  name");
					name=sc.next();
					System.out.println("Enter Acc no");
					accno=sc.nextInt();
					System.out.println("Enter balance");
				balance=sc.nextDouble();
					System.out.println("Enter Address");
					address=sc.next();
					System.out.println("Enter Amount to be withdrawn");
					amount=sc.nextDouble();
					b[j]=new Recuring(accno, name, balance, amount,address,installment);
					break;
				}
			}
			
			for(int i=0;i<3;i++)
			
			{
				System.out.println(b[i]);
				b[i].withdraw(amount);
			}
		//display(b);
		
		
		}
		
		
	}


package linkedlist.string1;

import java.util.Scanner;

public class DemoString 
{
	public static void main(String[]args)
	{
		LinkedListString list1=new LinkedListString();
		
		String s;
		int choice;
		do 
		{
			System.out.println("1.create linked list");
			System.out.println("2.addnode at begining");
			System.out.println("3.addnode at ending");
			System.out.println("4.delete begining string");
			System.out.println("5.delete ending string");
			System.out.println("6.display");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				list1.createLinkedList(5);
				break;
			case 2:
				System.out.println("Enter string : ");
				s=sc.next();
				list1.addBeg(s);
				break;
				
			case 3:
				System.out.println("Enter string : ");
				s=sc.next();
				list1.addEnd(s);
				break;
				
			case 4:
				list1.deleteBeg();
				break;
			case 5:
				list1.deleteEnd();
				//System.out.println("Deteted string =");
				break;
				
			case 6:
				list1.display();
				break;
			
			}
			
			
		}while(choice!=0);
	}

}

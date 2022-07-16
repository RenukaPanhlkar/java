import java.util.Scanner;
public class DemoExampleint {
	public static void main(String args[])
	{
	Linkedlist list1=new Linkedlist();
	int terms,data ,pos,choice;
	//String s;
	
	do 
	{
		System.out.println("1.create linked list");
		System.out.println("2.Insert");
		System.out.println("3.Delete");
		System.out.println("4.Modify");
		//System.out.println("5.delete ");
		System.out.println("5.display");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter how many  no of node you want");
			terms=sc.nextInt();
			list1.createLinkedList(terms);
			
			break;
		case 2:
			System.out.println("Enter the data you want to insert");
			data=sc.nextInt();
			System.out.println("Enter the position where you want to insert");
			pos=sc.nextInt();
			list1.insert(data,pos);
			
			break;
			
		case 3:
			System.out.println("Enter the position you want to delete");
			pos=sc.nextInt();
			list1.delete(pos);
			break;
			
		case 4:
			System.out.println("Enter the data you want to modify");
			pos=sc.nextInt();
			System.out.println("enter the new data");
			int n=sc.nextInt();
			
			list1.modify(pos,n);
			break;
		case 5:
			list1.display();
			
			break;
			
		
		}
		
		
	}while(choice!=0);
}


}

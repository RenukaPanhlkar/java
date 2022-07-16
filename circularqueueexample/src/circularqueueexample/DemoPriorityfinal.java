package circularqueueexample;
import java.util.Scanner;
public class DemoPriorityfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=1;
		Scanner sc=new Scanner(System.in );
		Demopriority q1=new Demopriority(5);
		priority1 data;
		int pri;
		String name;
		do
		{
			System.out.println("\n1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Display");
			
			System.out.println("0. Exit");
			System.out.println("Enter Your Choice ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the name ");
				name=sc.next();
				System.out.println("Enter the Priority ");
				pri=sc.nextInt();
				data=new priority1(name, pri);
				q1.enqueue(data);
				break;
			case 2:
				data=q1.dequeue();
				if(data==null)
					System.out.println(" Queue I sEmpty ");
				else
					System.out.println(" Deleted item is "+data);
			   break;
			case 3:
				q1.display();
				break;
			}
			
		}while(choice!=0);

	}


	}



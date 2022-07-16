import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		
	
	int choice=1;
	Scanner sc=new Scanner(System.in );
	Empqueue queue=new Empqueue();
	Emp data;
	int eid;
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
			System.out.println("Enter Emp id  ");
			eid=sc.nextInt();
			System.out.println("Enter Name Of Employee ");
			name=sc.next();
			
			data=new Emp(eid,name);
			queue.enQueue(data);
			break;
		case 2:
			data=queue.deQueue();
			if(data==null)
				System.out.println(" Queue I sEmpty ");
			else
				System.out.println(" Deleted Element is "+data);
		   break;
		case 3:
			queue.display();
			break;
		}
		
	}while(choice!=0);
}


}

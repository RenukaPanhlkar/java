
package circularqueueexample;
import java.util.Scanner;
public class democircular {
public static void main(String args[])
{
int data,choice=1;
Scanner sc=new Scanner(System.in);
mycirq1 q1=new mycirq1(5);
do {
	System.out.println("1.Enqueue");
	System.out.println("2.dequeue");
	System.out.println("3.display");
	System.out.println("0.Exit");
	System.out.println("Enter your choice");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Enter integer values");
		data=sc.nextInt();
		q1.enqueue(data);
		break;
	case 2:
		data=q1.dequeue();
		if(data==-1)
		
			System.out.println("Queue is empty");
		else
			System.out.println("Deleted element is" +data);
		break;
	case 3:
		q1.display();
		break;
	
	}		
	}while(choice!=0);
}
}


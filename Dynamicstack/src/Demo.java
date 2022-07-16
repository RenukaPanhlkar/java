import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dynamic list1=new Dynamic();
Node top,head = null;

Scanner sc=new Scanner(System.in );
int data,ele;
//String name;
int choice=1;
do
{

	System.out.println("1. Push");
	System.out.println("2. pop");
	System.out.println("3. Display");
	System.out.println("0. Exit");
	System.out.println(" Enter Your Chocie ");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println(" Enter data ");
		data=sc.nextInt();
		
		list1.push(data);
		break;
	case 2:
		ele=list1.pop();
		if(ele==-9999)
			System.out.println(" Stack Is Empty ");
		else
		    System.out.println("Poped element is :" +ele);
	    break;
	case 3:
		list1.display();
		//System.out.println(list1);
		
		break;
		
		
	}
	

}while(choice!=0);

	}

}

import java.util.Scanner;
public class oneDArray {
public static void accept(int a[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter " +a.length+ "Element");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
}

public static void display(int a[])
{
	System.out.println("------------------------");
	for(int i=0;i<a.length;i++)
	{
	System.out.println(" " +a[i]);
	
	}
	System.out.println("------------------------");
}
	
public static void max(int a[])
{
	int i,j,temp;
	int size=a.length,cnt;
	int max=a[0];
	for( i=1;i<a.length;i++)
	if(max<a[i])
	{
		max=a[i];
		
	}
	System.out.println("Largest element is :" +max);
}

public static void rotateleft(int a[])
{
	 int temp;
	 System.out.println("Enter the size you want to rotate");
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	
	//for(int j=0;j<k;j++)
	//{
		temp=a[0];
	
	for(int i=0;i<a.length-1;i++)
	{
		a[i]=a[i+1];
	}
		a[a.length-1]=temp;
	
	//}
	
System.out.println("The rotated array :");
for(int i=0;i<a.length;i++)
System.out.println(a[i]);

}
public  static void rotateright(int a[])
{
	int temp;
	 System.out.println("Enter the size you want to rotate");
	Scanner sc=new Scanner(System.in);
	 int k=sc.nextInt();
	
	//for(int j=0;j<k;j++)
	//{
		temp=a[a.length-1];
	
	for(int i=a.length-1;i>=1;i--)
	{
		a[i]=a[i-1];
	}
		a[0]=temp;
	
	//}
	
System.out.println("The rotated array :");
for(int i=0;i<a.length;i++)
System.out.println(a[i]);

}
public static void maxmineven(int a[])
{
	int b[]=new int[a.length];
	int i,j;
	int cnt;
	int max=0,min=0;
	for( i=0;i<a.length;i++)
	{
	if(a[i]%2==0)
	{

	b[i]=a[i];
	}	
	//else {
	//	continue;}
	//}
	//for(i=0;i<b.length;i++)
	//System.out.println("Even no " +b[i]);
	
	 max=b[0];
	 min=b[0];
	for( i=0;i<b.length;i++)
	{
		if(max<b[i]) {
			max=b[i];
	}
		if(min>b[i])
		{
			min=b[i];
		}
	}	
	}
	System.out.println("Largest  even element is :" +max);
	System.out.println("Smallest even element is :" +min);
	
}

public  static void stringmaxmin(String s[]) {
	//String  max=s[0];
	String min=s[0];
	for(int i=0;i<s.length;i++)
	{
		if(s[i].compareTo(min)<0)
		{
			min=s[i];
		}
	}
	System.out.println("smallest string is "+ min);
}
public static void repeatno(int a[])
{//int b[]=new int[5];
int temp=a[0];

	for(int i=0;i<a.length;i++)
	{
		 
		for(int j=i+1;j<a.length;j++) {
		 if(a[i]==a[j])
		{
			
			//b[i]=a[i];
			System.out.println("The element is "+a[i]);
		}
		
		}
	}
}


public static void main(String args[]) {
	
int ch=0;

int[]a=new int [5];
Scanner sc=new Scanner(System.in);
do
{
	System.out.println("1.Accept Array");
	System.out.println("2.Display Array");
	System.out.println("3.Max element");
	System.out.println("4.Rotateleft");
	System.out.println("5.Rotateright ");
			System.out.println("6.maxmineven ");
			System.out.println("7.String min");	
			System.out.println("8.Repeatno");
	System.out.println("Enter your choice");
	ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		accept(a);
	break;
	case 2:
		display(a);
		break;
	
	case 3:
		max(a);
		
	break;
	case 4:
		
		rotateleft(a);
			break;
	
	case 5:
		rotateright(a);
		break;
			case 6:
				maxmineven(a);
				break;
			
			case 7:
				String s[]=new String[3];
				System.out.println("enter the string");
				for(int i=0;i<s.length;i++)
				{
				s[i]=sc.next()	;
				}
					stringmaxmin(s);
				break;
			case 8:repeatno(a);
				break;
				default:System.out.println("End of Program");
	}
	


}while(ch!=0);
}



}




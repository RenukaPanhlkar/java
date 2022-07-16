import java.util.Scanner;
public class ArrayExample {
	
private int size;
private static int flag=1;
int []arr=new int [5];
		
static Scanner sc=new Scanner(System.in);

public static void accept(int a[])
{
	System.out.println("Ener the array element");
	for(int i=0;i<5;i++)
	{
		a[i]=sc.nextInt();
	}
	
}
public static void display(int a[])

{System.out.println(" The array element");
for(int i=0;i<5;i++)

{
	System.out.println(a[i]+"\t");
}
	
}

public static void search(int n,int a[])

{//System.out.println(" The array element");
int cnt=0;
	for(int i=0;i<5;i++)
{
	if(a[i]==n)
	{
	System.out.println("The element is found at"+"["+i+"]"+"\t");
	 cnt=1;
	
}
else
{
	cnt=0;
}
	
}

if(cnt==0)
	System.out.println("The element doesnot exists");
	
}

public static void sum(int a[]) {
	int sum=0;
	for(int i=0;i<5;i++)
	{
	sum=sum+a[i];
	}
	System.out.println("The sum of array is "+ sum);
}

public static void sumodd(int a[])
{
	int sum=0;
	for(int i=0;i<5;i++)
	{
		if(a[i]%2==0)
			continue;
		else
			sum=sum+a[i];
	}
	
	System.out.println("The sum of all odd numbers is "+sum);
	
	
}
public  static void reverse(int a[])
{
	int i,j,temp;
	for( i=0,j=4;i<=j;i++,j--)
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
System.out.println("The reversed array is");
for( i=0;i<5;i++)
{
	System.out.println(a[i]);
}

}

public  static void copyarray(int a[]) {
	
int b[]=new int[5];

for(int i=0;i<5;i++)
{
	b[i]=a[i];
}
System.out.println("The new copied array is");
for(int i=0;i<4;i++)
{
System.out.println(b[i]);
}
}
public static void main(String args[])
{
	int ch=0;
	
	int[]a=new int [5];
	Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println("1.Accept Array");
		System.out.println("2.Display Array");
		System.out.println("3.Search");
		System.out.println("4.count sum of odd numbers");
		System.out.println("5.Reverse ");
				System.out.println("6.sum of array ");
				System.out.println("7.copy array ");	
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
			
			int n;
			System.out.println("Enter the element you want to seacrh");
			n=sc.nextInt();
			search(n,a);
			
		break;
		case 4:
			
			sumodd(a);
				break;
		
		
				case 5:
					reverse(a);
					break;
				case 6:
					sum(a);
					break;
				case 7:
					copyarray(a);
					break;
					
					default:System.out.println("End of Program");
		}
		
	

}while(ch!=0);
}



}

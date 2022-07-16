import java.util.Scanner;

public class Demo2 {
public static void main(String args[])
{
	try {
	
	int size;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter array element");
	for( int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println(("The array is:"));
	for( int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	int pos,ele;
	System.out.println("Enter position to print");
	pos=sc.nextInt();
	ele=arr[pos];
	System.out.println("Element at pos"+ pos + "=" + ele);
	
	}
	catch(NullPointerException e)
	{ 
		System.out.println("Nothing to print");
	}
	catch(ArrayIndexOutOfBoundsException e )
	{
		System.out.println(e);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}	
finally

{
	System.out.println("In Finally block");
}

}
		
}



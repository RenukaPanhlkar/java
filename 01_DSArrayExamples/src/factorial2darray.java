import java.util.Scanner;
public class factorial2darray {
	public static void accpet(int a[][])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array element");
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++) 
				a[i][j]=sc.nextInt();
			}
		}
	

public  static void display(int a[][])
{
	System.out.println("The Array is:");
	for(int i=0;i<2;i++)
	{
		for( int j=0;j<2;j++) 
		{
			System.out.print(a[i][j]);
		} 
		System.out.println();
		
		}
	}
public static void  factorial(int a[][])
{
	int fact,n,i,j,temp=0;
	int b[][]=new int[2][2];
	for(i=0;i<2;i++)
	{
		fact=1;
		n=0;
		for(j=0;j<2;j++)
		{
			n=a[i][j];
		b[i][j]=fact(n);
		}}
	for(i=0;i<2;i++)
	{
		//System.out.println();
	
		for(j=0;j<2;j++)
		{
			System.out.print(b[i][j]+"\t");
		}
		System.out.println();
}
	}

public static int fact(int n)
{
	int i,fact=1;
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
		
	}
	return fact;
}

public static void main(String args[])
{
	int a[][]=new int[2][2];
	//System.out.println("Enter the array");
	accpet(a);
	//System.out.println("The array is");
	display(a);
	System.out.println("factorial matrix");
	factorial(a);
}

	
	


}

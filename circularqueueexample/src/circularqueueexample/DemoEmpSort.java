//selection sort
package circularqueueexample;
import java.util.Scanner;
public class DemoEmpSort {
	//emp e[];
	 
	public static void accept(emp e[])
	{
		int id;
	 double sal;
String name;
		Scanner sc=new Scanner(System.in );
		//emp e[]=new emp[5];
		System.out.println(" enter "+e.length+ " elements ");
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter emp id");
		id=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter emp salary");
		sal=sc.nextDouble();
		e[i]=new emp(id,name,sal);
		}
		
			
	}
	public static void display(emp e[])
	{
		System.out.println("--------------------------------");
		for(int i=0;i<e.length;i++)
			System.out.println("  "+e[i]);
		System.out.println();
	}
	public static void selectionSort(emp []e)
	{
		int i,j,index;
		emp small;
		
		int n=e.length;
		for(j=0;j<n-1;j++)
		{
			small=e[j];
			index=j;
			for(i=j+1;i<n;i++)
			{
				if(e[i].getSalary()<small.getSalary())
				{
					small=e[i];
					index=i;
			}
			}
			e[index]=e[j];
			e[j]=small;
		}
	}
	public static void main(String[] args) {
		
		int no;
		Scanner sc=new Scanner(System.in );
		System.out.println("enter Size for array ");
		no=sc.nextInt();
		emp []arr=new emp[no];
		accept(arr);
		display(arr);
		selectionSort(arr);
		display(arr);
		
		
	}

}

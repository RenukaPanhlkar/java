import java.util.Scanner;

public class insertionsort {
//Emp data;
//Emp a[]=new Emp[5];
 int id;
 String name;
 double sal;
	/*public static void accept(Emp [] a)
	{


		Scanner sc=new Scanner(System.in );
		for(int i=0;i<a.length;i++)
		System.out.println(" enter Empid elements ");
		{
			 id=sc.nextInt();
			System.out.println("Enter name");
			name=sc.next();
			System.out.println("Enter Salary");
			sal=sc.nextDouble();
			Emp e=new Emp(id,name,sal);
			//a[i]=e;
	}*/
	public static void display(Emp []a)
	{
		System.out.println("--------------------------------");
		for(int i=0;i<a.length;i++)
			System.out.print("  "+a[i]);
		System.out.println();
	}
	public static void insertionSort(Emp a[])
	{
		Emp e1;
	double sal;
		int i,j;
		//int n=a.length;
		for(i=1;i<a.length;i++)
		{
			e1=a[i];
			sal=a[i].getSalary();
			j=i-1;
			while(j>=0&&a[j].getSalary()>sal)
				
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=e1;
			
			}
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in );
		Emp e[]=new Emp[5];
		for(int i=0;i<e.length;i++)
		{
			System.out.println(" enter Empid  ");
		
			  int id=sc.nextInt();
			System.out.println("Enter name");
			 String name=sc.next();
			System.out.println("Enter Salary");
			 double sal=sc.nextDouble();
			Emp e1=new Emp(id,name,sal);
			//int i;
			e[i]=e1;
	}
		display(e);
		insertionSort(e);
		display(e);
		
}}
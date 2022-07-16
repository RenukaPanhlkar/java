import java.util.Scanner;
public class twoDArray {
	
	public static void accpet(int a[][])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array element");
		//int arr[][]=new int [3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) 
				a[i][j]=sc.nextInt();
			}
		}
	

public  static void display(int a[][])
{
	System.out.println("The Array is:");
	for(int i=0;i<3;i++)
	{//System.out.println();
		for( int j=0;j<3;j++) 
		{
			System.out.print(a[i][j]);
		} System.out.println();
		//a[i][j]
		}
	}

public  static void transpose(int a[][])
{
	int b[][]=new int [3][3];
	
	
for(int i=0;i<3;i++)
{ System.out.println("");
	for(int j=0;j<3;j++) 
		System.out.print(a[j][i]);
	}
System.out.println();
}
public  static void rowsum(int a[][])
{
	int i,j,sum;
int b[]=new int[3];
System.out.println("Row wise sum is; ");
for(i=0;i<3;i++)
 {sum=0;
	for(j=0;j<3;j++) 
	{		
		sum=a[i][j]+sum;

}
	//for(i=0;i<b.length;i++) {
		System.out.println( sum);	
	}
}

public  static void colsum(int a[][])
{
	
	int i,j,sum;
	int b[]=new int[3];
	System.out.println("Column wise sum is; ");
	for(i=0;i<3;i++)
	 {
		sum=0;
		for(j=0;j<3;j++) 
{		
			sum=a[j][i]+sum;
	
	}
		//for(i=0;i<b.length;i++)
			System.out.println( sum);	
	}

}
public  static void diognal(int a[][])
{
	int i,j;
	for(i=0;i<3;i++)
	 {
		for(j=0;j<3;j++) 
		{		
			
			if(i==j)
			System.out.println( " "+a[i][j]);	
	}
	}
}

public  static void  sumall(int a[][]) {
	
	int i,j,sum = 0;
	int b[]=new int[3];
	System.out.println(" sum of all elements is; ");
	for(i=0;i<3;i++)
	 {//sum=0;
		for(j=0;j<3;j++) 
		{		
			sum=a[i][j]+sum;
		
		}
	 }
	System.out.println( " "+sum);
}


public  static void prime(int a[][])
{
	int cnt=1,n = 0;
	for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				n=a[i][j];
			
			cnt=0;
				for(int k=2;k<n;k++)
				{
					if(n%k==0)
					{
						cnt=1;
						break;
					}
					//else
					//continue;
			}
			
		if(cnt==0)
		{
			System.out.println("The prime no is "+ n+"\t");
			}
			}
		}
	}	
 

	

public static void main(String args[])
{
	int ch=0;

	int a[][]=new int [3][3];
	Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println("1.Accept Array");
		System.out.println("2.Display Array");
		System.out.println("3.sumall");
		System.out.println("4.diognal");
		System.out.println("5.colsum");
				System.out.println("6.roesum");
				System.out.println("7.transpose");	
				System.out.println("8.prime");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			accpet(a);
		break;
		case 2:
			display(a);
			break;
		
		case 3:
			sumall(a);
			
		break;
		case 4:
			
		diognal(a);
				break;
		
		case 5:
		colsum(a);
			break;
				case 6:
		rowsum(a);
					break;
				case 7:
					transpose(a);
					break;
				case 8:
					prime(a);
					break;
					default:
						System.out.println("End of program");
}

	
	


	}while(ch!=0);
}
}

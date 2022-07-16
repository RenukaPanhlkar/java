import java.util.Scanner;
public class Demobook {
public static void main(String args[])
{
	int cnt=0;
	int bid;
	String bname;
	double price;
	int ch=1;
	boolean flag=true;
	Book []b=new Book[5];
	Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println("1.Add Book Record");
		System.out.println("2.Display Record");
		System.out.println("3.Modify Record");
		System.out.println("4.Search Record");
		System.out.println("5.Count");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enetr book id");
			bid=sc.nextInt();
			System.out.println("Enetr book name");
			bname=sc.next();
			System.out.println("Enetr book price");
			price=sc.nextDouble();
			b[cnt]=new Book(bid,bname,price);
			cnt++;
		break;
		case 2:
			
			for(int i=0;i<cnt;i++)
				System.out.println(b[i]+"\n");
			break;
		
		case 3:
			System.out.println("Modify by book id");
			System.out.println("Enter the bookid for the record you want to modified");
			bid=sc.nextInt();
			for(int i=0;i<cnt;i++)
				
			{
				if (b[i].getBid()==bid)
			{
				b[i].setBookname("C++");
				//price=350;
				b[i].setPrice(700);
				System.out.println("Record updated sucessfully");
				System.out.println(b[i]);
	flag=true;
			}
		else
			{//System.out.println("Record not found");
				 flag=false;
			//	break;
			
			}}
			if(flag==false)
				System.out.println("Record not found");
			
		break;
		case 4:
			System.out.println("Enter the book name you want to search");
			bname=sc.next();
			for(int i=0;i<cnt;i++)
			{
				if(b[i].getBookname().equals( bname)==true)
				{
					System.out.println("The record found ");
					System.out.println(b[i]);
					flag=true;
				}
			
				else
				{
					flag=false;
					//System.out.println("Record not found");
					//break;
				}
			}
			if(flag==false)
				System.out.println("The Record not found");
				break;
		
		
				case 5:
					System.out.println("Total number of book avaolable are: " +cnt);
					break;
					
					default:System.out.println("End of Program");
		}
		
	

}while(ch!=0);
}
}



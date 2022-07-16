import java.util.Scanner;


public class BankDemo {
	public static void display(Bank_Account []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].balance>=5000)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {

		String name;
		int accno;
		  double balance;
		 String address;
		 double amount = 0;
		 double loanamount =0;

					int choice;
					Bank_Account []b=new Bank_Account[2];
					Scanner sc=new Scanner(System.in);
					for(int j=0;j<2;j++)
					{
						
						System.out.println("1. Saving Account");
						System.out.println("2. Loan Account");
						System.out.println("Enter your choice");
						choice=sc.nextInt();
						switch(choice)
						{
						case 1:
							System.out.println("Enter  name");
							name=sc.next();
							//System.out.println("Enter Acc no");
							//accno=sc.nextInt();
							System.out.println("Enter balance");
						balance=sc.nextDouble();
							System.out.println("Enter Address");
							address=sc.next();
							System.out.println("Enter Amount to be deposit");
							amount=sc.nextDouble();
							b[j]=new SavingAccount( name, balance, address, amount);
							break;
						case 2:
							System.out.println("Enter  name");
							name=sc.next();
							//System.out.println("Enter Acc no");
							//accno=sc.nextInt();
							System.out.println("Enter balance");
						balance=sc.nextDouble();
							//System.out.println("Enter Address");
							//address=sc.next();
							System.out.println("Enter Loanamount");
							loanamount=sc.nextDouble();
							b[j]=new Loan_Account( name, balance, loanamount);
							break;
						}
					}
					
					for(int i=0;i<2;i++)
					
					{
	                       b[i].print();
					}
					System.out.println("Details of Customers with balance>5000");
				System.out.println("------------------------------------------");
					display(b);
				
				
				}
}

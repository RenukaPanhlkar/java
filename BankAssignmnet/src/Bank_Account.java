
public class Bank_Account {
	 
		protected String name;
		protected double balance=0;
		protected  static int cnt=0;
		protected int accno;
		//protected double amount;
		protected double amount;
	public Bank_Account()
	{cnt++;
	accno=cnt;
		name="NA";
		balance=0;
	}
	public Bank_Account(String name,double balance)
	{
cnt++;
		accno=cnt;
		this.name=name;
		this.balance=balance;
		
		
	}
	public String toString()
	{
		String str;
		str="Account no :"+accno+"\t"+"Name :"+name+"\t"+"Balance: "+balance+"\t";
		return str;
	}
	public void print() {
		// TODO Auto-generated method stub
		//toString();
	}
	
	}
	


	



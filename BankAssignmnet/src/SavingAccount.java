
public class SavingAccount extends Bank_Account implements Printable {
	private String address;
	private final int intrate=6;
	private int t=5;
	private double amount;
	 /*public SavingAccount()
	{address="NA";
		
	}*/
	 public SavingAccount(String name,double balance,String address,double amount)
	 {
		 super(name,balance);
        this.address=address;
        this.amount=amount;
	 }
	 
	 public void calculate (double amount)
	 {
		 System.out.println("The orignal amount is :" +balance);
		 balance=amount+balance+(balance*t*intrate)/100;
	
	 System.out.println("The Net balance is:" +balance);
	 
	 }
	 public void display() {
		 System.out.println("Accono: "+accno +"\t"+"Name: "+ name+"\t"+"Address: "+address);
	 }
	 
	 public String toString()
	 {
	 	String str;
	 	str=super.toString()+"Address :"+address+"\t";
	 	return str;
	 }

	@Override
	public void print() {
		// TODO Auto-generated method stub
		display();
		calculate(amount);
	}
	 
}

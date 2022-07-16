
public class Loan_Account extends Bank_Account implements Printable{
	private double loanamount;
	private   final int rateofintrest=12;
	 public Loan_Account()
	{
		 loanamount=0;
		
	}
	 public Loan_Account(String name,double balance,double loanamount)
	 {
		 super(name,balance);
        this.loanamount=loanamount;
        //this.amount=amount;
	 }
	 
	 public void calculate(double loanamount)
	 {
		System.out.println("The Loan amount is" +loanamount);
	balance=balance-((loanamount*rateofintrest*2)/100);
	 System.out.println("The Net balance is:" +balance);
	 
	 }
	 public void display() {
		 System.out.println("Accono: "+accno +"\t"+"Name:"+name);
	 }
	 
	 public String toString()
	 {
	 	String str;
	 	str=super.toString()+"Loan Amount:" +loanamount+"\t";
	 	return str;
	 }
	@Override
	public void print() {
		// TODO Auto-generated method stub
		display();
		calculate(loanamount);
	}
	 
}

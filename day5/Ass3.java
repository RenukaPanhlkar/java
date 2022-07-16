class Account
{
private  int accno,balance;
private int t=2;
private String name;
static int i_rate;

public Account()

{
accno=111;
balance=1000;
name="xyz";
}
public Account(int a,int b,String n)
{
accno=a;
balance=b;
name=n;
}
static{
	i_rate=10;
}
public void show()
{
System.out.println("The Account Information is");
System.out.println("--------------------------");
System.out.println("accno=" +accno);
System.out.println("balance=" +balance);
System.out.println("name=" +name);
System.out.println("--------------------------");
}
public int amount()

{//int t=2; 
balance=balance+(balance*t*i_rate)/100;
return balance;
}

static void updateIntRate()
{
	i_rate=20;
}

}

public class Ass3
{
public static void main(String []s)
{
Account a1=new Account();

a1.amount();
a1.show();
//a1.amount();
//Account.updateIntRate();
//a1.show();
//a1.amount();
Account a2=new Account(102,2000,"renu");
//a2.show();
//a2.amount();
Account.updateIntRate();

a2.amount();
a2.show();
}
}


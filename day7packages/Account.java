package banking;
 public class Account
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
i_rate=5;
}
public Account(int a,int b,String n ,int i_rate)
{
accno=a;
balance=b;
name=n;
i_rate=i_rate;
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



}


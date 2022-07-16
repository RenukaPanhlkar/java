class Account
{
private  int accno,balance;
private String name;
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
public void show()
{
System.out.println("The Account Information is");
System.out.println("--------------------------");
System.out.println("accno=" +accno);
System.out.println("balance=" +balance);
System.out.println("name=" +name);
System.out.println("--------------------------");
}
}
public class Info
{
public static void main(String []s)
{
Account a1=new Account();
a1.show();
Account a2=new Account(102,2000,"renu");
a2.show();
}
}


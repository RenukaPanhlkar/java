package app3;
import  banking.Account;
public class AccountDemo

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
Account a2=new Account(102,2000,"renu",20);
//a2.show();
//a2.amount();
//Account.updateIntRate();

a2.amount();
a2.show();
}
}


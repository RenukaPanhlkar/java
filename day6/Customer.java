class Customer
{
private int cid;
private String name;
private String email;
private Address addrs;

public Customer()
{
int cid=0;
String name="NULL";
String email="NULL";
addrs=new Address();
}

public Customer(int cid,String name,String email,String a1,String c1,String p1 )
{
this.cid=cid;
this.name=name;
this.email=email;
this.addrs=new Address(a1,c1,p1);
}

public Customer(int cid,String name,String email,Address addrs )
{
this.cid=cid;
this.name=name;
this.email=email;
this.addrs=addrs;
}
public void showCustomer()
{
System.out.println("Customer Inforamtion");
System.out.println("=====================");
System.out.println("Customer id:" +cid);
System.out.println("Customer Name:" +name);
System.out.println("Customer Email:" +email);
addrs.displayAddress();
}
}
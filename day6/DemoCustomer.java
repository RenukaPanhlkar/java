class DemoCustomer

{
public static void main(String []args)
{
Address a1=new Address("Agashivnagar","Karad","12345");
Address a2=new Address("Kharghar","Navimumbai","67899");
Customer c1=new Customer(1,"Aakash","akash@abc.com",a1);
Customer c2=new Customer(2,"Vihaan","vihaan@xyz.com",a2);
Customer c3=new Customer(3,"Vikas","vikas@xyz.com","malkapur","navimumbai","7857");
c1.showCustomer();
c2.showCustomer();
c3.showCustomer();
}
}
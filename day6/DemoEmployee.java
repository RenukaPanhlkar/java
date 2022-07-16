class DemoEmployee

{
public static void main(String []args)
{
Address a1=new Address("Agashivnagar","Karad","12345");
Address a2=new Address("Kharghar","Navimumbai","67899");
Date d1=new Date(23,8,2021);
Date d2=new Date(18,6,2018);
Employee e1=new Employee(1,"Aakash","akash@abc.com",a1,d1);
Employee e2=new Employee(2,"Vihaan","vihaan@xyz.com",a2,d2);
Employee e3=new Employee(3,"Vikas","vikas@xyz.com","malkapur","navimumbai","7857",1,1,1990);
e1.showEmployee();
e2.showEmployee();
e3.showEmployee();
}
}
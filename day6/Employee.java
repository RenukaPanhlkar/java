class Employee
{
private int eid;
private String name;
private String email;
private Date jdate;
private Address addrs;

public Employee()
{
int eid=0;
String name="NULL";
String email="NULL";
jdate=new Date();
addrs=new Address();
}

public Employee(int eid,String name,String email,String a1,String c1,String p1,int dd,int mm,int yy )
{
this.eid=eid;
this.name=name;
this.email=email;
this.addrs=new Address(a1,c1,p1);
this.jdate=new Date(dd,mm,yy);
}

public Employee(int eid,String name,String email,Address addrs,Date jdate )
{
this.eid=eid;
this.name=name;
this.email=email;
this.addrs=addrs;
this.jdate=jdate;
}
public void showEmployee()
{
System.out.println("Employee Inforamtion");
System.out.println("=====================");
System.out.println("Employee id:" +eid);
System.out.println("Employee Name:" +name);
System.out.println("Employee Email:" +email);
System.out.println("Employee Joining Date:");
jdate.showDate();
System.out.println("Employee Address:");
addrs.displayAddress();

}
}
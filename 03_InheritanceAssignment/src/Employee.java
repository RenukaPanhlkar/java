
public class Employee  extends Person{
	private int eid;
	private double salary;
	public Employee()
	{
		eid=0;
		salary=0;
	}
	public Employee(int eid,String name,int dd,int mm,int yy,double salary)
	{
		super(name,dd,mm,yy);
		this.eid=eid;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("-------------------");
		System.out.println("Empid  :" +eid);
		super.display();
		System.out.println("Salary :"+salary);
	}
}

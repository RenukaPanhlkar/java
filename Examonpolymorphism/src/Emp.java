
abstract class Emp {
private int empid;
private String name;
public Emp()
{
	super();
}
public Emp(int empid, String name) {
	super();
	this.empid = empid;
	this.name = name;
}
public abstract float calSalary();
}

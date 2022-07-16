
public class Emp {
int eid;
String name;
double salary;
public Emp(int eid, String name, double salary) {
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Emp [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}

package circularqueueexample;

public class emp {
	private int eid;
	private double salary;
	private String name;
	
	public emp(int eid,String name,double salary)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
		
}

	@Override
	public String toString() {
		return "Employee details [eid=" + eid + ", salary=" + salary + ", name=" + name + "]";
	}

	public double getSalary() {
		return salary;
	}

	
}

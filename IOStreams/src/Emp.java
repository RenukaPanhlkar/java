
import java.io.Serializable;
public class Emp  implements Serializable {
	private int empid;
	private String name;
	private int salary;
	//private Date join_date;
	//private transient int com_months;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(int empid, String name, int salary) {
		
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		//this.join_date = new Date(dd,mm,yy);
		//this.com_months = com_months;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}


}

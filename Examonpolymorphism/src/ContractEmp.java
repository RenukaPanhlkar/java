
public class ContractEmp  extends Emp{
private float workingdays,chargesperday;

	public ContractEmp() {
	super();
	// TODO Auto-generated constructor stub
}

public ContractEmp(int empid, String name,float workingdays,float chargesperday) {
	super(empid, name);
	this.workingdays=workingdays;
	this.chargesperday=chargesperday;
	// TODO Auto-generated constructor stub
}

	@Override
	public float calSalary() {
		// TODO Auto-generated method stub
		return this.chargesperday*this.workingdays;
	}

}

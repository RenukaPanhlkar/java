
public class SalariedEmp extends Emp {
private float basic,allowance,pf;

	public SalariedEmp(int empid, String name,float basic,float allowance,float pf) {
	super(empid, name);
	this.basic=basic;
	this.allowance=allowance;
	this.pf=pf;
	// TODO Auto-generated constructor stub
}

	@Override
	public float calSalary() {
		// TODO Auto-generated method stub
		return (this.basic+this.allowance-this.pf);
	}

}

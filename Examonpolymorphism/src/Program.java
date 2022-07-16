
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	Emp []emps=new Emp[3];
emps[0]=new ContractEmp(1001,"Amit",24.0f,980.0f);
emps[1]=new SalariedEmp(1004,"Rahul",12000.0f,6000.0f,800.0f);
emps[2]=new SalariedEmp(1010,"Richa",14000.0f,8000.0f,900.0f);
for(Emp e:emps)
{
	System.out.println("Total salary :" +String.format("%.2f",e.calSalary()));
}
}
catch(Exception e) {
	e.printStackTrace();
}
	}

}

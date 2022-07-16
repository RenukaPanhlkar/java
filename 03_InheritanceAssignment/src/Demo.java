
public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("Hello");
	Employee s1=new Employee();
	s1.display();
	Employee s2=new Employee(001,"Seeta",1,1,1990,10000.0);
	s2.display();
	Employee s3=new Employee(002,"Geeta",12,10,1998,20000.0);
	s3.display();
	Person p1=new Employee(003,"Gopal",13,11,2001,25000);
	p1.display();
	Person p2=new Employee();
	p2.display();
	}
}

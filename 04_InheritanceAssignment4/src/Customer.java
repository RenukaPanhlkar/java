
public class Customer {

	private String name;
	private String email;
	private  Date bdate;
	public Customer()
	{
		name="NA";
		email="NA";
		bdate=new Date();
		
	}
	public Customer(String name,String email,Date d1)
	{
		this.name=name;
		this.email=email;
		this.bdate=d1;
		
	}
	
	public Customer(String name, String email,int dd,int mm,int yy)
	{
		this.name=name;
		this.email=email;
		this.bdate=new Date(dd,mm,yy);
		
	}
	public void display()
	{
		System.out.println("Name of customer :" +name);
		System.out.println("Email  :" +email);
		bdate.display();
	}
}


public class Regcustomer extends Customer{
private int rgno;
public Regcustomer()
{
	rgno=0;
}
public Regcustomer(int rgno,String name,String email,int dd,int mm,int yy)
{
	super(name,email,dd,mm,yy);
	this.rgno=rgno;
	
}
public void display()
{
	System.out.println("-------------------------");
	

System.out.println("Registration no :" +rgno);
super.display();

}
}
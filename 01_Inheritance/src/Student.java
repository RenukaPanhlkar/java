
public class Student extends Person {
private int rno;
private double per;
public Student()
{
	rno=0;
	per=0;
}
public Student(int rno,String name,int dd,int mm,int yy,double per)
{
	super(name,dd,mm,yy);
	this.rno=rno;
	this.per=per;
}
public void display()
{
	System.out.println("-------------------");
	System.out.println("Rno  :" +rno);
	super.display();
	System.out.println("Per :"+per);
}
}

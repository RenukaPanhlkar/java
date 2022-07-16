package office.staff;
import office.utility.Newdate;
public class Newperson
{

private String name;
 private Newdate bdate;
public Newperson()
{

name="seeta";
bdate=new Newdate(1,1,1990);
}
public Newperson(String name, int dd,int mm,int yy)
{

this.name=name;
this.bdate=new Newdate(dd,mm,yy);
}
public void showstudent()
{
System.out.println("Name :  " +name);
bdate.showDate();
}
}

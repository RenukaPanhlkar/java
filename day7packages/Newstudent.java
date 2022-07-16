package office.staff;
public class Newstudent
{
private int rno;
private String name;
public Newstudent()
{
rno=1;
name="seeta";
}
public Newstudent(int rno,String name)
{
this.rno=rno;
this.name=name;
}
public void showstudent()
{
System.out.println("Rno"+rno+"Namr"+name);
}
}
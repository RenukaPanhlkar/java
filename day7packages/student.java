package student;
public class Student
{
private String name;
private int rno;

public Student()
{
name="NA";
rno=0;
}
public Student(String name,int rno)
{
this.name=name;
this.rno=rno;
}
public  void showdata()
{
System.out.println("Name of Student:"  +name);
System.out.println("Roll no:"  +rno);
}
}




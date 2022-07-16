package app1;
import student.Student;
public class StudentDemo
{
public static void main(String []args)
{
System.out.println("*******************);
Student s1=new Student("Vihaan",1);
s1.showdata();
System.out.println("*******************);
Student s2=new Student("Rohit",2);
s2.showdata();
System.out.println("*******************);
Student s3=new Student();
s3.showdata();
System.out.println("*******************);
}
}
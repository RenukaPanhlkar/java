import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
public class StudentCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student []s=new Student[5];
s[0]=new Student(101,"Seeta",45);
s[1]=new Student(102,"Geeta",40);
s[2]=new Student(106,"Meeta",89);
s[3]=new Student(108,"Neeta",54);
s[4]=new Student(104,"Sujeeta",67);

Scanner sc=new Scanner(System.in);
System.out.println("Enter your Preference");
System.out.println( "1-Sort by Roll no");
System.out.println( "2-Sort by Name");
System.out.println( "3-Sort by Marks");
int c=sc.nextInt();
switch(c)
{
case 1:
	Arrays.sort(s,new RollComparer());
	for(Student arr:s)
		System.out.println(arr);
	break;
case 2:
	Arrays.sort(s,new nameComparer());
	for(Student arr:s)
		System.out.println(arr);
	break;
case 3: 
	Arrays.sort(s,new MeritComparer());
	for(Student arr:s)
	System.out.println(arr);
break;
default:
	System.out.println("Invalid Input");
}
	}

}

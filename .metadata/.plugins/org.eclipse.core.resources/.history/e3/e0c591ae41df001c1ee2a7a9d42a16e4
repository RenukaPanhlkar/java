import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ass1 {
	public static void main(String args[])
	{
	//List list=new ArrayList();
	List<String> names = new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the names");
	for(int i=1;i<=3;i++) {
	String str=sc.next();
	names.add(str);}
	
	
	System.out.println(names);
	System.out.println("Enter the index which you want to remove");
	int index=sc.nextInt();
	names.remove(index);
	System.out.println(names);
	System.out.println("Enter the name you want to remove");
	String str1=sc.next();
	names.remove(str1);
	System.out.println(names);
	Collections.sort(names);
	for(String s:names)
	{
		System.out.println(s);
	}
System.out.println("Enter the name you want to chk");
str1=sc.next();
System.out.println(names.contains(str1));
System.out.println("the sring found at index" +names.indexOf(str1));
System.out.println("Using iterator:");
System.out.println("********************");
Iterator <String>lit=names.iterator();
while(lit.hasNext())
	System.out.println(lit.next());
System.out.println("Reverse the contents:");
ListIterator<String>lit1=names.listIterator();
while(lit1.hasNext())
	lit1.next();
while(lit1.hasPrevious())
	System.out.println(lit1.previous());
}
}
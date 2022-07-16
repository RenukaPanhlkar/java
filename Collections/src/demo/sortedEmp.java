package demo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import program.Emp;

public class sortedEmp {

public static void main(String[] args)
{
		// TODO Auto-generated method stub
Set<Emp>e=new TreeSet<>();
e.add(new Emp(101,"UUU",1000));
e.add(new Emp(109,"RRR",3000));
e.add(new Emp(103,"HHH",5000));
e.add(new Emp(199,"QQQ",10000));
e.add(new Emp(111,"KKK",2000));
e.add(new Emp(121,"lll",90000));
	for(Emp E1:e)
	{
		System.out.println(E1);
	}

	System.out.println("Using Iterartor");
	Iterator<Emp>it=e.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
}
}

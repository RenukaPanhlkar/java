package demo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import program.Emp;
import program.Empcomparator;

public class sortedEmpcompartor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Empcomparator>emp=new TreeSet<>(new Comparator<Empcomparator>() {

		
			
			@Override
			public int compare(Empcomparator o1, Empcomparator o2) {
				// TODO Auto-generated method stub
				int diff= o1.getSal()-o2.getSal();
				if(diff==0)
				{
					diff=o1.getName().compareTo(o2.getName());
					if(diff==0)
					{
						diff=o1.getId()-o2.getId();
					}
				}
				return diff;
			}
		});
		emp.add(new Empcomparator(101,"UUU",1000));
		emp.add(new Empcomparator(109,"RRR",3000));
		emp.add(new Empcomparator(103,"HHH",5000));
		emp.add(new Empcomparator(199,"QQQ",10000));
		emp.add(new Empcomparator(111,"KKK",2000));
		emp.add(new Empcomparator(121,"lll",90000));
		emp.add(new Empcomparator(189,"PPP",90000));
			
		
		for(Empcomparator E1:emp)
			{
				System.out.println(E1);
			}

		
		}
	}



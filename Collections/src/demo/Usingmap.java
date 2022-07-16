package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Usingmap {
	public static void main(String[] args) 
	{
		Map<Integer,String> map = new HashMap<>();
		map.put(23,"Database");
		map.put(34,"Linux");
		map.put(12,"os");
		map.put(21,"Ds");
		map.put(56,"C++");
		map.put(23,"C");
		map.put(null,"VB");
		map.put(null,"Java");
		map.put(67,"CO");
		
		//System.out.println(map);
		
		//map.iterator()
		Set<Entry<Integer,String>> set = map.entrySet();
		Iterator<Entry<Integer,String>> it = set.iterator();
		while(it.hasNext())
		{
			Entry<Integer,String> entry = it.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		System.out.println("*******Using for loop****************");
		for(Entry<Integer,String>  entry : set)
		{
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		System.out.println("To get record at a key");
		System.out.println(map.get(23));
		map.getOrDefault(100, "not present");
		System.out.println("To check a key is present or not:");
		System.out.println(map.containsKey(10));
		
	}


}

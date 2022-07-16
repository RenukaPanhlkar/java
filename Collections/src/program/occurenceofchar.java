package program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class occurenceofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map = new HashMap<>();
		
		String s="coccacola";
		for(int i=0;i<s.length();i++)
		{
			int c=0;
			
		
			
			char	ch=s.charAt(i);
				if(map.containsKey(ch))
					{
					c=map.get(ch);		
					c++;
					map.replace(ch,c);
					}
				else
				{
					map.put(ch,1);
				}
	
		}

		//System.out.println(map);
	Set<Entry<Character,Integer>> set = map.entrySet();
		Iterator<Entry<Character, Integer>> it = set.iterator();
		while(it.hasNext())
		{
			Entry<Character, Integer> entry = it.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(map);
		
		//map.iterator()
		
		
		
		/*System.out.println("***********************");
		for(Entry<Integer,String>  entry : set)
		{
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		System.out.println(map.get(23));
		//map.getOrDefault(100, "not present");
		System.out.println(map.containsKey(10));*/
		
	


	



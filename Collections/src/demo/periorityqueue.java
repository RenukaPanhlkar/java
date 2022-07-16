package demo;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class periorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Renu");
		queue.add("Raj");
		queue.add("Nisha");
		queue.add("Jena");
		queue.add("pratik");
		queue.add("komal");
		queue.add("shubhm");
		queue.add("kitu");
		queue.add("pitu");
		
		System.out.println("****Display****");
		
		Iterator<String> i = queue.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println("**************");
		System.out.println("Removed with priority order	");	
		while(!queue.isEmpty())
		{
			System.out.println(queue.size()+": "+queue.poll());
		}

	}

}

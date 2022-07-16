package linkedlist.string1;

public class Node 
{
	String data;
	Node next;
	public Node()
	{
		data="P";
		next=null;
	}
	public Node(String data)
	{
		this.data=data;
		next=null;
	}
	public String toString()
	{
		return " "+data;
	}	

}

package linkedlist.string1;
import java.util.*;
public class LinkedListString 
{
	Node head;
	Node move,newnode;
	public LinkedListString() 
	{
		head=null;
	}
	public void createLinkedList(int terms)
	{
		
		
		for(int i=1;i<=terms;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your string = ");
			String data=sc.next();
			newnode=new Node(data);
			if(head==null)
				head=newnode;
			else
			{
				move=head;
				while(move.next!=null)
					{
						move=move.next;
					}
				move.next=newnode;
			}
			data+=1;
		}
	}
	public void addBeg(String s) 
	{
		Node newnode=new Node(s);
		newnode.next=head;
		head=newnode;
	}
	public void addEnd(String s) 
	{
		Node newnode= new Node(s);
		Node move=head;
		while(move.next!=null)
		{
			move=move.next;
		}
		move.next=newnode;
	}
	public void deleteBeg()
	{
		Node del=head;
		head=head.next;
		del=null;
	}
	public void deleteEnd()
	{
		Node del,move;
		move=head;
		while(move.next.next!=null)
		{
			move=move.next;
		}
		del=move.next;
		move.next=null;
		del=null;
	}
	public void display()
	{
		Node move=head;
		while(move.next!=null)
		{
			System.out.println(move);
			move=move.next;
		}
		if(move.next==null)
			System.out.println(move);
	}

}

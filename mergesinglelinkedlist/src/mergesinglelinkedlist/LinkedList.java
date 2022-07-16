package mergesinglelinkedlist;
import java.util.Scanner;

public class LinkedList {

	private Node head;
	public LinkedList(int terms)
	{
		System.out.println("Enter data to be added : ");
		head=null;
		Scanner sc = new Scanner(System.in);
		Node newnode,move;
		int data;
		for(int i=1;i<=terms;i++)
		{
			data=sc.nextInt();
			newnode=new Node(data);
			if(head==null)
			head=newnode;
			else
			{
				move=head;
				while(move.getNext()!=null)
				{
					move=move.getNext();
				}
				move.setNext(newnode);
			}
		}
	}
	public void createLinkedList(int terms)
	{
		System.out.println("Enter data to be added : ");
		Scanner sc = new Scanner(System.in);
		Node newnode,move;
		int data;
		for(int i=1;i<=terms;i++)
		{
			data=sc.nextInt();
			newnode=new Node(data);
			if(head==null)
			head=newnode;
			else
			{
				move=head;
				while(move.getNext()!=null)
				{
					move=move.getNext();
				}
				move.setNext(newnode);
			}
		}
	}
	public Node getHead()
	{
		return head;
	}
	public void add(Node l)
	{
		Node move;
		move=head;
		while(move.getNext()!=null)
			move=move.getNext();
		move.setNext(l);
		
	}
	public void display()
	{
		System.out.println("\n-----------");
		Node move=head;
		while(move.getNext()!=null)
		{
			System.out.print("  "+move);
			move=move.getNext();
		}
		if(move.getNext()==null)
			System.out.print(" "+move);
		System.out.println("\n-----------");

}
}
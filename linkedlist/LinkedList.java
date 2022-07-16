package linkedlist.int1;

public class LinkedList 
{
	Node head;
	public LinkedList() 
	{
		head=null;
	}
	public void createLinkedList(int terms)
	{
		int data=1;
		Node move,newnode;
		for(int i=1;i<=terms;i++)
		{
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

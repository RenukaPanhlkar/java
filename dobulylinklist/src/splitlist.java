import java.util.Scanner;

public class splitlist {
	private Node head;
	public splitlist()
	{
		//head=null;
		
	}
	public splitlist(int terms)
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
	
	
	//public void split(Node l,Node )
	{
		Node move;
	move=head;
	while(move!=null)
	{
		if(move.getData()%2==0)
		{
//			Node
		}
	}
		
	}
	public void split()
	
	{
		Node move;
		move=head;
		boolean flag=false;
		while(move.getNext()!=null)
		{
			move=move.getNext();
			if(move.getData()%2==0)
			{
	//insert(move.getData())//	boolean flag=true;
		//		return move ;
			}
			
		
		}
		//return move;
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

import java.util.Scanner;

public class linkedlist {
	Node head;
	public linkedlist(){
		head=null;
	}
	public Node getHead()
	{
		return head;
	}
	public int countNodes()
	{
		Node move=head;
		int cnt=0;
		if(head==null)
		{
			return -1;
		}
		else
		{
			//for(cnt=0,move=head;move.getNext()!=head;move=move.getNext(),cnt++)
		  cnt=0;
		  move=head;
		  while(move.getNext()!=head)
		  {
			cnt++;
			move=move.getNext();
		  }
		}
		return cnt+1;
		
	}
	public void insert(int data,int pos)
	{
		int cnt=countNodes();
		Node newnode=new Node(data);
		
		if(pos==1)
		{
			if(head==null)
			{
				head=new Node(data);
				head.setNext(head);
			}
			else
			{
				Node move=head;
				
				while(move.getNext()!=head)
					move=move.getNext();
				move.setNext(newnode);
				newnode.setNext(head);
				head=newnode;
			}
			return;
		}
		if(pos>cnt+1)
		{
			System.out.println(" Not Possible ");
			return;
		}
		
		Node move=head;
		for(int i=1;i<pos-1;i++)
			move=move.getNext();
		newnode.setNext(move.getNext());
		move.setNext(newnode);
		
	}

	public void display()
	{
		Node move=head;
		if(move==null)
			{System.out.println("List is empty");
			return;
			}
		System.out.println("\n--------------- \n");
		while(move.getNext()!=head)
		{
			System.out.print(" "+move);
			move=move.getNext();
		}
		if(move.getNext()==head)
			System.out.print(" "+move);
		
		System.out.println("\n--------------- \n");
		
	}
	public void modify(int data,int newnodata)
	{
		Node move=head;
		boolean found=false;
		while(move.getNext()!=head)
		{
			if(move.getData()==data)
			{
				found=true;
				move.setData(newnodata);
				break;
			}
			move=move.getNext();
				
		}
		if(move.getNext()==head)
		{
			if(move.getData()==data)
			{
			found=true;
			move.setData(newnodata);
			}
		}
			
		if(found==false)
			System.out.println(" Record Not Found ");
	}

	public void createLinkedlist(int terms)
	{
		int data;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=terms;i++)
		{
			System.out.println("Enter data to insert");
			data=sc.nextInt();
			Node newnode=new Node(data);
			if(head==null)
			{
				head=newnode;
				newnode.setNext(head);
				
			}
			else
			{
				Node move=head;
				for(move=head;move.getNext()!=head;move=move.next);
				
				move.setNext(newnode);
				newnode.setNext(head);
				//head=newnode;
				
			}
		}
	}
public void delete(int pos)
{
		Node  move, del;
	int cnt=countNodes();
	
	if(pos==1)
	{
		if(head==null)
	{
			System.out.println("List is empty");
			return;

		}
		if(head.getNext()==head)
		{
			head=null;
			return;
		}
		move=head;
		del=head;
	//head=head.getNext();
		while(move.getNext()!=head)
		{move=move.getNext();}
		head=head.getNext();
		move.next=head;
			del=null;
	
		return;
	}

	if(pos>cnt+1)
	{
		System.out.println("The operation is invalid");
		return;
	}
	
	
    move=head;
	for(int i=1;i<(pos-1);i++)
	{
		
		move=move.getNext();
	}
	//del=move;
	del=move.getNext();
	move.setNext(del.next);
	del=null;
	return;
	
	}
	
	
}
	


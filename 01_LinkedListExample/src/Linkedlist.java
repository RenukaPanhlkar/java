import java.util.Scanner;

public class Linkedlist {
	 private Node head;
	public Linkedlist() 
	{
		head=null;
	}
	public void createLinkedList(int term)
	{
		int d;
		Node move;
		Node newnode;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=term;i++)
		{
			System.out.println("Enter the  Linked list data");
			d=sc.nextInt();
			
			  newnode =new Node(d);
			if(head==null)
				head=newnode;
			else
			{
				//booknode move;
				for(move=head;move.getNext()!=null;move=move.getNext());
				move.setNext(newnode);
			}
			}
			//data+=1;
		}
	public void insert(int data,int pos)
	{
		Node newnode=new Node(data);
		Node move;
		int cnt=countnode();
		if(pos==1)
		{
			if(head==null)
			{
				head=newnode;
			}
			else
			{
				newnode.setNext(head);
			head=newnode;
			}
			return;
		}
			/*if(pos==cnt+1)
			{ 
			for(move=head;move.getNext()!=null;move=move.getNext())
				{move.setNext(newnode);}
			return;
			}*/
			if(pos>cnt+1)
			{
				System.out.println("Not Possible");
				return;			
			}
		int i	;
		move=head;
		for(i=1;i<pos-1;i++)
		{
	
			move=move.getNext();
			}
		newnode.next=move.next;
		move.setNext(newnode);
			
	}
	public int countnode()
	{
		int cnt=0;
		Node move=head;
		if(head==null)
			return -1;
		else
			move=head;
		while(move!=null)
		{
			cnt++;
			move=move.getNext();
		}
	
	return cnt;
	
		}
	
	
	public void display()
	{
		Node move=head;
		
		
		if(head==null)
			{System.out.println("List empty");
		return;
			}
		System.out.println("***************************");
		for(move=head;move!=null;move=move.getNext())
			System.out.println(move);
		System.out.println("****************************");
	}
	
	
	public void modify(int data,int newdata)
	{
		Node move;
	boolean found=false;
	
		for(move=head;move!=null;move=move.getNext())
		{
			if(move.getData()==data)
			{ 
				found =true;
			move.setData(newdata);
			break;
			}
		}
		if(found==false)
			System.out.println("Data not found");
	}

	public void delete(int pos)
	{ 
		Node  move, del;
	int cnt=countnode();
	
	if(pos==1)
	{
		if(head==null)
	{
			System.out.println("List is empty");
 return;

		}
		else
		{
			del=head;
		head=head.getNext();
		del=null;
	}
		return;
	}
	if(pos>cnt+1)
	{
		System.out.println("The operation is invalid");
		return;
	}
	/*if(pos==cnt+1)
	{
		move=head;
		while(move.getNext().getNext()!=null)
		{
			move=move.getNext();
		}
		del=move.getNext();
		del=null;
return;
	}*/
	
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
	


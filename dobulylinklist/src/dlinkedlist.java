import java.util.Scanner;
public class dlinkedlist {
Node head;

public dlinkedlist() {
	
	head = null;
}
public void display()
{
	if(head==null)
	{
		System.out.println("Linked list is empty");
		return;
	}
	for(Node move=head;move!=null;move=move.getNext())
	{
	System.out.println(move);
	}
}

public void createLinkedlist(int terms)
{
	int data;
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=terms;i++)
	{
		System.out.println("Enter data to insert");
		data=sc.nextInt();
		if(head==null)
		{
			head=new Node(data);
			
		}
		else
		{
			Node move=head;
			Node newnode=new Node(data);
			while(move.getNext()!=null)
				move=move.getNext();
			newnode.setPrev(move);
			move.setNext(newnode);
		}
	}
}
public void insert(int data,int pos)
{
	Node newnode=new Node(data);
	int cnt=countnode();
	System.out.println("node="+cnt);
	
	if(pos==1)
	{
		System.out.println("hi");
		if(head==null)
		{
			head=newnode;
			//return;
		}
		else
		{
		//Node newnode =new Node(data);
		newnode.setNext(head);
		head.setPrev(newnode);
		head=newnode;
		}
		return;
		}
	if(pos>cnt+1)
	{
		System.out.println("Not Possible");
		return;			
	}
	
	
		Node move=head;
		//Node newnode =new Node(data);
		for( int i=1;i<pos-1;i++)
		{
			move=move.getNext();
		}
			newnode.setNext(move.getNext());
			if(move.getNext()!=null)
			{
				move.getNext().setPrev(newnode);
			}
	
move.setNext(newnode);
newnode.setPrev(move);
		}
public void add(int data,int afterdata)
{
	Node newnode=new Node(data);
	System.out.println("hi");
	Node move;
	move=head;
	if(head==null)
	{
		System.out.println("List empty");
		return;
	}
	boolean found=false;
	for(move=head;move!=null;move=move.getNext())
	{
	if(move.getData()==afterdata)
	{
		//move=move.getNext();
	found=true;
	newnode.setNext(move.getNext());
	move.setNext(newnode);
	break;
	}
	//return;
	}
	if(found==false)
	{
		System.out.println("No such record ");
		return;
	}
		
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
public void modify(int data,int newdata)
{
	Node move;
boolean found=false;

	for(move=head;move!=null;move=move.getNext())
	{
		if(move.getData()==data)
		{ found =true;
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
head.setPrev(null);;
	del=null;
}
	return;
}
if(pos>cnt+1)
{
	System.out.println("The operation is invalid");
	return;
}
if(pos==cnt)
{
	move=head;
	while(move.getNext().getNext()!=null)
	{
		move=move.getNext();
	}
	del=move.getNext();
	move.setNext(del.getNext());
	del=null;
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
del.getNext().setPrev(move);
del=null;
return;
}

}





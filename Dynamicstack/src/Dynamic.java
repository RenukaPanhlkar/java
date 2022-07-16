
public class Dynamic {
Node top;
public boolean isEmpty()
{
	if(top==null)
	
		return true;
		else
			
			return false;
	}

public void push(int data)
{
	
	
		Node newnode=new Node(data);
	if(top==null)
		top=newnode;
	else
	{
		newnode.setNext(top);
		top=newnode;
		
		
	}
}

public int pop()
{
	int ele=-9999;
	Node del;
	if(!isEmpty())
	{
		del=top;
		top=top.getNext();
		ele=del.getData();
		del=null;
	}
return ele;
}



public void display()
{
//Node head;
Node move=top;
while(move!=null)
{
	System.out.println(move);
	move=move.getNext();
}
}
/*if(head==null)
{
	System.out.println("Stack empty");
	return;
}
System.out.println("Stack elements are :");
for(top=head;top!=null;top=top.getNext())
{
	System.out.println(top);
}*/
}


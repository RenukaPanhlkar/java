
public class Empqueue {
	Node rear,front;
	public Empqueue()
	{
		rear=front=null;
	}
	public boolean isEmpty()
	{
		if(rear==null)
			return true;
		else
			return false;
	}
	public void  enQueue(Emp data)
	{
		Node newnode=new Node(data);
		if(rear==null||front==null)
		{
			front=rear=newnode;
		}
		else
		{
			rear.setNext(newnode);
			rear=newnode;
		}
	}
	public Emp deQueue()
	{
		Emp data=null;
		Node del;
		
		if(!isEmpty())
		{
			del=front;
			
			front=front.getNext();
			data=del.getData();
			del=null;
		}
		return data;
		
		
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println(" Queue Is Empty !!!! ");
			return ;
		}
		else
		{
			Node move=front;
			while(move!=null)
			{
				System.out.print(move);
				move=move.getNext();
			}
			
		}
	}

}

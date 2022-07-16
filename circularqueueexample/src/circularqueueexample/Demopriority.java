package circularqueueexample;

public class Demopriority {
int rear,front,size;
priority1 []arr;
public Demopriority(int size)
{
	this.size=size;
	rear=front=-1;
	arr=new priority1[size];
	
	
}

public boolean isfull()
{
	if(rear==size-1)
		return true;
	else
		return false;
	
}
public boolean isEmpty()
{
	if(front==rear)
		return true;
	else
		return false;
}

public void enqueue(priority1 p)
{
	priority1 temp;
	if(!isfull())
	{
		rear++;
		arr[rear]=p;
		if(rear!=0)
		{
			for(int i=0;i<rear;i++)
			{
				for(int j=0;j<rear-i;j++)
				{
					if(arr[j].getP()>arr[j+1].getP())
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}
	}
	else
		System.out.println("Queue is full");
}

public priority1 dequeue()

{
	priority1 p=null;
	if(!isEmpty())
	{
		p=arr[++front];
		
	}
	return p;
}

public void display()
{
	if(isEmpty()) {
		System.out.println("Queue is empty");
		return;
	}
	
	System.out.println("<-----------");
	for(int i=front+1;i<=rear;i++)
	{
		System.out.println(arr[i]);
		
	}
	System.out.println("<----------");
	System.out.println();
}


}

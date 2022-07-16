package circularqueueexample;

public class mycirq1 {

	private int size;
	private int []arr;
	private int rear,front;
	public mycirq1(int size) {
		super();
		this.size = size;
		arr=new int[size];
		rear=front=-1;
	
	}
	public boolean isEmpty()
	{
		if(front==-1)
			return true;
		else
			return false;
	}
	
	public boolean isfull()
	{
		if(front==0 && rear==size-1)
		
			return true;
		
		if(front==(rear+1)%size)
		
		    	return true;
		   	
		
		else
		
			return false;
			
	}
	
	public void enqueue(int data)
	{
		if(!isfull())
		{
			if(front==-1)
			
				front=0;
			
			rear=(rear+1)%size;
			arr[rear]=data;
			}
		else
		{
			System.out.println("Queue is full");
		}
		}
	
	
	public int dequeue()
	{int data;
		if(isEmpty())
		return -1;
		else
		{
			data=arr[front];
			if(front==rear)
				{front=-1;
			rear=-1;}
			else
				front=(front+1)%size;
		}
		return data;
		}
	
public void display()
{
	int i;
	if(isEmpty())
	{
		System.out.println("queue is empty");
		return;
	}
	
	System.out.println("=======================");
	for(i=front;i!=rear;i=(i+1)%size)
	{
		System.out.println(arr[i]);
	}
	if(i==rear)
		System.out.println(arr[rear]);
}

}
	
	
	
	


import java.util.Scanner;

public class Linkedlist {
	 private Node head;
		public Linkedlist() 
		{
			head=null;
		}
		public void createLinkedList(int data)
		{
			//int d;
			Node move;
			Node newnode;
			Scanner sc=new Scanner(System.in);
			
				
				  newnode =new Node(data);
				if(head==null)
					head=newnode;
				else
				{
					
					for(move=head;move.getNext()!=null;move=move.getNext());
					move.setNext(newnode);
				}
				}
				//data+=1;
			
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
}


import java.util.Scanner;

public class Linkedlistbook {
private booknode head,data;
int d;
String name;
public Linkedlistbook()
{
	head=null;
	
}
public void createlinkedlist(int term)
{
	booknode move,newnode;
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=term;i++)
	{
		System.out.println("Enter the  book data");
		d=sc.nextInt();
		System.out.println("Enter the book name");
		name=sc.next();
		newnode =new booknode(d,name);
		if(head==null)
			head=newnode;
		else
		{
			//booknode move;
			for(move=head;move.getNext()!=null;move=move.getNext());
			move.setNext(newnode);
		}
		
	}
}
	
	public void display()
	{
		booknode move=head;
System.out.println("--------------------------");
for(move=head;move!=null;move=move.getNext())
System.out.println(move);
System.out.println("\n-------------------------");
	
}
}

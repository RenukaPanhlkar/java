import java.util.Scanner;
public class demolinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Linkedlistbook list1=new Linkedlistbook();
int terms;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of records");
terms=sc.nextInt();
list1.createlinkedlist(terms);
list1.display();

	}

}

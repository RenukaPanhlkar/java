package mergesinglelinkedlist;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 =new LinkedList(3);
		LinkedList list2 =new LinkedList(3);
		list1.display();
		list2.display();
		
		list1.add(list2.getHead()); 
		list1.display();

	}

}

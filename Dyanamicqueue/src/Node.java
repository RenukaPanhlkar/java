
public class Node {
	Emp data;
	Node next;


	public Node(Emp data) {
		super();
		this.data = data;
		this.next = null;
	}
	public Emp getData() {
		return data;
	}
	public void setData(Emp data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return " " + data ;
	}

}

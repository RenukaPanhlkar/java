
public class booknode {
private int data;
private String name;
private  booknode next;

public booknode getNext() {
	return next;
}
public void setNext(booknode next) {
	this.next = next;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public booknode(int data,String name) {
	super();
	this.data = data;
	this.name=name;
	this.next=null;
}
@Override
public String toString() {
	return "booknode [data=" + data + " name"+ name +"]";
}

}


public class Book {
private  int bid;
private String bookname;
private double price;
public Book(int bid, String bookname, double price) {
	super();
	this.bid = bid;
	this.bookname = bookname;
	this.price = price;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book  Details are: \n"+ "[bid=" + bid + ", bookname=" + bookname + ", price=" + price + "]";
}



}

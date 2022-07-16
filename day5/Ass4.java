class Book
{
private float price;
static int bid=0;
private int bookid;
public Book()
{
bid++;
bookid=bid;
price=120.0f;
}
public Book(float p)
{
bid++;
bookid=bid;
price=p;
}
public void showinfo()
{

System.out.println("________________________________");
System.out.println("The Book info ->   Bookid=" +bookid   +" "+"Book Price"   +price);

System.out.println("_________________________________");
}
}
public class Ass4
{
public static void main(String []s)
{
Book b1=new Book();
b1.showinfo();
Book b2=new Book(150.0f);
b2.showinfo();
Book b3=new Book();
b3.showinfo();
}
}

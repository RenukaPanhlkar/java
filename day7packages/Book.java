package book;
public class Book
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


  System.out.println("__________________________________________________");
  System.out.println("Bookid=" +bookid   +" "+"Book Price"   +price);

System.out.println("___________________________________________________");
}
}


package app2;
import book.Book;
public class BookDemo
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
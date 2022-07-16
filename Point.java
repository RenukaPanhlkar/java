class Point
{
private  int x,y;
public Point()
{
x=y=10;
}
public Point(int a,int b)
{
x=a;
y=b;
}
public void showpoint()
{
System.out.println("The coordinates are" +"["+x+","+y +"]");
}
}
public class PointDemo
{
public static void main(String []s)
{
Point p1=new Point();
p1.showpoint();
Point p2=new Point(100,200);
p2.showpoint();
}
}

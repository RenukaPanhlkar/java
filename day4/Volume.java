class Box
{
private int length,breadth,height;
public Box()
{
length=10;
breadth=20;
height=20;
}
public Box(int l,int b,int h)
{
length=l;
breadth=b;
height=h;
}
void showvol()
{
System.out.println("The area of box:" +(length*breadth*height));
}
}
public class Volume
{
public static void main(String []s)
{
Box b1=new Box();
b1.showvol();
Box b2=new Box(1,2,3);
b2.showvol();
}
}
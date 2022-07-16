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
public class Ass6
{
public static void main(String []s)
{
Box []b=new Box[3];
b[0]=new Box(32,10,20);
b[1]=new Box(1,2,3);
b[2]=new Box(3,4,5);
for (int i=0;i<3;i++)
{
b[i].showvol();
}
}
}
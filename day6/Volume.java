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
System.out.println( +(length*breadth*height));
}
}
public class Volume
{
public static void main(String []s)
{
Box []b1=new Box[3];
b1[0]=new Box(1,2,3);
b1[1]=new Box(2,5,9);
b1[2]=new Box(4,5,6);

for(int i=0;i<3;i++)
{
System.out.println("The volume of Box " +i +"  ");
b1[i].showvol();

}
//Box b2=new Box(1,2,3);
//b2.showvol();
}
}
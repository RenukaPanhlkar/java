class Box
{

private int height;
private int breadth;
private int length;
void setdata(int h,int b,int l)
{
height=h;
breadth=b;
length=l;
}
void calculate()
{
int volume=0;
 volume=length*breadth*height;
System.out.println("The Volume of Box is" +volume);
}

}
public class Vol
{
public static void main(String []s)
{
Box b=new Box();
b.setdata(12,13,14);
b.calculate();
}
}
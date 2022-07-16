class Point
{

private int x;
private int y;

void setdata(int a,int b)
{
x=a;
y=b;
}
void showdata()
{


System.out.println("The coodinates are " +"[" +x +"," +y +"]" );
}

}
public class ass1
{
public static void main(String []s)
{

Point p=new Point();
p.setdata(10,20);
p.showdata();
}
}
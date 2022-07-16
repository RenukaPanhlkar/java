class Add
{

private int x;
private int y;

void setdata(int a,int b)
{
x=a;
y=b;
}
void sum()
{
int s;
s=x+y;
System.out.println("the sum is=" +s);
}
void diff()
{
int d;
d=x-y;
System.out.println("the difference is=" +d);
}
void mul()
{
int m;
m=x*y;
System.out.println("the multiplication is=" +m);
}
void div()
{
int d;
d=x/y;
System.out.println("the division is=" +d);
}

}
public class ass2
{
public static void main(String []s)
{

Add p=new Add();
p.setdata(100,20);
p.sum();
p.diff();
p.mul();
p.div();
}
}
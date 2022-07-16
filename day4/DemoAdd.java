class Add()
{
private int a,b,c;

public  Add(int x,int y)
{
a=x;
b=y;
}
public Add(int p,int q,int r)
{
a=p;
b=q;
c=r;
}
public void show()
{
int res;
res=a+b;
System.out.println("The addition of two no is" +res);
}
public void show1()
{
int res;
res=a+b+c;
System.out.println("The addition of two no is" +res);
}
}

public class DemoAdd
{
public static void main(String []s)
{
d1 Add=new Add(10,20);
d2 Add=new Add(10,20,30);
//System.out.println("The addition of two no is" +(a+b));
//System.out.println("The addition of theree no is" +(a+b+c));
d1.show();
d2.show1();
}
}
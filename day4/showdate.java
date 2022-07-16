class Date
{
private  int dd,mm,yy;
public Date()
{
dd=mm=1;
yy=2022;
}
public Date(int d,int m,int y)
{
dd=d;
mm=m;
dd=d;
}

public void showdate()
{
System.out.println("Date" +dd+"/"+mm+"/"+yy);
}
public void showdate(char ch)
{
System.out.println("Date" +dd+ch+mm+ch+yy);
}
}
public class DemoDate
{
public static void main(String []s)
{
Date x=new Date();
x.showdate();
Date y=new Date(11,2,2020);
y.showdate('-');
}
}

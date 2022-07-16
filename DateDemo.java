class Date
{
int dd,mm,yy;
void setdate(int d,int m,int y)
{
dd=d;
mm=m;
yy=y;
}
void showdata()
{
System.out.println("Date is:" +dd+"/"+mm+"/"+yy);
}
}
public class DateDemo
{
public static void main(String []s)
{
 Date d1=new Date();
d1.setdate(11,2,2022);
d1.showdata();
}
}
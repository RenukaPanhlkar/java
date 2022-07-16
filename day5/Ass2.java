class Date
{
private  int dd,mm,yy;
static int count;
public Date()
{count++;
dd=mm=1;
yy=2020;
}
public Date(int d,int m,int y)
{count++;
dd=d;
mm=m;
yy=y;
}
void showdate()
{
System.out.println("==============================");
System.out.println("The date is" +dd+"/"+mm+"/"+yy);
System.out.println("==============================");
}
//public int getcount()
//{return count;
//}

}

public class Ass2
{
public static void main(String []s)
{
Date d1=new Date();
Date d2=new Date(12,3,2034);
Date d3=new Date(13,2,2012);
d1.showdate();
d2.showdate();
d3.showdate();
System.out.println("The no of objects created are:" +Date.count);
}
}

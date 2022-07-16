 package office.utility;
 public class Newdate
{
private int dd,mm,yy;
public Newdate()
{
dd=mm=yy=0;
}
public Newdate(int dd,int mm,int yy)
{
this.dd=dd;
this.mm=mm;
this.yy=yy;
}
public void showDate()
{
System.out.println(+dd+"/"+mm +"/"+yy);
}
}

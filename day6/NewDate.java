package office.utility;
public class NewDate
{
private int dd,mm,yy;
public Date()
{
dd=mm=yy=0;
}
public Date(int dd,int mm,int yy)
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

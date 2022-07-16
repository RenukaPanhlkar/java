import java.util.*;
class Line1
{
private int n;
private start []a;
private end []b;
public Line1()
{
this.n=0;
this.a=new start[n];
this.b=new end[n];
}
 public Line1(int n)
 {
 this.n=n;
 this.a=new start[n];
 this.b=new end[n];
 }
 public void makeline()
 {
 int x,y,p,q;
 Scanner sc=new Scanner(System.in);
 for(int i=0;i<n;i++)
 {
 System.out.print("\n\n----Enter start point coodinates---");
 System.out.print("\n\tX=");
 x=sc.nextInt();
 System.out.print("\n\tY=");
 y=sc.nextInt();
 System.out.print("\n\n----Enter End point coodinates---");
 System.out.print("\n\tX=");
 p=sc.nextInt();
 System.out.print("\n\tY=");
 q=sc.nextInt();
 start s1=new start(x,y);
 a[i]=s1;
 end e1=new end(p,q);
 b[i]=e1;
 }
 }
 public void showline()
 {
 for(int i=0;i<n;i++)
 {
 System.out.println("\n__________________________");
 System.out.println("Co-ordinates of line"+(i+1)"\n");
 a[i].showstart();
 b[i].showend();
 System.out.println("____________________________\n");
 }
 }
 }
 
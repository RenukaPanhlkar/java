class Complex
{
private  int real,imag;
public Complex()
{
real=imag=4;
}
public Complex(int r,int i)
{
real=r;
imag=i;
}
void showdata()
{
System.out.println("The complex number is :" +(real+"+"+"i"+imag));
}
}
public class DemoComplex
{
public static void main(String []s)
{
Complex c1=new Complex();
c1.showdata();
Complex c2=new Complex(10,2);
c2.showdata();
}
}
class Math
{

public void add(int x,int y)
{

System.out.println("The addition of two nos"+(x+y));

}
public void add(int x,int y,int z)
{

System.out.println("The addition of three nos"+(x+y+z));
}
public void add(float p,float q)
{

System.out.println("The addition of two  float nos"+(p+q));
}
}
public class Addition
{
public static void main(String []s)
{
Math m1=new Math();
//Math m2=new Math(1,2,3);
//Math m3=new Math(10.2f,11.0f);
m1.add(10,20);
m1.add(20,30,40);
m1.add(3.29f,4.56f);
}
}


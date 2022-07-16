 class ass1
{
public static void main(String []args)
{
int no=10;
int i,temp=1;
for(i=2;i<no;i++)
{
if(no%i==0)
{
temp=0;
break;
}
}
if(temp==1)
{
System.out.println("The number" + no + "is prime no");
}
else
{

System.out.println("The number" + no + "is  not a prime no");

}
}}
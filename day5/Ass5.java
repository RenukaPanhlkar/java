//import java.util.*;
class Sort
 {
 
  public static int largest(int[] array)
  {    
 
    int max = array[0];

        for (int i = 1; i < array.length; i++) {
      if (max < array[i])
        max = array[i];
    }

    return max;
  }
  
  public void print(int [] array)
  {
  for(int i=0;i<array.length;i++)
  {
  System.out.println(+array[i]);
  }
  }
  
  public static int smallest(int[] array)
  {    
 
    int min = array[0];

        for (int i = 1; i < array.length; i++) {
      if (min > array[i])
        min= array[i];
    }

    return min;
  }
  
  public void print1(int [] array)
  {
  for(int i=0;i<array.length;i++)
  {
  System.out.println(+array[i]);
  }
  }
  
  public void average(int [] array)
  {
	  int sum=0;
	  float avg=0;
  for(int i=0;i<array.length;i++)
  {
	  sum=sum+array[i];

  
  }
  avg=sum/array.length;
  System.out.println("The Average  is " +avg);
  }
  }
  

 public class Ass5
{
public static void main(String []arg)
{
	int no;
//Scanner sc=new Scanner(System.in);
int []arr=new int[4];


arr[0]=65;
arr[1]=78;
arr[2]=90;
arr[3]=12;
Sort s=new Sort();
System.out.println("The array is ");
s.print1(arr);
int max=Sort.largest(arr);
System.out.println("The largest element is:" +max );
int min=Sort.smallest(arr);
System.out.println("The Smallest element is:" +min );
s.average(arr);
}
}


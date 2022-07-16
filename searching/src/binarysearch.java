import java.util.*;
public class binarysearch {
	String s;
	String str[];
	

			
	public static void accept(String str[])
	{
		Scanner sc=new Scanner(System.in );
	
	
		System.out.println("Enter Strings ");
	
	for(int i=0;i<str.length;i++)
	{
		str[i]=sc.next();
	}
}
	public static void display(String[] arr)
	{
		System.out.println(" \n-------------- Array Is ----------\n");
		for(int i=0;i<arr.length;i++)
			System.out.print("   "+arr[i]);
		System.out.println(" \n-----------------------------------\n");
	}
	public static int BinarySearchArray(String a[],String key)  //O(log n)
	{
		int cnt=0;
		
		int lower,upper,mid;
		lower=0;
		upper=a.length-1;
		while(lower<=upper)
		{
			cnt++;
			mid=(lower+upper)/2;
			if(key.compareTo(a[mid])==0)
			{ System.out.println("Iteration =" +cnt);
		return mid;
			}
			if((key.compareTo(a[mid]))>0)
				lower=mid+1;
			else
				upper=mid-1;
			//System.out.println("Interations : "+cnt);
		}
		
		return -1;
	
	}
	
public static void main(String[] args) {
	String []arr=new String [8];
	accept(arr);
	display(arr);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string to Serach ");
	String ele=sc.next();
	
	int pos=BinarySearchArray(arr, ele);
	if(pos==-1)
		System.out.println("String Is Not Available ");
	else
		System.out.println(" Available At "+pos+" Index");
	
	
}

}

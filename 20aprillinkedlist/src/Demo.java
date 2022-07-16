import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
	
	Linkedlist list[]=new Linkedlist[3];

 list[0]=new Linkedlist();
 list[1]=new Linkedlist();
 list[2]=new Linkedlist();
	System.out.println("Even no array");
	int count1=0,no1=1,no2=1,count2=0;
	
	while(count1<5)
	{
		if(no1%2==0)
		{
	list[0].createLinkedList(no1);
		count1++;
	}
	no1++;
	}

	list[0].display();
//-----------------------------------------
	System.out.println("Odd nos");
	while(count2<5)
	{	
		if(no2%2!=0)
		{
	list[1].createLinkedList(no2);
		count2++;
	}
	no2++;
	}

	list[1].display();
//--------------------------------------
	System.out.println("Prime nos:");
	int ct=0,n=0,i=1,j=1;  
    while(n<5)  
    {  
        j=1;  
        ct=0;  
        while(j<=i)  
        {  
            if(i%j==0)  
            ct++;  
            j++;   
        }  
        if(ct==2)  
        {  
        	list[2].createLinkedList(i);
         
            n++;  
        }  
        i++;  
}  
    list[2].display();
}}
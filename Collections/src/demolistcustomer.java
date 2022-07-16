import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demolistcustomer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ObjectOutputStream oos=null;

		
		oos=new ObjectOutputStream(new FileOutputStream("D:/testfiles/collection2.txt"));
		
		try
		{
		
			String name,email,contact;
			int id;
			int ch;
			Scanner sc=new Scanner(System.in);
		customer [] c = new customer[2];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<c.length;i++) 
		{
			
			System.out.println("1.For Customer");
			System.out.println("2.For Registered customers");
			System.out.println("enter your choice");
			ch=Integer.parseInt(br.readLine());
		
			switch(ch)
			{
			case 1:
				
				System.out.println("Enter Employee name");
				name=br.readLine();
				System.out.println("Enter Email");
				email=br.readLine();
				System.out.println("Enter contact no");
				contact=br.readLine();
				
				c[i]=new customer(name,email,contact);
				break;
			case 2:
				System.out.println("Enter Employee registraion no");
				id=Integer.parseInt(br.readLine());
				System.out.println("Enter Employee name");
				name=br.readLine();
				System.out.println("Enter Email");
				email=br.readLine();
				System.out.println("Enter contact no");
				contact=br.readLine();
				
				c[i]=new regcust(name,email,contact,id);
				break;
				
			}
				
			
		}br.close();
			for(customer e : c)
			{
				oos.writeObject(e);
			}
			
				
			System.out.println("Customer data saved");
			oos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
			
		ObjectInputStream ois = null;
		
		ois = new ObjectInputStream(new FileInputStream("D:/testfiles/collection2.txt"));
	
		List<customer>c1=new ArrayList<customer>();
		
		List<regcust>rc=new ArrayList<regcust>();
		
		
	while(true)
	{
		try 
		{
	Object obj=ois.readObject();
			
	
		
		if(obj instanceof customer)
		{
			c1.add((customer)obj);
		}
	
		 if (obj instanceof regcust)
		{
			rc.add((regcust)obj);
		}
		 }
			
		catch(Exception e)
		{
			break;
		}
	
	
System.out.println("***************Cutomer data***********");

	for(customer e:c1)
	{	System.out.println(e);
	ois.close();
	}
	System.out.println("***************Register Cutomer data***********");

	for(regcust e:rc)
	{	System.out.println(e);
ois.close();
}
	
	
	}
			
	}
}
	
	
	



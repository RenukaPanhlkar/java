import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class DemoIO {
	public static void main(String[] args) throws  IOException 
	{
		ObjectOutputStream oos=null;
		
	
	oos=new ObjectOutputStream(new FileOutputStream("D:/testfiles/mydata1.txt"));
	
	try
	{
		String name;
	int eid,dd,mm,yy,months;
	int sal;
	Emp [] emparr = new Emp[3];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<emparr.length;i++)
		{
			System.out.println("Enter Employee id");
			eid=Integer.parseInt(br.readLine());
			System.out.println("Enter Employee name");
			name=br.readLine();
			System.out.println("Enter Salary");
			sal=Integer.parseInt(br.readLine());
			
			emparr[i]=new Emp(eid,name,sal);
			
		}
			
		
		for(Emp e : emparr)
		{
			oos.writeObject(e);
		}
		System.out.println("Objects saved");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try {
			oos.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	

}


}

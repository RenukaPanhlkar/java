import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Democustomer {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos=null;
		
		
		oos=new ObjectOutputStream(new FileOutputStream("D:/testfiles/collection1.txt"));
		
		try
		{
			String name,email,contact;
			int id;
		
		customer [] c = new customer[1];

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for(int i=0;i<c.length;i++)
			{
				System.out.println("Enter Employee registraion no");
				id=Integer.parseInt(br.readLine());
				System.out.println("Enter Employee name");
				name=br.readLine();
				System.out.println("Enter Email");
				email=br.readLine();
				System.out.println("Enter contact no");
				contact=br.readLine();
				
				c[i]=new regcust(name,email,contact,id);
				
			}
				
			
			for(customer e : c)
			{
				oos.writeObject(e);
			}
			System.out.println("Objects saved");
			oos.close();
		
		ObjectInputStream ois = null;
		
			ois = new ObjectInputStream(new FileInputStream("D:/testfiles/collection1.txt"));
		
			for(int i=0;i<c.length;i++)
			{
				c[i] = (customer)ois.readObject();
				System.out.println(c[i]);
			}
			ois.close();
			}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}	
		
		

	}
	



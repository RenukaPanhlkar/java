import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
		import java.util.Scanner;
public class Ass5 {	

			public static void main(String[] args) throws IOException 
				{
				
				Scanner sc=new Scanner(System.in);
				String sname,dname;
				System.out.println( "enter source file");
				sname=sc.next();
				System.out.println( "enter destination file");
				dname=sc.next();

					
			 FileInputStream fin=new FileInputStream(sname);
			 FileOutputStream oin=new FileOutputStream(dname);
			int length,n;
			try
			{
				while((n=fin.read())!=-1)
					{
					oin.write(n);}
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				//if(fin!=null)
				
					fin.close();
				
				//if(oin!=null)
				
					oin.close();
				
				
			}
			
			
			System.out.println("File copied suessfully");
				
}}
			
			
				
			
			
			
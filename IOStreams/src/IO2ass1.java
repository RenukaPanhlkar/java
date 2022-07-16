import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
	import java.util.Scanner;
public class IO2ass1 {
	
		public static void main(String args[]) throws IOException
		{
			
			Scanner sc=new Scanner(System.in);
			String sname;
			System.out.println( "enter source file");
			sname=sc.next();
				try
				{
				int i;
				File f=new File(sname);
				System.out.println(f.isDirectory());
				if(f.isDirectory())
				{
					System.out.println("hi");
					f.listFiles();
				}
				else if(f.isFile())
					{
					if(f.length()>5)
					{
						BufferedReader br=new BufferedReader(new FileReader(sname));
			
						while((i=br.read())!=-1)
						{
							System.out.print((char)i);
						}
						br.close();
					}
						else
					{
						FileReader fis=new FileReader(f);
						while((i=fis.read())!=-1)
						{	
							System.out.print((char)i);
				
			}
			fis.close();
		}
	}
				}		
				catch(IOException e)
				{
					e.printStackTrace();
				}
				finally
				{
				}
			}

			
		
}

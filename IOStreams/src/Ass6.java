import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Ass6 {
	public static void main(String args[]) throws IOException
	{
		
		Scanner sc=new Scanner(System.in);
		String sname;
		System.out.println( "enter source file");
		sname=sc.next();
			
			int i;
			
			FileReader fis = null;
			try
			{
				fis = new FileReader(sname);
				String str="";
				int cnt=0;
			
				while( (i = fis.read()) != -1)
					{
					str=str+(char)i;
					if(i=='\n')
					{
						cnt++;
					System.out.print(cnt +":"+str);
					//cnt++;
					str="";
	
			
					}
					}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try {
					
					fis.close();
				} 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		
	
	}



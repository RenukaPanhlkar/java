import java.io.BufferedReader;
import java.io.FileWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.Writer;
	import java.io.FileReader;
public class Ass4 {
	
 

		public static void main(String[] args) throws IOException {
			Writer w = null;
			BufferedReader br = null;
			try
			{
				br = new BufferedReader(new InputStreamReader(System.in));
				w = new FileWriter("D:/testfiles/mydata1.txt"); 
				String str;
				System.out.println("Enter 'quit' to stop");
				while(!(str=br.readLine()).equals("quit"))
				{
					
					w.write(str);
					w.write("\n");
				}
			}
			
				
			finally
			{
				br.close();
			w.close();
			}

			
			int i;
			
			FileReader fis = null;
			try
			{
				fis = new FileReader("D:/testfiles/mydata1.txt");

			
				while( (i = fis.read()) != -1)
					{
					System.out.print((char)i);
				
					
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
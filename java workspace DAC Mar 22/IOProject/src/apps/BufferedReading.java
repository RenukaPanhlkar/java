package apps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReading 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new FileReader("D:/testfiles/buffer.txt"));
		String str;
		int cnt = 1;
		
		while((str = br.readLine()) != null)
		{
			
			System.out.println(cnt+". "+str);
			cnt++;
		}
		/*System.out.println("Line : "+maxline);
		System.out.println("MAx chars : "+max);
		System.out.println("Line no :"+maxlineno);*/
		br.close();
		
	}

}

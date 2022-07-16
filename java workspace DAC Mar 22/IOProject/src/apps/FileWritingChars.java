package apps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;

public class FileWritingChars {

	public static void main(String[] args) {
		Writer w = null;
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			w = new FileWriter("D:/testfiles/mydata1.txt",true); //data should be appended
			String str;
			System.out.println("Enter 'quit' to stop");
			while(!(str=br.readLine()).equals("quit"))
			{
				//w.write(str.toCharArray());
				w.write(str);
				w.write("\n");
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				br.close();
				w.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();;
			}
		}

	}

}

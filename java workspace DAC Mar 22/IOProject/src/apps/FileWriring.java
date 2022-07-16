package apps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileWriring {

	public static void main(String[] args) 
	{
		OutputStream os = null;
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			//os = new FileOutputStream("D:/testfiles/mydata.txt"); //dafault it is false
			os = new FileOutputStream("D:/testfiles/mydata.txt",true); //data should be appended
			String str;
			System.out.println("Enter 'quit' to stop");
			while(!(str=br.readLine()).equals("quit"))
			{
				os.write(str.getBytes());
				os.write("\n".getBytes());
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
				os.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();;
			}
		}
	}

}

package apps;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingChars {

	public static void main(String[] args) {
		FileReader fis = null;
		try
		{
			fis = new FileReader("D:/testfiles/mydata.txt");
			int i;
			/*while( (i = fis.read()) != -1)
				System.out.println((char)i);*/ 
			char [] arr = new char[10];
			while( (i = fis.read(arr)) != -1)
				System.out.println(new String(arr));
			 
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

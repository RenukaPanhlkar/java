package apps;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;

public class FileReading {

	public static void main(String[] args) 
	{
		File f = new File("D:/testfiles/mydata.txt");
		System.out.println("File size : "+f.length());
		System.out.println("File : "+f.isFile());
		System.out.println("Directory : "+f.isDirectory());
		Date d = new Date(f.lastModified());
		System.out.println("Last modified : "+d);
		System.out.println("Readable : "+f.canRead());
		FileInputStream fis = null;
		try
		{
			if(f.exists())
			{
				if(f.isFile() && f.canRead())
				{
					fis = new FileInputStream(f);
					int i;
					/*while( (i = fis.read()) != -1)
						System.out.print((char)i); */
					byte [] arr = new byte[10];
					while( (i = fis.read(arr)) != -1)
						System.out.println(new String(arr));
						
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
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

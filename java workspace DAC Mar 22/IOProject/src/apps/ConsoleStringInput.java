package apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleStringInput {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 'quit' to stop ");
		String str;
		while(!(str = br.readLine()).equals("quit"))
		     System.out.println(str);
		br.close();     
	}

}

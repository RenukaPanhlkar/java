package apps;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriting {
	public static void main(String[] args) throws Exception
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:/testfiles/buffer.txt"));
		bw.write("this is buffer");
		bw.newLine();
		bw.write("created for file IO");
		bw.newLine();
		bw.write("for improving");
		bw.newLine();
		bw.write("performance");
		bw.newLine();
		bw.write("by memory IO");
		
		bw.close();  //auto flush
		//use entire size of buffer   //auto flush
		//bw.flush();     //explicit flush
		
	}

}

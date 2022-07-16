import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class IO2lineno 
{
public static void main(String args[]) throws IOException
{
	Scanner sc=new Scanner(System.in);
	String sname,str;
	System.out.println( "enter source file");
	sname=sc.next();
		String content = "";
		int i,cnt=1,max=0,maxlineno=0;
		String maxline=null;
		BufferedReader br=new BufferedReader(new FileReader(sname));
		
		
		while((str=br.readLine())!=null)
		{
			if(max<str.length())
			{
				max=str.length();
				
				maxline=str;
				maxlineno=cnt;
			}
			cnt++;
		}
		System.out.println(" Max line :" +maxline);
System.out.println("Maximum char: "+max);
System.out.println("Line no:" +maxlineno);
}
	// TODO Auto-generated method stub


				
/*				try
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

		
}*/
}

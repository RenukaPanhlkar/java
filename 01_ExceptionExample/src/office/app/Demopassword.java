package office.app;
import office.model.*;
import java.util.Scanner;
import java.security.InvalidAlgorithmParameterException;
public class Demopassword {
public static void main(String args[])
{
	String username,password;
	Scanner sc=new Scanner(System.in);
	try
	{
		System.out.println("Enetr user name");
		username=sc.next();
		System.out.println("Enter password");
		password=sc.next();
		int len=password.length();
		if(len>12)
			throw  new passwordtoolongexception();
		else if(len<8)
			throw  new passwordtooshort();
		else
			System.out.println("Passsword is perfect");
			
		
	}
	catch(passwordtoolongexception e)
	{System.out.println(e.getMessage());
		
	}
	catch(passwordtooshort e)
	{
		System.out.println(e.getMessage());
	}
}
}

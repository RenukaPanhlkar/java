package office.app;
import office.model.*;
import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;
public class Demousername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String username;
try
{
	System.out.println("Enter user name");
	username=sc.next();
	if(username.equals("abc")==false)
	{
		throw new Invalidusername();
		
	}
	System.out.println("welcome you are valid user");
	
}
	catch(Invalidusername e)
{
		//System.out.println(e);
		System.out.println(e.getMessage());
}
	
	}

}

package office.app;
import office.model.*;
import java.util.Scanner;
public class Democountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username,countryname;
		UserRegistration r1=new UserRegistration();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Username");
username=sc.next();
System.out.println("Enter country name");
countryname=sc.next();
try
{
	r1.registeruser(username,countryname);
}
catch(InvalidCountry e)
{
	System.out.println(e.getmessage());
}



	}

}

package office.model;

public class UserRegistration {
 private String username,countryname;

	 
 
 public void registeruser(String username,String countryname) throws InvalidCountry
 {
	 if(countryname.equals("India")==false)
		 throw new InvalidCountry();
	 else
		 System.out.println("User registration done sucessfully");
 }
 
 }
 


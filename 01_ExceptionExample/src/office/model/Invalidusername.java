package office.model;

public class Invalidusername extends Exception {
private String msg;
public Invalidusername()
{
	msg="Invalid user name";
	}
public String toString()
{
	return "Username is not valid" +   msg;
	
}
public String getMessage()
{
	return msg;
}
}

package office.model;

public class passwordtoolongexception extends Exception {
private String msg;
public passwordtoolongexception()
{
	msg="Password too long";
	
}
public String toString()
{
	return "Check your password again";
	
}
public String getMessage()
{
	return msg;
}

}

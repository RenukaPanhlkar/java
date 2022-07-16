package office.model;

public class InvalidCountry extends Exception{
private String msg;
public InvalidCountry()
{
	msg="user outside india cannot be registered";
}
public String toString()
{
	return "Enter valid country name";
}

public String getmessage()
{
	return msg;
}
}

package office.model;

public class InvalidcolorException extends Exception{
 private String msg; 
	public InvalidcolorException()

	{
		msg="color doesnot match";
	}
	public String toString()
	{
		return msg;
		
	}
	public String getmessage()
	{
		return msg+"\t"+"Enter valid color";
	}
	
}

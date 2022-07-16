package office.model;

public class passwordtooshort extends Exception{

	private String msg;
	public passwordtooshort()
	{
		msg="Password too short";
		
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


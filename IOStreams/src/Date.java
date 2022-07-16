
import java.io.Serializable;
public class Date implements Serializable {

	private int dd;
	private int mm;
	private int yy;
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}

	public String toString() {
		return dd+"/"+mm+"/"+yy;
	}
	
	
}



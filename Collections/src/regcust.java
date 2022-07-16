import java.io.Serializable;

public class regcust extends customer implements Serializable{
private int regno;

public regcust(String name, String email, String contactno,int regno) {
	super(name, email, contactno);
	this.regno=regno;
}

@Override
public String toString() {
	return "[regno=" + regno + ", " + super.toString() ;
}



}

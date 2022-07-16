import java.io.Serializable;

public class customer implements Serializable{
private String name;
private String email;
private String contactno;
public customer(String name, String email, String contactno) {
	super();
	this.name = name;
	this.email = email;
	this.contactno = contactno;
}
@Override
public String toString() {
	return " name=" + name + ", email=" + email + ", contactno=" + contactno + "]";
}
public customer() {
	super();
}


}

package program;

public class Emp  implements Comparable<Emp>{
private int id;
private String name;
private int sal;
public Emp() {
	super();
}
public Emp(int id, String name, int sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
}
@Override
public int compareTo(Emp e) {
	// TODO Auto-generate method stub
	return this.sal-e.sal;
}

}

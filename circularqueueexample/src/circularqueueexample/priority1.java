package circularqueueexample;

public class priority1 {
private String name ;
private int p;
public priority1(String name, int p) {
	super();
	this.name = name;
	this.p = p;
}
public int getP() {
	return p;
}
public void setP(int p) {
	this.p = p;
}
@Override
public String toString() {
	return "priority1 [name=" + name + ", p=" + p + "]";
}

}

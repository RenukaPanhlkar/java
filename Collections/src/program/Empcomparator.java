package program;

public class Empcomparator {
	private int id;
	private String name;
	private int sal;
	public Empcomparator() {
		super();
	}
	public Empcomparator(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Empcomparator [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	
}

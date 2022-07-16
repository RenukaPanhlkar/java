
public class Student {
	
		public int rollno;
		public String name;
		public int marks;
		public Student(int rollno,String name,int marks)
		{
			this.rollno=rollno;
			this.name=name;
			this.marks=marks;
		}
		 public String toString()
		 {
			 return "rollno:"+rollno +"name:"+name+"marks:"+marks;
		 }
		}


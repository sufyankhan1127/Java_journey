package Collections;
import java.util.*;

//custom hashcode and equals method 


public class useofHashandEqu {
	public static void main(String[] args) {
		Set<Student> s=new HashSet<>();
		
//		s.add("arfat");
//		s.add("asim");
//		s.add("asnan");
//		s.add("uzair");
//		s.add("asif");
//		s.add("hanzu");
		
		Student s1=new Student(1,"aqil");
		Student s2=new Student(2,"aqil");
		System.out.println(s1.equals(s2));
		
		s.add(new Student(1,"Anuj"));
		s.add(new Student(2,"Anuj"));
		s.add(new Student(1,"Anuj"));
		s.add(new Student(1,"Anuj"));
		System.out.println(s);
	}

}

class Student{
	int rollno;
	
	String name;

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
	}
	
	
	
	
}

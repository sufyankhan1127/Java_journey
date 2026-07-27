package core;

public class genericclass {
	public static void main(String[] args) {
		Schooldetails<Integer,String,Integer> s1=new Schooldetails<>(1,"Ram and Raj",12000);
		Schooldetails<Integer,Integer,String> s2=new Schooldetails<>(1,1400,"Sunrise");
		Schooldetails<String,String,Integer> s3=new Schooldetails<>("Class 1","Ram and Raj",120);
		
		System.out.println(s1.getId()+s1.getName()+s1.getStudents());
		System.out.println(s2.getId()+s2.getName()+s2.getStudents());
		System.out.println(s3.getId()+s3.getName()+s3.getStudents());
		
	}

}

class Schooldetails<E,V,S>{
	E id;
	V name;
	S students;
	
	
	public Schooldetails(E id, V name, S students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}


	public E getId() {
		return id;
	}

	public V getName() {
		return name;
	}


	public S getStudents() {
		return students;
	}




}
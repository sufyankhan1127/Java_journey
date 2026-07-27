package core;


public class boundedGen {
	public static void main(String[] args) {
		Salary <Integer> s=new Salary<>(12);
		Salary <Float> s1=new Salary<>(12.3F);
		Salary <Integer> s2=new Salary<>(14);
		
		System.out.println(s.getId());
		System.out.println(s1.getId());
		System.out.println(s2.getId());
		
		Salary.value(true);
		
	}

}


class Salary<T extends Number>  {
	
	 static <E extends Boolean> void value(E name) {
		 System.out.println(name);

	}
	 
	 
	T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public Salary(T id) {
		super();
		this.id = id;
	}
	
	
}
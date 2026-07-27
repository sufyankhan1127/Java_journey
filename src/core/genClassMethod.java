package core;


public class genClassMethod {
	public static void main(String[] args) {
		Dog <Integer,String> d1=new Dog<>(1,"Stussy");
		d1.puppy("asnan");
		Dog <Integer,String> d2=new Dog<>(2,"Ferni");
		
		System.out.println(d1.getName()+d1.getId());
		System.out.println(d2.getName()+d2.getId());
		
	}

}


class Dog<E,F>{
	E id;
	F name;
	
	<G> void puppy(G name) {
		System.out.println("Value"+name);	
	}
	public E getId() {
		return id;
	}
	public void setId(E id) {
		this.id = id;
	}
	public F getName() {
		return name;
	}
	public void setName(F name) {
		this.name = name;
	}
	public Dog(E id, F name) {
		this.id = id;
		this.name = name;
	}
	
	
}
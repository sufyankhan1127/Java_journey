package core;

public class genericmethod {
	public static void main(String[] args) {
		printData("hjefvw");
		printData(1234);
		printData(false);
		
		
		genericmethod obj=new genericmethod();
		obj.<String>doubleData("abc");
		obj.doubleData(122);
		
//		Custom c=new Custom();
//		obj.doubleData(c);
		obj.doubleData("skvf ");
	}
	static<E> void printData(E data) {
		System.out.println(data);
		
	}
	
	
	<E> void doubleData(E data) {
		System.out.println(data);
	}

}

//
//class Custom{
//	
//}
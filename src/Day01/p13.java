package Day01;
public class p13 {
	public static void main(String[] args) {
		printAll256();
	}
	
	public static void printAll256() {
		int ar[]=new int[256];
		for(int i=0;i<ar.length;i++) {
			System.out.println((char)(i));
		}
		
	}

}

//custom product sorting



package Collections;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class companyp1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int noOfcustomers=scan.nextInt();
		scan.nextLine();
		String[] ar=new String[noOfcustomers];
		for(int i=0;i<noOfcustomers;i++) {
			ar[i]=scan.nextLine();
		}
		
		
		HashMap<Integer, Customer> map = new HashMap<>();
		for(int i = 0; i < ar.length; i++) {

		    String[] data = ar[i].split(",");

		    int id = Integer.parseInt(data[0]);
		    String name = data[1];
		    int price = Integer.parseInt(data[3]);
		    
		    if(map.containsKey(id)) {
		    	Customer c=map.get(id); //accessing the object created in else block
		    	c.setProdcount(c.getProdcount()+1);
		    	c.setTotal_price(c.getTotal_price()+price);
		    }
		    
		    else {
		    	Customer c=new Customer();
		    	c.setId(id);
		    	c.setName(name);
		    	c.setTotal_price(price);
		    	c.setProdcount(1); 
		    	map.put(id, c);
		    }

		}
		
		for(Map.Entry<Integer,Customer> customer:map.entrySet()) {
			System.out.println(customer.getKey()+","+customer.getValue());
		}
		
		

	}
	public static class Customer{
		int id;
		String name;
		int total_price;
		int prodcount;
		
		public Customer() {
			// TODO Auto-generated constructor stub
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


		public int getTotal_price() {
			return total_price;
		}

		public void setTotal_price(int total_price) {
			this.total_price = total_price;
		}

		public int getProdcount() {
			return prodcount;
		}

		public void setProdcount(int prodcount) {
			this.prodcount = prodcount;
		}

		public Customer(int id, String name, int total_price, int prodcount) {
			super();
			this.id = id;
			this.name = name;

			this.total_price = total_price;
			this.prodcount = prodcount;
		}

		@Override
		public String toString() {
			return "" + name + "," + total_price + "," + prodcount ;
		}
		
		
		
		
	}
}



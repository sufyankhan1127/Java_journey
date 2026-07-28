//customer product sorting
//input:
/*11
101,Alex,Mobile,1000
102,Arbaz,Laptop,20000
104,Bob,TV,5000
103,John,Washing_machine,50000
103,John,Phone,150000
104,Bob,Grinder,25000
102,Arbaz,TV,30000
102,Arbaz,TV,30000
102,Arbaz,TV,30000
105,Javeed,Mobile,500
105,Javeed,Mobile,500
1*/



package Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public class companyp1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] ar=takeinput(scan);
		System.out.println("Enter the operation you want to perform:");
		System.out.println("1.Return the total price and number of products purchased by a customer ");
		System.out.println("2.Sort the customers by their no_of_prod in descending order(if equal higher totalprice purchaser first) ");
		System.out.println("3.Sort the customers by their no_of_prod in Ascending order(if equal lower totalprice purchaser first) ");
		System.out.println("4.Sort the customers based on total_sum in descending order(if equal higher prod purchaser first)");
		System.out.println("5.Sort the customers based on total_sum in ascending order(if equal lower prod purchaser first)");

		int input=scan.nextInt();
		HashMap<Integer,Customer> map=buildCustomerMap(ar);
		if(input==1) {
			for(Map.Entry<Integer, Customer> customer:map.entrySet()) {
				System.out.println(customer.getKey()+","+customer.getValue());
			}
		}
		
		else if(input==2 || input==3 || input==4 || input==5) {
			ArrayList<Customer> list=sorting(map, input);
			for(Customer c : list) {
			    System.out.println(c.getId() + "," + c);
			}
		}
		
		else {
			System.out.println("Enter the valid input");
		}

	}
	
	public static String[] takeinput(Scanner scan){
		System.out.println("Enter the number of customers:");
		int noOfcustomers=scan.nextInt();
		scan.nextLine();
		String[] ar=new String[noOfcustomers];
		for(int i=0;i<noOfcustomers;i++) {
			System.out.println("Enter the customer detail for"+(i+1));
			ar[i]=scan.nextLine();
		}
		return ar;
		
	}

	public static HashMap<Integer,Customer> buildCustomerMap(String [] ar) {
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
		
		
		return map;
	}
	
	
	public static ArrayList<Customer> sorting(HashMap<Integer,Customer> map,int input){
		ArrayList<Customer> list=new ArrayList<>();
		for(Map.Entry<Integer,Customer> customer:map.entrySet()) {
			list.add(customer.getValue());
		}
		
		if(input==2) {
			Collections.sort(list, new Comparator<Customer>() {

				@Override
				public int compare(Customer o1, Customer o2) {
					
					if(o1.getProdcount()==o2.getProdcount()) {
						return Integer.compare(o2.getTotal_price(), o1.getTotal_price() );
					}
					
					return Integer.compare(o2.getProdcount(), o1.getProdcount());
				}

			});
		}
		else if(input==3) {
			Collections.sort(list, new Comparator<Customer>() {

				@Override
				public int compare(Customer o1, Customer o2) {
					if(o1.getProdcount()==o2.getProdcount()) {
						return Integer.compare(o1.getTotal_price(), o2.getTotal_price() );
					}
					
					return Integer.compare(o1.getProdcount(), o2.getProdcount());
				}

			});
		}
		
		
		else if(input==4) {
			Collections.sort(list,new Comparator<Customer>() {
				
				public int compare(Customer o1,Customer o2) {
					if(o1.getTotal_price()==o2.getTotal_price()) {
						return Integer.compare(o2.getProdcount(), o1.getProdcount());
					}
					
					return Integer.compare(o2.getTotal_price(), o1.getTotal_price());
				}
			});
			
		}
		else if(input==5) {
			Collections.sort(list,new Comparator<Customer>() {
				
				public int compare(Customer o1,Customer o2) {
					
					if(o1.getTotal_price()==o2.getTotal_price()) {
						return Integer.compare(o1.getProdcount(), o2.getProdcount());
					}
					return Integer.compare(o1.getTotal_price(), o2.getTotal_price());
				}
			});
			
		}
		return list;
		
		
	}
	
	
	public static class Customer{
		private int id;
		private String name;
		private int total_price;
		private int prodcount;
		
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



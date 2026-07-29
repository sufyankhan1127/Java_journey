/*You are the smartest person in the village: There is kite flying competition organized by a certain person,
 where each kite has id name of person flying kite
 you first have to get all the kites but 
  he/she tells you to first give the data less than a certain number of distance
  and then he will say you to get the third lowest flied kite or second or first
  or third,first,second highest
  
  *
  *input:8
101,Raju,1500
103,ramesh,900
105,Akash,1700
108,Shivani,2100
102,Mansi,1200
110,Raghav,1450
111,Ajit,2200
112,Arshad,1000
  */



package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class companyp4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String [] ar=takeinput(scan);
		HashMap<Integer,Kite> map=displayeligibiles(ar, scan);
		System.out.println("Enter the operation you want to perform");
		System.out.println("0.Display the eligible participants ;>n distance: ");
		System.out.println("3.Display the 3rd longest distant kite:");
		System.out.println("2.Display the 2nd longest distant kite:");
		System.out.println("1.Display the 1st longest distant kite:");
		System.out.println("11.Display the 1st smallest distant kite:");
		System.out.println("22.Display the 2nd smallest distant kite:");
		System.out.println("33.Display the 3rd smallest distant kite:");
		int option=scan.nextInt();
		
		if(option==0) {
			
			for(Map.Entry<Integer, Kite> k:map.entrySet()) {
				System.out.println(k.getKey()+","+k.getValue());
			}
		}
		
		else if( option==1 || option==2 || option==3 || option==11 || option==22 || option==33) {
			Kite k=returnRequired(map, option);
			System.out.println(k);
		}
		
		
	}
	
	public static String[] takeinput(Scanner scan) {
		System.out.println("Enter the number of participants:");
		int n=scan.nextInt();
		scan.nextLine();
		String[] ar=new String[n];
		
		for(int i=0;i<n;i++) {
			ar[i]=scan.nextLine();
		}
		
		return ar;
	}
	
	
	public static HashMap<Integer,Kite> displayeligibiles(String[] ar,Scanner scan){
		System.out.println("Enter the distance for eligibility:");
		int eligibility=scan.nextInt();
		
		HashMap<Integer,Kite> map=new HashMap<>();

		for(int i=0;i<ar.length;i++) {
			String[] data=ar[i].split(",");
			
			int id=Integer.parseInt(data[0]);
			String name=data[1];
			int distance=Integer.parseInt(data[2]);
			
			Kite k=new Kite();
			k.setId(id);
			k.setName(name);
			k.setDistance(distance);
			
			if((int)k.getDistance()>=eligibility) {
				map.put(id,k);
			}
			
			
		}
		return map;
		
	}
	
	
	public static Kite returnRequired(HashMap<Integer,Kite> map,int option) {
		Kite thirdLargest=null;
		Kite firstLargest=null;
		Kite secondLargest=null;
		
		for(Map.Entry<Integer,Kite> k:map.entrySet()) {
			Kite current=k.getValue();
			if (firstLargest == null || current.getDistance() > firstLargest.getDistance()) {
	            thirdLargest = secondLargest;
	            secondLargest = firstLargest;
	            firstLargest = current;
	        } else if (secondLargest == null || current.getDistance() > secondLargest.getDistance()) {
	            thirdLargest = secondLargest;
	            secondLargest = current;
	        } else if (thirdLargest == null || current.getDistance() > thirdLargest.getDistance()) {
	            thirdLargest = current;
	        }
			
		}
		Kite firstSmallest=null;
		Kite secondSmallest=null;
		Kite thirdSmallest=null;
		for(Map.Entry<Integer,Kite> k:map.entrySet()) {
			Kite current=k.getValue();
			if (firstSmallest == null || current.getDistance() < firstSmallest.getDistance()) {
	            thirdSmallest = secondSmallest;
	            secondSmallest = firstSmallest;
	            firstSmallest = current;
	        } else if (secondSmallest == null || current.getDistance() < secondSmallest.getDistance()) {
	            thirdSmallest = secondSmallest;
	            secondSmallest = current;
	        } else if (thirdSmallest == null || current.getDistance() < thirdSmallest.getDistance()) {
	            thirdSmallest = current;
	        }
			
		}
		if (option == 3) {
	        return thirdLargest;
	    }
		else if(option==2) {
			return secondLargest;
			
		}
		else if(option==1) {
			return firstLargest;
		}
		
		else if(option==11) {
			return firstSmallest;
		}
		else if(option==22) {
			return secondSmallest;
		}
		else if(option==33) {
			return thirdSmallest;
		}
		
		return null;
		
	}
	public static class Kite{
		private int id;
		private String name;
		private int distance;
		public Kite() {
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
		public int getDistance() {
			return distance;
		}
		public void setDistance(int distance) {
			this.distance = distance;
		}
		public Kite(int id, String name, int distance) {
			super();
			this.id = id;
			this.name = name;
			this.distance = distance;
		}
		@Override
		public String toString() {
			return   name + "," + distance ;
		}
		
		
		
	}

}

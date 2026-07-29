//Employee salary tracker

/*10
101,Rahul,January,45000
102,Alex,January,50000
101,Rahul,February,45000
103,Bob,January,35000
101,Rahul,March,50000
102,Alex,February,55000
103,Bob,February,30000
102,Alex,March,50000
102,Alex,july,50000
103,Bob,March,45000

Operations

Total salary earned
Number of months worked
Highest earning employee
Lowest earning employee
Sort by months
Sort by total salary*/

package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class companyp3 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String[] ar=takeinput(scan);
		HashMap<Integer,Employee> map=buildEmpl(ar);
		System.out.println("Enter the operation you want to perform:");
		System.out.println("1.Total Salary earned");
		System.out.println("2.Total months worked");
		System.out.println("3.Highest earning employee");
		System.out.println("4.Lowest earning employee");
		System.out.println("5.sort by months in ascending order");
		System.out.println("6.sort by months in descending order");
		System.out.println("7.sort by total salary in descending order");
		System.out.println("8.sort by total salary in ascending order");
		int input=scan.nextInt();
		if(input==1 || input==2) {
			for(Map.Entry<Integer,Employee> e:map.entrySet()) {
				System.out.println(e.getKey()+","+e.getValue());
			}
		}
		
		else if(input==3 || input==4) {
			Employee e=highestandlowest(map, input);
			System.out.println(e);
		}
		else if(input==5 ||input==6 ||input==7 ||input==8) {
			ArrayList<Employee> list=sortoperations(map, input);
			for(Employee e:list) {
				System.out.println(e.getId()+","+e);
			}
		}
		
	}
	
	public static String[] takeinput(Scanner scan) {
		int noOfEmpl=scan.nextInt();
		scan.nextLine();
		String[] ar=new String[noOfEmpl];
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextLine();
			
		}
		return ar;
	}
	
	public static HashMap<Integer,Employee> buildEmpl(String[] ar){
		HashMap<Integer,Employee> map=new HashMap<>();
			for(int i=0;i<ar.length;i++) {
				String[] data=ar[i].split(",");
				
				int id=Integer.parseInt(data[0]);
				String name=data[1];
				float salary=Float.parseFloat(data[3]);
				
				if(map.containsKey(id)) {
					Employee e=map.get(id);
					e.setMonths_worked(e.getMonths_worked()+1);
					e.setTotal_salary(e.getTotal_salary()+salary);
				}
				else {
					Employee e=new Employee();
					e.setId(id);
					e.setName(name);
					e.setMonths_worked(1);
					e.setTotal_salary(salary);
					map.put(id, e);
				}
			}
		return map;
	}
	
	public static Employee highestandlowest(HashMap<Integer,Employee> map,int input) {
	    Employee highest = null;
	    Employee lowest = null;

	    if (input == 3) { // find highest
	        for (Map.Entry<Integer, Employee> e : map.entrySet()) {
	            Employee current = e.getValue();
	            if (highest == null || current.getTotal_salary() > highest.getTotal_salary()) {
	                highest = current;
	            }
	        }
	        return highest;
	    } else if (input == 4) { // find lowest
	        for (Map.Entry<Integer, Employee> e : map.entrySet()) {
	            Employee current = e.getValue();
	            if (lowest == null || current.getTotal_salary() < lowest.getTotal_salary()) {
	                lowest = current;
	            }
	        }
	        return lowest;
	    }

	    // If input is neither 3 nor 4, return null (or throw exception depending on your design)
	    return null;
	}

	
	public static ArrayList<Employee> sortoperations(HashMap<Integer,Employee> map,int input){
		ArrayList<Employee> list=new ArrayList<>();
		for(Map.Entry<Integer, Employee> e:map.entrySet()) {
			list.add(e.getValue());
		}
		
		if(input==5) {
			Collections.sort(list,new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					
					if(o1.getMonths_worked()==o2.getMonths_worked()) {
						return Float.compare(o1.getTotal_salary(), o2.getTotal_salary());
					}
					
					return Integer.compare(o1.getMonths_worked(),o2.getMonths_worked());
				}
			});
		}
		
		if(input==6) {
			Collections.sort(list,new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					
					if(o2.getMonths_worked()==o1.getMonths_worked()) {
						return Float.compare(o2.getTotal_salary(), o1.getTotal_salary());
					}
					
					return Integer.compare(o2.getMonths_worked(),o1.getMonths_worked());
				}
			});
		}
		
		if(input==7) {
			Collections.sort(list,new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					
					if(o2.getTotal_salary()==o1.getTotal_salary()) {
						return Integer.compare(o2.getMonths_worked(),o1.getMonths_worked());
					}
					
					return Float.compare(o2.getTotal_salary(), o1.getTotal_salary());
				}
			});
		}
		if(input==8) {
			Collections.sort(list,new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					
					if(o2.getTotal_salary()==o1.getTotal_salary()) {
						return Integer.compare(o1.getMonths_worked(),o2.getMonths_worked());
					}
					
					return Float.compare(o1.getTotal_salary(), o2.getTotal_salary());
				}
			});
		}
		
		return list;
	}
	
	public static class Employee{
		private int id;
		private String name;
		private int months_worked;
		private float total_salary;
		public Employee() {
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

		public int getMonths_worked() {
			return months_worked;
		}

		public void setMonths_worked(int months_worked) {
			this.months_worked = months_worked;
		}

		public float getTotal_salary() {
			return total_salary;
		}

		public void setTotal_salary(float total_salary) {
			this.total_salary = total_salary;
		}


		public Employee(int id, String name, int months_worked, float total_salary) {
			super();
			this.id = id;
			this.name = name;
			this.months_worked = months_worked;
			this.total_salary = total_salary;
		}

		@Override
		public String toString() {
			return  name + ","+ months_worked + ","
					+ total_salary ;
		}
		
	}

}

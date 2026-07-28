/*8
/*101,John,Math,90
102,Alex,Science,80
101,John,English,85
103,Bob,Math,70
102,Alex,Math,95
101,John,Science,75
103,Bob,English,80
102,Alex,English,90
*/

package Collections;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class companyp2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] ar=takeinput(scan);
		System.out.println("Enter the operation you want to perform: ");
		System.out.println("1.Calculate total subject + total marks of each student");
		System.out.println("2.Sort the students based on marks in descending order");
		System.out.println("3.Sort the students based on marks in ascending order");
		int input=scan.nextInt();
		HashMap<Integer,Student> map=buildStudentMap(ar);
		if(input==1) {
			
			for(Map.Entry student:map.entrySet()) {
				System.out.println(student.getKey()+","+ student.getValue());
			}

		}
		else if(input==2 || input==3) {
			ArrayList<Student> list=sortstudents(map,input);
			for(Student s:list) {
				System.out.println(s.getId()+","+s);
			}
			
		}
		
	}
	
	public static String[] takeinput(Scanner scan) {
		System.out.println("Enter the number of students with subjects");
		int noOfstds=scan.nextInt();
		scan.nextLine();
		String[] ar=new String[noOfstds];
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter the student details for "+(i+1));
			ar[i]=scan.nextLine();
		}
		
		return ar;
	}
	
	public static HashMap<Integer,Student> buildStudentMap(String[] ar){
		HashMap<Integer,Student> map=new HashMap<>();
		for(int i=0;i<ar.length;i++) {
			String [] data=ar[i].split(",");
			
			int id=Integer.parseInt(data[0]);
			String name=data[1];
			int totalmarks=Integer.parseInt(data[3]);
			
			
			if(map.containsKey(id)) {
				Student s=map.get(id);
				s.setTotalsubs(s.getTotalsubs()+1);
				s.setTotalmarks(s.getTotalmarks()+totalmarks);
			}
			
			else {
				Student s=new Student();
				s.setId(id);
				s.setName(name);
				s.setTotalmarks(totalmarks);
				s.setTotalsubs(1);
				map.put(id, s);
			}
		}
		
		return map;
	}
	
	public static ArrayList<Student> sortstudents(HashMap<Integer,Student> map,int input){
		ArrayList<Student> list=new ArrayList<>();
		for(Map.Entry<Integer,Student> student:map.entrySet()) {
			list.add(student.getValue());
		}
		
		if(input==2) {
			Collections.sort(list,new Comparator<Student>() {
				
				public int compare(Student s1,Student s2) {
					
					if(s1.getTotalmarks()==s2.getTotalmarks()) {
						return Integer.compare(s2.getTotalsubs(), s1.getTotalsubs());
					}
					return Integer.compare(s2.getTotalmarks(), s1.getTotalmarks());
				}
			});
		}
		if(input==3) {
			Collections.sort(list,new Comparator<Student>() {
				
				public int compare(Student s1,Student s2) {
					
					if(s1.getTotalmarks()==s2.getTotalmarks()) {
						return Integer.compare(s1.getTotalsubs(), s2.getTotalsubs());
					}
					return Integer.compare(s1.getTotalmarks(), s2.getTotalmarks());
				}
			});
		}
		
		return list;
		
	}
	
	
	public static class Student {
		private int id;
		private String name;
		private int totalsubs;
		private int totalmarks;
		
		public Student() {
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

		public int getTotalsubs() {
			return totalsubs;
		}

		public void setTotalsubs(int totalsubs) {
			this.totalsubs = totalsubs;
		}

		public int getTotalmarks() {
			return totalmarks;
		}

		public void setTotalmarks(int totalmarks) {
			this.totalmarks = totalmarks;
		}

		public Student(int id, String name, int totalsubs, int totalmarks) {
			super();
			this.id = id;
			this.name = name;
			this.totalsubs = totalsubs;
			this.totalmarks = totalmarks;
		}

		@Override
		public String toString() {
			return   name + "," + totalsubs + "," + totalmarks;
		}
		
		
	}

}

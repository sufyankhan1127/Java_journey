package Collections;
import java.util.*;

public class LearnLists {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(100);
		list2.add(10);
		list2.add(20);
		list2.add(130);
		list2.add(140);
		
		
		/*{{{Collect Interface methods}}*/
//		
//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.contains(20));====On
//		
//		
//		list.remove(1);//removes index
//		list.remove(Integer.valueOf(10));//removes integer object
//		System.out.println(list);
//		
		//add list2 in list 
//		list.addAll(list2);===On
//		System.out.println(list);
		
		
		//remove common elements from both
//		list.removeAll(list2);
//		System.out.println(list);
		
		
		
		//to get the intersection
//		list.retainAll(list2);
//		System.out.println(list);
		
		
		//clear the whole arraylist
//		list.clear();===O1
//		System.out.println(list);
		
		//ArrayList to array
//		Object[] ar =list.toArray();
//		
//		for(Object e:ar) {
//			System.out.print(e+" ");
//		}
		
		
		/*{{{List Interface methods}}*/
		//get,set,add,
//		System.out.println(list);
//		System.out.println(list.get(0));
//		list.set(1, 200);
//		System.out.println(list);
//		
//		list.add(3,1000); //===On
//		System.out.println(list);
//		
//		list.remove(Integer.valueOf(1));
//		System.out.println(list);
//		
		
		
//		System.out.println(list.indexOf(30));
		
//		System.out.println(list.lastIndexOf(30));
	
		
	}

}

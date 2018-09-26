package pojo;
import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
		
		 ArrayList<Integer>myList = new ArrayList<Integer>(5);
		 myList.add(1);
		 myList.add(4);
		 myList.add(3);
		 myList.add(6);
		 myList.add(9);
	
		 
		 for(Integer x : myList)
			 System.out.println(x);
		 
		 System.out.println("Size: "+myList.size());
		 myList.set(0, 100);
		 myList.remove(2);
		 for(Integer x : myList)
			 System.out.println(x);
		 System.out.println("Size: "+myList.size());
		 
		 
		 myList.clear();
		 for(Integer x : myList)
			 System.out.println(x);
		 System.out.println("Size: "+myList.size());
		 
		
	
		 
	}
	
}

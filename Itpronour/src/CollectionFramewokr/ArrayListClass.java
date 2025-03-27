package CollectionFramewokr;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListClass {
	public static void main(String[] args) {
		//Array list Implementation
		ArrayList<Integer> list=new ArrayList<>();
		 // adds the element
		list.add(10);  
		list.add(20);  
		list.add(30);  
		list.add(40);  
		
		  

		
		
		// Used to check method is empty or not
		System.out.println("The List is Empty or not: "+list.isEmpty());   
		
		//to check the size of array list
		System.out.println(list.size());
		
		//remove the element
		list.remove(2);
		
		//to get or print the element in  array list
		System.out.println("Iterating using for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//Adding the element by using the index
		list.add(1,30);
		
		//Printing using for each loop
		System.out.println("Iterating using for each loop");
		for(int i:list) {
			System.out.println(i);
		}
		
		
		ArrayList<Integer>  list2=new ArrayList<>();
		list2.add(50);
		list2.add(60);
		list2.add(70);
		
		//Adding another AyyayList to main ArrayList
		list.addAll(list2);
		System.out.println("ArrayList after adding of another ArrayList");
		for(int i:list) {
			System.out.println(i);
		}
		
		System.out.println("Iterating using the Iterator");
		//3rd way to iterate
	    Iterator<Integer> itr=list.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
		}
}
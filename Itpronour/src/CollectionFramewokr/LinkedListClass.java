package CollectionFramewokr;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListClass {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//
		//Adds the element at first
		list.addFirst(5);
		
		//Adds the element at last
		list.addLast(55);
		
		//Add the element at specific index
		list.add(2,15);
		Iterator<Integer> i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		LinkedList<Integer> l2=new LinkedList<>();
		l2.add(21);
		l2.add(22);
		l2.add(23);
		l2.add(24);
		
		//Add the another linked list 
		list.addAll(4,l2);
		System.out.println("After adding the another list");
		i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		System.out.println("Gettin one element: "+list.getLast());
		System.out.println(list.removeLast());
		System.out.println("Gettin one element: "+list.getLast());
		System.out.println("IS empty:"+ list.isEmpty());
	}
}

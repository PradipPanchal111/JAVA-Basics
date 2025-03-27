package CollectionFramewokr;
import java.util.HashSet;

public class HashSetClass {
	public static void main(String[] args) {
		HashSet<String>  hs1=new HashSet<>();
		
		hs1.add("Mango");
		hs1.add("Apple");
		hs1.add("Banana");
		hs1.add("Grapes");
		hs1.add("Kiwi");
		hs1.add("Orange");
		
		//Does not add the duplicate Orange
		hs1.add("Orange");
		
		
		System.out.println("Elemements are: \n"+ hs1);
		
		//for size
		System.out.println("Size of hash Set: "+ hs1.size());
		
		//for checking whether the element is present or not
		System.out.println("Is mango prasent:"+ hs1.contains("Mango"));
		
		//for clearing the hash set
		hs1.clear();
		System.out.println("After clearing size: "+hs1.size());
	}
}

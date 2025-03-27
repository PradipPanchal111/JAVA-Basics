package CollectionFramewokr;
import java.util.HashMap;
import java.util.Map;
public class HashMapClass {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "Aishwarya");
		hm.put(2, "Priya");
		hm.put(3, "Sandip");
		hm.put(4, "Suman");
		hm.put(5, "Sudhir");
		
		for(Map.Entry<Integer, String> set: hm.entrySet()) {
			System.out.println(set.getKey()+"  "+set.getValue());
		}
		
	}
}

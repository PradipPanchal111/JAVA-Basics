package CollectionFramewokr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparaterClass2 {
	Comparator<Integer> com=new Comparator<Integer>() {
		public int compare(Integer i,Integer j) {
			if(i%10>j%10) {
				return 1;
			}
			else {
				return -1;
			}
		}
	};
	
	static Comparator<String> com2=new Comparator<String>(){
		public int compare(String i,String j) {
			if(i.length()>j.length())
			{
				return 1;
			}
			if(i.length()==j.length()) {
				return 0;
			}
			else {
				return -1;
			}
		}
	};
	
	public static void main(String[] args) {
		ArrayList<Integer> i=new ArrayList<>();
		i.add(10);
		i.add(85);
		i.add(34);
		i.add(87);
		ComparaterClass2 obj=new ComparaterClass2();
		Collections.sort(i,obj.com);
		System.out.println(i);
		
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Pradip");
		arr.add("Supritya");
		arr.add("Om");
		arr.add("Nik");
		arr.add("Ok");
		Collections.sort(arr,com2);
		System.out.println(arr);
	}
}

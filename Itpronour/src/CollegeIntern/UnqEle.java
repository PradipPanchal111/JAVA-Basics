package CollegeIntern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UnqEle {
	public static void main(String[] args) {
		System.out.println("Enter the elements: ");
		Scanner sc=new Scanner(System.in);
		List<Integer> arr=new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			arr.add(sc.nextInt());
		}
		HashMap<Integer,Integer> hm=new HashMap<>();
		
		for(int i:arr) {						 
			hm.put(i, hm.getOrDefault(i, 0)+1);    										//
		}
		
		ArrayList<Integer> arr2=new ArrayList<>();
		
		for(Map.Entry<Integer,Integer> e:hm.entrySet()) {
			if(e.getValue()==1) {
				arr2.add(e.getKey());
			}
		}
		System.out.print("Unique elements are : "+arr2);
//		for(int i:arr2) {
//			System.out.println(i+" ");
//		}
	}
}

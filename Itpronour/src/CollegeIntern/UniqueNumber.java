package CollegeIntern;

import java.util.Scanner;

public class UniqueNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		
		for(int i=0;i<size;i++) {
			int r=0;
			for(int j=0;j<size;j++) {
				if(arr[i]==arr[j]) {
					r++;
				}
			}
			if(r==1) {
				System.out.println("Unique is: "+ arr[i]);
				break;
			}
		}
		
		sc.close();
		
	}
}

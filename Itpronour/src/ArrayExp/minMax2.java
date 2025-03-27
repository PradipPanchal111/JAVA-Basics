package ArrayExp;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class minMax2 {
	public static void main(String[] args) {
		int n=5;
		Integer arr[]=new Integer[n];
		Scanner sc=new Scanner(System.in);
		
		//First array element insertion
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int min=Collections.max(Arrays.asList(arr));
		int max=Collections.min(Arrays.asList(arr));
		System.out.println("Minimum Element: "+min +" Maximum Element: "+ max);
	}
}

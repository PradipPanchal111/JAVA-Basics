package ArrayExp;
import java.util.*;
import java.util.Arrays;
public class MinMaxInbuilFunction {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int length=sc.nextInt();
		int[] arr=new int[length];
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Min no is: "+arr[0]+".  Max no is "+arr[arr.length-1]+".");
	}
}

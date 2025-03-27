package ArrayExp;
import java.util.*;
public class sumOfArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array :");
		int n=sc.nextInt(),sum=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Total = "+ sum);
		
	}
}

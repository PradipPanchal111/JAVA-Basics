package ArrayExp;
import java.util.*;
import java.util.Arrays;
public class MinMax {
	
	public static void main(String args[])
	{
		int[] ar=new int[10];
		int min=0,max=0;
		System.out.println("Enter 10 elements : ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		min=ar[0];max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println("Minimum is :"+min+" Maximum no is :"+max);
	}
}

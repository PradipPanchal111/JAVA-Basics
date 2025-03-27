package ArrayExp;

import java.util.Scanner;

public class FiboOfArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,m;
		System.out.print("Enter length of array :");
		int no=sc.nextInt();
		System.out.println("Enter the numbers :");
		int[] arr=new int[no];
		for(int i=0;i<no;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		
		//Truning array into Fibonacci Series
		n=arr[0];
		m=arr[1];
		for(int i=2;i<arr.length;i++)
		{
			arr[i]=m+n;
			m=arr[i];
			n=arr[i-1];
		}
		
		//Printing of Fibonacci Numbers
		System.out.print("Fibonacci Series: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		sc.close();
	}
}

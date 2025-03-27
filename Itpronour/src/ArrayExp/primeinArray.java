package ArrayExp;

import java.util.Scanner;
import java.util.*;
public class primeinArray {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		int l=10;
		System.out.println("Enter the elements in array: ");
		outerloop:
		for(int i=0;i<10;i++)
		{
			int temp=sc.nextInt();
			for(int j=2;j<=temp/2;j++)
			{
				if(temp%2==0)
				{
					continue outerloop;
				}
			}
			arr.add(temp);
		}
		System.out.print("Prime no's are:");
		for(int i:arr)
		{
			System.out.print(" "+ i);
		}
		sc.close();
	}
}

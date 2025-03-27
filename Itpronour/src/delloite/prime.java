package delloite;
import java.util.*;
import java.util.Collections;

public class prime 
{
	public static boolean checkPrime(int no)
	{
		if(no<=1)
		{
			return false;
		}
		for(int i=2;i<no/2;i++)
		{
			if(no%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting point: ");
		int start=sc.nextInt();
		System.out.println("Enter ending point: ");
		int end=sc.nextInt();
		ArrayList<Integer> prime=new ArrayList<>();
		for(int i=start;i<=end;i++)
		{
			if(checkPrime(i))
			{
				prime.add(i);
			}
		}
		for(int i:prime)
		{
			System.out.println(i);
		}
		int min=Collections.min(prime);
		int max=Collections.max(prime);
		int addition=min+max;
		System.out.println("Additon is :"+addition);
		sc.close();
	}
}

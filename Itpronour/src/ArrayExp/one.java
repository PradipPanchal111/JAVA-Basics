package ArrayExp;
import java.util.*;
public class one {
	public static void main(String args[])
	{
		int[] marks=new int[5];
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length :");
		n=sc.nextInt();
		System.out.println("Enter the marks of "+ n +" students");
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		System.out.println("All elements: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("Even  elements: ");
		for(int i=0;i<n;i++)
		{
			if(marks[i]%2==0)
			 System.out.println(marks[i]);
		}
	}
}

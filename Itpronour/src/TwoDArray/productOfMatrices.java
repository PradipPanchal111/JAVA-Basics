package TwoDArray;
import java.util.*;
public class productOfMatrices {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=3;
		int arr[][]=new int[n][n];
		int brr[][]=new int[n][n];
		int crr[][]=new int[n][n];
		System.out.println("Enter "+n+" dimentional array elements of first array ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		
		
		System.out.println("Enter "+n+" dimentional array elements of second array ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				brr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					crr[i][j]=crr[i][j]+(arr[i][k]*brr[k][j]); 
				}
			}
		}
		
		
		System.out.println("Multiplied Matrix ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("| "+crr[i][j]+" |");
			}
			System.out.println();
		}
	}
}

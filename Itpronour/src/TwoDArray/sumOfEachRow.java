package TwoDArray;

import java.util.Scanner;

public class sumOfEachRow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=3;
		int arr[][]=new int[n][n];
		System.out.println("Enter "+n+" dimentional array elements of first array ");
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
				sum+=arr[i][j];
			}
			System.out.print(i+1+"th row's Sum : "+ sum);
			System.out.println();
		}
		System.out.println();
	}
}

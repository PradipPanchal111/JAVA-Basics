package TwoDArray;

import java.util.Scanner;

public class matrixAddition {
	public static void main(String[] args) {
		int arr[][]=new int[2][2];
		int brr[][]=new int[2][2];
		int crr[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		
		//First Array Input
		System.out.println("Enter the elements in first 2D arrya: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		//Second Array Input
		System.out.println("Enter the elements in second 2D array: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				brr[i][j]=sc.nextInt();
			}
		}
		
		
		//Addition of both array
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				crr[i][j]=arr[i][j]+brr[i][j];
				System.out.print("| "+crr[i][j]+" |");
			}
			System.out.println();
		}
		
	}
}

package TwoDArray;
import java.util.*;
import java.util.Iterator;

public class matrixMultiplication {
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
		
		//First array element printing
		System.out.println("First Array: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("| "+arr[i][j]+" |");
			}
			System.out.println();
		}
		
		//Second array element printing
		System.out.println("First Array: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("| "+brr[i][j]+" |");
			}
			System.out.println();
		}
		
		//Multiplying the row & column and assigning the values of crr
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				{
					crr[i][j]=crr[i][j]+(arr[i][k]*brr[k][j]);
				}
			}
		}
		
		//Multiplied array element printing
		System.out.println("Multiplied Array: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("| "+crr[i][j]+" |");
			}
			System.out.println();
		}		
	}
}

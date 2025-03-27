package TwoDArray;
import java.util.*;
public class transposeMatrix {
	public static void main(String[] args) {
		int n=2;
		int arr[][]=new int[n][n];
		int crr[][]=new int[n][n];
		Scanner sc=new Scanner(System.in);
		 
		
		//Array Elements input
		System.out.println("Enter the matrix elements :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		//Transpose of Matrix
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				crr[i][j]= arr[j][i];
				System.out.print("| "+crr[i][j]+" |");
			}
			System.out.println();
		}
	}
}

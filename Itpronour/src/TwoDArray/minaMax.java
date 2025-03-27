package TwoDArray;
import java.util.*;

public class minaMax {
	public static void main(String[] args) {
		int n=2;
		int arr[][]=new int[n][n];
		Scanner sc=new Scanner(System.in);
		int min,max;
		//Array element insertion
		System.out.println("Enter elements in array: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		min=arr[0][0];
		max=arr[0][0];
		//Calculating min and max element
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
			}
		}
		
		
		System.out.println("Minimum Element: "+min +" Maximum Element: "+ max);
		sc.close();
	}
}

package ArrayExp;

import java.util.Scanner;

public class insInSameArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array"); 
		int size=sc.nextInt();										//Size of Array
		int[] arr=new int[size+1];
		System.out.println("Enter the values of the array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Original Array is: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+ " " );
		}
		System.out.println();
		
		//insert element
		System.out.println("Enter the element to insert into array");
		int element=sc.nextInt();
		
		System.out.println("Enter the position to insert into array( 1 to "+(size+1)+") : ");
		int position=sc.nextInt();
		position--;
	
		if(position>size+1 || position<=0)
		{
			System.out.println("Invalid Position");
			return;
		}
		
		if(position==size+1)
		{
			arr[position]=element;
		}
		else
		{
			for(int i=size;i>position;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[position]=element;
		}
		
		System.out.println("Updated Array is: ");
		for(int i=0;i<size+1;i++)
		{
			System.out.print(arr[i]+ " " );
		}
	}

}

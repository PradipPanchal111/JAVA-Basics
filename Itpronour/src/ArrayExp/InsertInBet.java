package ArrayExp;
import java.util.*;

public class InsertInBet {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array"); 
		int size=sc.nextInt();										//Size of Array
		int[] arr=new int[size];
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
		
		//Insert Element
		System.out.println("Enter the element to insert into array");
		int element=sc.nextInt();
		
		System.out.println("Enter the position to insert into array( 1 to "+(size)+") : ");
		int position=sc.nextInt();
		
		if(position<1 || position >size)
		{
			System.out.println("Invalid posiiton : (Can't Insert the element) ");
			return;
		}
		
		int[] newArray=new int[size+1];
		for(int i=0, j=0;i<newArray.length;i++)
		{
			if(i==position-1)
			{
				newArray[i]=element;
			}
			else
			{
				newArray[i]=arr[j];
				j++;
			}
		}
		
		System.out.println("New Array is: ");
		for(int i=0;i<size+1;i++)
		{
			System.out.print(newArray[i]+ " " );
		}
		
		
		
		//Delete the element  
		System.out.print("Enter number to delete: ");
		element=sc.nextInt();
		int flag=0;
		for(int i=0;i<newArray.length;i++)
		{
			if(newArray[i]==element)
			{
				flag=1;
				position=i;
			}
		}
		if(flag==1)
		{
			for(int i=position;i<newArray.length-1;i++)
			{
				newArray[i]=newArray[i+1];
				if(i+1==newArray.length-1)
				{
					newArray[i+1]=0;
				}
			}			
		}
		else
		{
			System.out.println("Element not found..");
		}
		
		System.out.println("New Array is: ");
		for(int i=0;i<size+1;i++)
		{
			System.out.print(newArray[i]+ " " );
		}
		
	}
}

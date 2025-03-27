package Patterns;

public class pyramid 
{
	public static void one()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=4;j++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<j+i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		
	}
}

package Patterns;

public class pat1 
{
	static public void one()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static public void two()
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	
	static public void three()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void four()
	{
		for(int i=1;i<=5;i++)
		{	
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=6-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		one();
		two();
		three();
		four();
	}
}

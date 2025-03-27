import java.util.*;
public class prime {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check prime or not: ");
		int no=sc.nextInt();
		int flag=0,m=no/2;
		if(no==1||no==0)
		{
			System.out.println(no+" is not a prime number");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(no%i==1)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println(no+" is not a prime number");
			}
			else
			{
				System.out.println(no+" is a prime number");
			}
		}
	}

}

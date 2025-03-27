import java.util.Scanner;

public class armstrong 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to check armstrong : ");
		int no=sc.nextInt();
		int dig,res=0,temp=no;
		while(no!=0)
		{
			dig=no%10;
			res=dig*dig*dig+ res;
			no/=10;
		}
		if(res==temp)
		{
			System.out.println("Armstrong");
			
		}
		else
		{
			System.out.println("Not Armstrong");
		}
		
	}
}

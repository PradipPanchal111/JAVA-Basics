import java.util.*;
public class palindrome {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to check palindrome : ");
		int no=sc.nextInt();
		int dig,res=0,temp=no;
		while(no!=0)
		{
			dig=no%10;
			res=res*10+dig;
			no=no/10;
		}
		if(res==temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	
}

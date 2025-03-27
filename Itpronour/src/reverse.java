import java.util.*;
public class reverse {
	public int rev(int no)
	{
		int dig,res=0;
		while(no!=0)
		{
			dig=no%10;
			res=res*10+dig;
			no=no/10;
		}
		return res;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to reverse: ");
		int no=sc.nextInt();
		reverse obj=new reverse();
		int res=obj.rev(no);
		System.out.println("Reversed No: " +res);
	}
}

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		long n = sc.nextLong();
		long arr[] = new long[10];
		int i = 1;
		int ind=0;
		long sum = 0;
		
		while(n > 0)
		{
			int rem = (int)(n % 10);
			arr[ind] = rem * i;
			i++;ind++;
			n = n / 10;
		}
		for(int j = 0; j<10; j++)
		{
			sum = sum + arr[j];
		}
//		0061964360
//      0306406152
		if(sum % 11 == 0)
		{
			System.out.print("Valid");
		}
		else {
			System.out.println("Not valid");
		}
		
		main(args);
	}

}

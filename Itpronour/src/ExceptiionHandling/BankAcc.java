package ExceptiionHandling;
import java.util.*;
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String m) {
		super(m);
	}
}
public class BankAcc {
	int AvlBalance=1000;
	public void showBal() {
		System.out.println("Balance is 💵💰: "+ AvlBalance);
	}
	public void withdrow(int c) throws InsufficientBalanceException{
		if(c>AvlBalance) {
			throw new InsufficientBalanceException("⚠️⚠️Insufficient Balance⚠️⚠️");
		}else
		{
			AvlBalance-=c;
			System.out.println("Balance After Withrow 🏦: "+ AvlBalance);
		}
	}
	public void deposit(int c) {
		AvlBalance+=c;
		System.out.println("Balance After Deposit 🏦: "+ AvlBalance);
	}
	
	public static void main(String[] args) {
		//System.out.println("Enter your choise 👆: ");
		Scanner sc=new Scanner(System.in);
		BankAcc b=new BankAcc();
		int amt=0;;
		int ch=0;;
		
		while(ch!=4) {
			System.out.println(" 1) Show Balance\n"
					+ " 2) Withdrow\n"
					+ " 3) Deposit\n"
					+ " 4) Exit");
			System.out.println("Enter your choise 👆: ");
			ch=sc.nextInt();
			switch(ch) {
			
			case 1:
				b.showBal();
				break;
				
			case 2:
				System.out.println("Enter the amount🤑🤑 to withdrow: ");
				amt=sc.nextInt();
				try {
					b.withdrow(amt);
				}catch(InsufficientBalanceException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 3:
				System.out.println("Enter the amount🤑🤑 to deposit: ");
				amt=sc.nextInt();
				b.deposit(amt);
				break;
				
			case 4:
				System.out.println("🙏Thank You Visit Again🙏");
				System.exit(1);
				break;
				
			default:
				System.out.println(" ------------------------");
				System.out.println("|❌❌ Invlalid Choise❌❌|");
				System.out.println(" ------------------------");
				break;
			}
		}
	}
}

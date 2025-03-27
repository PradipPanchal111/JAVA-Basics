package OOPS;
import java.util.*;
public class BankDetails {
	int accNo;
	String name;
	String add;
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no:");
		accNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account Holder Name: ");
		name=sc.nextLine();
		System.out.println("Enter address: ");
		add=sc.nextLine();
		sc.close();
	}
	void show() {
		System.out.println("Acc No: "+accNo);
		System.out.println("Name: "+name);
		System.out.println("Address: "+add);
	}
	
	public static void main(String[] args) {
		BankDetails b=new BankDetails();
		b.accept();
		b.show();
	}
}

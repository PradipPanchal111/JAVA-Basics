package OOPS;
import java.util.*;
public class atm {
	Scanner sc=new Scanner(System.in);
	String nm="PRADIP";
	int balance=10000;	
	String bank="SBI";
	static public String IFSC="FVXP4263B";
	void credit() {
		System.out.println("Enter amount to credit:");
		int cr=sc.nextInt();
		balance+=cr;
	}
	void debit() {
		System.out.println("Enter amount to credit:");
		int db=sc.nextInt();
		balance-=db;
	}
	void show() {
		System.out.println("Account Holder Name: "+nm+ "\nBank: "+bank+"\nIFSC: "+IFSC+"\nBalance:"+ balance);
	}
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		atm a=new atm();
		int ch;
		do {
			System.out.println("________________MENU_________________");
			System.out.println(" 1)Credit \n 2)Debit \n 3)Show Balance &  Details\n 4)Exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1: a.credit(); break;
			case 2: a.debit(); break;
			case 3: a.show(); break;
			case 4: System.out.println("---------------Thank You.....Visit Again---------------"); break;
			default: System.out.println("Invalid Choise");
			}
		}while(ch!=4);
		
		
	}
}

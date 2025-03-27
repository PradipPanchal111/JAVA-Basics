package SynchronizatoinDemo;
class BankAccount{
	private int bal;
	
	public void deposit(int amt) {
		bal+=amt;
		System.out.println("Deposit Successful..New Balance :"+this.bal);
	}
	
	public void withdraw(int amt) {
		
		if(bal>=amt) {
			bal-=amt;
			System.out.println("Withdraw Successful..New Balance :"+this.bal);
		}
		else {
			System.out.println("Insufficien Balance");
		}
	}
}

class Deposit extends Thread{
 	BankAccount b=new BankAccount();
	public Deposit (BankAccount b) {
		this.b=b;
	}
	public void run() {
		b.deposit(2000);
	}
}


class Withdraw extends Thread{
	BankAccount b=new BankAccount();
	public Withdraw (BankAccount b) {
			this.b=b;
	}
	public void run() {
		b.withdraw(255);
	}
}	
	
public class Account {
	
	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		Deposit d=new Deposit(b);
		
		Withdraw w=new Withdraw(b);
		
		d.start();
		try {
			d.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		w.start();
		
		System.out.println("The main thread is running");
	}
}

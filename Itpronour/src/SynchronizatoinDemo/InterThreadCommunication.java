package SynchronizatoinDemo;

class MyAccount{
	private int amount;
	public MyAccount(int amt) {
		this.amount=amt;
		System.out.println("The Current Balance is :"+this.amount);
	}
	
	synchronized public void withdraw(int amt) {
		System.out.println("Going to Withdraw: "+amt);
		
		while(this.amount<amt) {
			System.out.println("Insufficient Balance........!");
			try {
				wait();
			}catch(InterruptedException e) {
				e.getMessage();
			}
		}
		
		this.amount-=amt;
		System.out.println("Withdraw: "+amt);
		System.out.println("Remaining Balance is"+this.amount);
	}
	
	synchronized public void deposit(int amt) {
		System.out.println("Going to deposit: "+this.amount);
		
		if(amt>0) {
			this.amount+=amt;
			System.out.println("Deposited: "+amt);
		}
		else {
			System.out.println("Amount should be Greater than 0");
		}
		
		System.out.println("The updated balance is: "+ this.amount);
	}
}

class Dep extends Thread{
	MyAccount o;
	int amt;
	public Dep(MyAccount o,int amt){
		this.o=o;
		this.amt=amt;
	}
	public void run() {
		o.deposit(amt);
	}
}

class Wit extends Thread{
	MyAccount o;
	int amt;
	public Wit(MyAccount o,int amt){
		this.o=o;
		this.amt=amt;
	}
	public void run() {
		o.withdraw(amt);
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		MyAccount a=new MyAccount(20000);
		Wit w1=new Wit(a,20000);
		Wit w2=new Wit(a,20000);
		
		
		Dep d1=new Dep(a,50000);
		
		w1.start();
		w2.start();
		
		d1.start();
	}

}

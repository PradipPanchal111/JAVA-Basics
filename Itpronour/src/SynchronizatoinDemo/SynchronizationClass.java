package SynchronizatoinDemo;
//Synchronization using synchronization blcok
class Table1{
	static synchronized public void print(int n) {   //synchronized method
			
			for(int i=1;i<=10;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}

class Thread3 extends Thread{
	
	Table1 t;
	public Thread3(Table1 t) {
		this.t=t;
	}
	public void run() {
		t.print(5);
	}
}
class Thread4 extends Thread{
	Table1 t;
	public Thread4(Table1 t) {
		this.t=t;
	}
	public void run() {
		t.print(7);
	}
}
public class SynchronizationClass {
	public static void main(String[] args) {
		
		Table1 obj=new Table1();
		Thread3 t1=new Thread3(obj);
		Thread4 t2=new Thread4(obj);
		t1.start();
		t2.start();
		
	}
}


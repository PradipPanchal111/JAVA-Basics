package SynchronizatoinDemo;
//Synchronization using synchronization blcok
class Table{
	synchronized public void print(int n) {   //synchronized method
		
		synchronized(this) {     //Synchronized block
			
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
}

class Thread1 extends Thread{
	
	Table t;
	public Thread1(Table t) {
		this.t=t;
	}
	public void run() {
		t.print(5);
	}
}
class Thread2 extends Thread{
	Table t;
	public Thread2(Table t) {
		this.t=t;
	}
	public void run() {
		t.print(7);
	}
}
public class SyncBlock {
	public static void main(String[] args) {
		
		Table obj=new Table();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t2.start();
		
	}
}

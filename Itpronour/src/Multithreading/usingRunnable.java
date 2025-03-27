package Multithreading;
class myC1 implements Runnable{
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class myC2 implements Runnable{
	public void run() {
		for(char i='a';i<'f';i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class usingRunnable {
	public static void main(String[] args) {
		Runnable o=new myC1();
		Runnable o2=new myC2();
	
		Thread t1=new Thread(o);
		Thread t2=new Thread(o2);
		t1.start();
		t2.start();
	}

}

package Multithreading;
class demo1 extends Thread{
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
class demo2 extends Thread{
	public void run() {
		for(char i='A';i<'F';i++) {
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
public class myClass {
	public static void main(String[] args) {
		demo1 d1=new demo1();
		demo2 d2=new demo2();
		//d2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(d2.getPriority());
		d1.start();
		d2.start();
	}
}

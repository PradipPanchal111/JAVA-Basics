package Multithreading;
class myThread extends Thread{
	public void run()
	{
		int n=2;
		for(int i=1;i<=10;i++) {
//			System.out.println(n*i);
			try {
				
			}
			catch(Exception e) {
				System.out.println("Error");
			}
			System.out.println(i*n);
		}
	}
	
}
public class one {
	public static void main(String[] args) {
		myThread t1=new myThread();
		myThread t2=new myThread();
		myThread t3=new myThread();
		t1.start();
		t2.start();
		t3.start();
		System.out.println("thrad");
	}
}

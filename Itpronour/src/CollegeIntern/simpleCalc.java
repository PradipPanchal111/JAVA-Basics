package CollegeIntern;

interface Cal{
	public abstract void add(int a,int b);
}
public class simpleCalc implements Cal{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Cal c=new simpleCalc();
		c.add(1, 2);
	}
}

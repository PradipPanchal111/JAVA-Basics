package Sh;
class parent{
	public void show() {
		System.out.println("HEllo");
	}
}

public class child extends parent{
	public void show1() {
		super.show();
	}
	public static void main(String[] args) {
		child obj=new child();
		obj.show1();
	}
}

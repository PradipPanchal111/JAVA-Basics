package OOPS;
import java.util.*;
public class one 
{
	private	int id;
	private String name;
	private int age;
	void accept() {
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		sc.nextLine();
		System.out.println();
		name=sc.nextLine();
		age=sc.nextInt();
		sc.close();
	}
	void show(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);

	}
	
	
	public static void main(String[] args) {
		one o=new one();
		o.accept();
		o.show();
	}
}

package ExceptiionHandling;
import java.util.*;
class InvlaidAgeException extends Exception{
	public InvlaidAgeException(String m){
		super(m);
	}
}
public class CustomExceptionJava {
		static public void validateAge(int age) throws InvlaidAgeException{
			if(age<=17) {
				throw new InvlaidAgeException("Age is not valid: Access Denied");
			}
			else
			{
				System.out.println("Access Granted");
			}
		}
	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		try {
			validateAge(age);
		}
		catch(InvlaidAgeException e) {
			System.out.println(e.getMessage());
		}
}
}
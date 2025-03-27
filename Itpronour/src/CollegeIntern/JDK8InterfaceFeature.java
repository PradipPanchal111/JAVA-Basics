package CollegeIntern;
@FunctionalInterface
interface calculator{
	public abstract void add(int a,int b);
	
}
public class JDK8InterfaceFeature {
	public static void main(String[] args) {
		
		calculator c=(a,b)->System.out.println(a+b);
		c.add(10, 20);
	}
}


/*
 * Functional interface has only one abtract method to be eligible to implementation of lambda method 
 * Any class can implement the interface
 * no need for a separate  method overriding in the class
 * Main feature of JDK 8 is concise coding using the interface
 create the ref variable using the interface and assign an epression that is lambda starts with argument and->
  if only  one statement you dont need even the curly braces argument types of the method also not abementioned
   we may use an annotation to mark this interface as functional Interface
    @FuncttionaInterface
    Eclipse like IDE will help you to write clean code using inline compiler
*/
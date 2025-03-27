package ExceptiionHandling;

public class one extends Exception{
	
	public void div(int a,int b) {
		System.out.println("Divide is: "+ (a/b));
	}
	public void show()throws Exception{
		
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		one a=new one();
		try {
			a.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		try {
			a.div(10,10);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Divide By Zero Exception");
		}
		
	}

}

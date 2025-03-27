package OOPS;
import java.util.*;
public class ProfandLoss {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the product price: ");
		int productPrice=sc.nextInt();
		System.out.println("Enter the selling price: ");
		int sellingPrice=sc.nextInt();
		
		
		if(sellingPrice>productPrice) {
			System.out.println("Profit is "+ (productPrice-sellingPrice));
		}
		else {
			System.out.println("Loss is"+(sellingPrice-productPrice));
		}
		
		
	}
}

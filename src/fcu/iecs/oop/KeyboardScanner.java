package fcu.iecs.oop;
import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a integer");
		int integer =  keyboard.nextInt();
		System.out.println("Enter a float point number");
		float pointnum =  keyboard.nextFloat();
		System.out.println("Enter your name");
		String name =  keyboard.next();
		
		double num = integer*pointnum;
		
		System.out.printf("Hi "+ name +" , the multiplication of "+ integer +" and "+ pointnum +" is "+"%.2e",num);
	}

}

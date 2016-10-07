package fcu.iecs.oop;
import java.util.Scanner;
public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner check = new Scanner(System.in);
		 System.out.println("Enter a integer");
		 int integer =  check.nextInt();
		 if(integer%2==0) System.out.println("The input integer is Even Number");
		 if(integer%2==1) System.out.println("The input integer is Odd Number");
	}

}

package fcu.iecs.oop;
import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numb = new Scanner(System.in);
		System.out.println("Enter a integer");
		int integer =  numb.nextInt();
		if(integer==1) System.out.println("The input integer is 'ONE'");
		else if(integer==2) System.out.println("The input integer is 'TWO'");
		else if(integer==3) System.out.println("The input integer is 'THREE'");
		else if(integer==4) System.out.println("The input integer is 'FOUR'");
		else if(integer==5) System.out.println("The input integer is 'FIVE'");
		else if(integer==6) System.out.println("The input integer is 'SIX'");
		else if(integer==7) System.out.println("The input integer is 'SEVEN'");
		else if(integer==8) System.out.println("The input integer is 'EIGHT'");
		else if(integer==9) System.out.println("The input integer is 'NINE'");
		else System.out.println("The input integer is 'OTHER'");
		

	}

}

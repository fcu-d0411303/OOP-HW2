package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str = new Scanner(System.in);
		int a=1;
		while(a==1){
		System.out.println("Enter a string 1 :");
		String str1 =  str.next();
		System.out.println("Enter a string 2 :");
		String str2 =  str.next();
		if(str1.compareToIgnoreCase(str2)==0) 
		{
		System.out.println("The two strings are the same");
		System.out.println("µ{¦¡µ²§ô");
		break;
		}
		else System.out.println("The two strings are not the same");
		}
	}

}

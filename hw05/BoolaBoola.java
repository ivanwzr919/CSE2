/////////////////////////////////////////////
//Zherui Wang
//Date: 9/30/14
//Professor Brian Chen 
//Class CSE 002-112
//CourseNumber Java Program
//The program that has three boolean variables to each of which the value of true or false is randomly assigned. Then, at random, combine the three variables with random choices of && and || and stores the result. 
import java.util.Scanner;

//define a class
public class BoolaBoola {
	// define a method
	static boolean result;

	public static String randprocess(boolean x) {
		int temp = (int) (Math.random() * 2);
		switch (temp) {
		case 0:
			result = result || x;
			return "||";
			// break;
		case 1:
			result = result && x;
			return "&&";
			// break;
		}
		return "";
	}
	
	public static boolean randomvalue()
	{
		int temp = (int) (Math.random() * 2);
		switch (temp) {
		case 0:
			return true;
			//break;
		case 1:
			return false;
			//break;
			default:
				return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner S;
		S = new Scanner(System.in);
		boolean a, b, c;
		a=randomvalue();
		b=randomvalue();
		c=randomvalue();
		
		System.out.print("Dose " + a + randprocess(b) + b + randprocess(c) + c
				+ " have the value true(t/T) or false(f/F)? ");
		String Ans = S.next();
		int length = Ans.length();
		switch (length) {
		case 1:
			char A = Ans.charAt(0);
			switch (A) {
			case 'T':
			case 't':
				if (result == true) {
					System.out.println("Correct");
				} else {
					System.out.println("Wrong! Try again");
				}
				break;
			case 'F':
			case 'f':
				if (result == false) {

					System.out.println("Correct");
				} else {
					System.out.println("Wrong! Try Again");
				}
				break;
			default:
				System.out.println("Wrong! Try Again");
				break;

			}// end
		}
	}
}



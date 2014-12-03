import java.util.Scanner;
public class Methods{
	public static int getInput(Scanner scanner){
		while (!scanner.hasNextInt()){
			scanner.nextLine();
			System.out.println("You didn't enter an integer. Try Again");
		}
		return scanner.nextInt();
	}
 
	public static int larger(int a, int b)
	{
		return a > b ? a : b;
	}
 
	public static String ascending( int a, int b, int c)
	{
		return a < b ? b < c ? "true" : "false" : "false";
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner scan=new Scanner(System.in);
		 int a,b,c;
 
		 System.out.println("Enter three ints");
		 System.out.println("Enter an int: ");
		 a= getInput(scan);
		 System.out.println("Enter an int: ");
		 b= getInput(scan);
		 System.out.println("Enter an int: ");
		 c= getInput(scan);
 
		 System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
		 System.out.println("The larger of "+a+", "+b+", and "+c+
		                    " is "+larger(a,larger(b,c)));
		 System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
		                    ", and "+c+" are in ascending order");
	}
}

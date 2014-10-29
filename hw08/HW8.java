/////////////////////////////////////////////
//Zherui Wang
//Date: 10/28/14
//Professor Brian Chen 
//Class CSE 002-112
//CourseNumber Java Program
//The program is to write 3 methods.
import java.util.Scanner;
import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }  
public static char getInput(Scanner scan, String words){
     char out=' ';
     int s=0;
     while(s==0){
     String input=scan.next();
     if(input.length()==1){
         char in=input.charAt(0);
         for(int a=0;a<words.length();a++){
             char x=words.charAt(a);
             if(x==in){out=x;s=1;
             break;}
        }
     if(out==' '){System.out.print("You did not enter a character from the list '"+words+"' . Try again: ");}
     }
     else{System.out.print("You should enter exactly one character :");}
     }
     return out;
}
public static char getInput(Scanner scan, String words,int k){
    char out=' ';
    int s=0,q=0;
     while(q==0){
     String input=scan.next();
     if(input.length()==1){
         char in=input.charAt(0);
         for(int a=0;a<words.length();a++){
             char x=words.charAt(a);
             if(x==in){out=x;q=1;
             break;}
        }
        s++;
			if(s>k && out==' '){
				System.out.println("You failed after "+k+" tries.");
		break;	}
     if(out==' '){System.out.print("You did not enter a character from the list '"+words+"' . Try again: ");}
     }
     else{System.out.print("You should enter exactly one character :");}
 
     }
     return out;
}
     public static char getInput(Scanner scan, String prompt, String words){
    char out=' ';
     int s=0;
     while(s==0){
     String input=scan.next();
     if(input.length()==1){
         char in=input.charAt(0);
         for(int a=0;a<words.length();a++){
             char x=words.charAt(a);
             if(x==in){out=x;s=1;
             break;}
        }
     if(out==' '){System.out.print("Enter exactly one character");
         System.out.println(prompt);
     }
     }
     else{System.out.print("You did not enter an acceptable character");}
     System.out.println(prompt);
     }
     return out;
     }
}
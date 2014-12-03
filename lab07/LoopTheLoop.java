import java.util.Scanner;
public class LoopTheLoop{
     public static void main(String[] args){
     Scanner myScanner = new Scanner( System.in );
     int nStars=10;
     while (nStars>=1){
     System.out.print("*");
     nStars--;
     }
      System.out.println(" ");
     int S=1;
     String s="*";
      while (S<=10){
     System.out.println(s);
     s=s+"*";
     S++;
     }
     while(true){
     System.out.print("Enter an int between 1 and 15- ");
     int Stars=myScanner.nextInt();
     if(Stars<=15&&Stars>=1){
     int Star=1;
     String star="*";
     while (Star<=Stars){
     System.out.println(star);
     star=star+"*";
     Star++;
     }
     }
     else{System.out.println("Your int was not in the range [1.15]");
     return;
     }
     System.out.print("Enter y or Y to go again- ");
     String test=myScanner.next();
      if (test.equals("N") || test.equals("n") || test.equals("Y")|| test.equals("y")){
     if (test.equals("N") || test.equals("n")){
     break;}
      }
     else {System.out.println("You did not enter one of 'Y','y','N'.'n'");
     return;}
     }
     
     }
}
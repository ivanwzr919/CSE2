//This program is for obtaining how many big macs they want and whether thet want to have an order fo fries

import java.util.Scanner;
public class BigMacAgain{
   //main method required for every Java program
   public static void main(String[] args){
   
   Scanner myScanner = new Scanner( System.in );   
   System.out.print("Enter the number of Big Macs: ");
   if (myScanner.hasNextInt()){
      int BigMacs = myScanner.nextInt();
      if (BigMacs>=0){
         System.out.println("You ordered "+BigMacs+" Big Macs for a cost of "+BigMacs+"*2.2 = $"+(BigMacs*2.2));
         System.out.print("Do you want an order of fries (Y/y/N/n)? ");
         String answer = myScanner.next();
         if (answer.equals("Y")||answer.equals("y")){
             System.out.println("You ordered fries at a cost of $2.15");
             System.out.println("The total cost of meal is $"+(BigMacs*2.2+2.15));
         }
         else if (answer.equals("N")||answer.equals("n")){
             System.out.println("The total cost of meals is $"+(BigMacs*2.2));
        }  
         else {System.out.println("You did not enter one of 'y','Y','n','N'");
      }
      }
   else{System.out.println("You did not enter an int>0");
   }
   }
else{System.out.println("You did not enter an int");
   return;
   }
   }
}


     
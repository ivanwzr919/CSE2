
import java.util.Scanner;
public class IncomeTax{
   //main method required for every Java program
   public static void main(String[] args){
       Scanner myScanner = new Scanner( System.in ); 
        System.out.print("Enter an int giving the number of thousands- ");
   if (myScanner.hasNextInt()){
       int IncomeTax = myScanner.nextInt();
           if (0<IncomeTax && IncomeTax<20){System.out.println("The tax rate on $ " +(IncomeTax*1000)+ " is 5%, and the tax is $ "+ 0.05*IncomeTax*1000 );}
           else if (20<=IncomeTax && IncomeTax<40){System.out.println("The tax rate on $ " +(IncomeTax*1000)+ " is 7%, and the tax is $ "+ 0.07*IncomeTax*1000 );}
           else if (40<=IncomeTax&& IncomeTax<78){System.out.println("The tax rate on $ " +(IncomeTax*1000)+ " is 12%, and the tax is $ "+ 0.12*IncomeTax*1000 );}
           else if (IncomeTax>=78){System.out.println("The tax rate on $ " +(IncomeTax*1000)+ " is 14%, and the tax is $ "+ 0.14*IncomeTax*1000 );}
       else{System.out.println("You did not enter a positive int");
      }
   }
      else{System.out.println("You did not enter an int");
   return;
      }
}
}
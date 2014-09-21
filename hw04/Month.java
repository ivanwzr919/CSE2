import java.util.Scanner;
public class Month{
   //main method required for every Java program
   public static void main(String[] args){
       Scanner myScanner = new Scanner( System.in ); 
        System.out.print("Enter an int giving the number of the month (1-12)- ");
   if (myScanner.hasNextInt()){
       int Month = myScanner.nextInt();
       if (Month==1 || Month==3 || Month==5|| Month==7|| Month==8|| Month==10|| Month==12)
       {System.out.println("The month has 31 days");
       }
       else if(Month==4 || Month==6 || Month==9|| Month==11){System.out.println("The month has 30 days");
       }
       else if(Month==2){System.out.print("Enter an int giving the year ");
       int Year = myScanner.nextInt();
       if (Year%4==0){System.out.println("The month has 29 days");}
       else {System.out.println("The month has 28 days");}
       }
   else {System.out.println("You did not enter an int between 1 and 12");
   }
}
    else {System.out.println("You did not enter an int");    
    }
}
}

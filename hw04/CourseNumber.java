import java.util.Scanner;
public class CourseNumber{
   //main method required for every Java program
   public static void main(String[] args){
       Scanner myScanner = new Scanner( System.in ); 
        System.out.print("Enter a six digit number giving the course semester- ");
         if (myScanner.hasNextInt()){
       int CourseNumber = myScanner.nextInt();
       if(CourseNumber>=186510&&CourseNumber<=201440){
       int Year=(int)(CourseNumber/100);
       int Semester=CourseNumber-Year*100;
           if(Semester==10 ||Semester==20 ||Semester==30 ||Semester==40 ){
           if (Semester==10) {System.out.println("The course was offered in the Spring semester of "+Year);
           }
           if (Semester==20) {System.out.println("The course was offered in the Summer1 semester of "+Year);
           }
           if (Semester==30) {System.out.println("The course was offered in the Summer2 semester of "+Year);
           }
           if (Semester==40) {System.out.println("The course was offered in the fall semester of "+Year);
           }
         }
       else{System.out.println( Semester+" is not a legitimate semester");
       }
     }
    else{System.out.println("The number was outside the range [186510,201440]");
    }
}
else{System.out.println("You did not enter an int");    
    }
        
}
}
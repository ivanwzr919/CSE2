import java.util.Scanner;
public class TimePadding{
   //main method required for every Java program
   public static void main(String[] args){
       Scanner myScanner = new Scanner( System.in ); 
        System.out.print("Enter the time in seconds: ");
        int seconds=myScanner.nextInt();
        int Hours,Minutes,Seconds;
        Hours=(int)(seconds/3600);
        Minutes=(int)((seconds-Hours*3600)/60);
        Seconds=(seconds-Hours*3600-Minutes*60);
        if (Minutes<10 || Seconds<10){
           if (Minutes<10 && Seconds<10){
           System.out.println("The time is "+Hours+":0"+Minutes+":0"+Seconds);}
           else if (Minutes<10&&Seconds>=10){
           System.out.println("The time is "+Hours+":0"+Minutes+":"+Seconds);}
           else if (Minutes>=10&&Seconds<10){
           System.out.println("The time is "+Hours+":"+Minutes+":0"+Seconds);}
        }
       else{
       System.out.println("The time is "+Hours+":"+Minutes+":"+Seconds);}
   }
}
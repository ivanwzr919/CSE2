import java.util.Scanner;

public class Bicycle{
    public static void main(String args[]){
    Scanner myScanner;
    myScanner = new Scanner( System.in );
    System.out.print ("Enter the number of seconds: ");
    int seconds = myScanner.nextInt();
    System.out.print ("Enter the number of counts: ");
    int counts = myScanner.nextInt();
    double wheelDiameter=27.0,PI=3.14159,feetPerMile=5280,inchesPerFoot=12,secondsPerMinute=60,minutesPerHour=60;
    double distance,milesperhour;
    distance=counts*PI*wheelDiameter/inchesPerFoot/feetPerMile;
    milesperhour=distance/seconds*secondsPerMinute*minutesPerHour;
    System.out.println("The distance was "+distance+" miles and took "+(seconds/secondsPerMinute)+" minutes.");
    System.out.println("The average mph was "+milesperhour);
    }
}
/////////////////////////////////////////////
//Zherui Wang
//Date: 10/12/14
//Professor Brian Chen 
//Class CSE 002-112
//CourseNumber Java Program
//The program is to calculate root of x
import java.util.Scanner;
public class Root{
     public static void main(String[] args){
     Scanner myScanner = new Scanner( System.in ); 
     System.out.print("Enter the x you want to calculate the root- ");
         double x=myScanner.nextDouble();
         double middle=2/(1+x);
         double high=1+x;
         double low=0;
         while((high-low)>(1+x)*0.0000001){
         if (middle*middle>x){high=middle*middle;
         middle=(high+low)/2;}
         else{low=middle*middle;
         middle=(high+low)/2;}
         }
         System.out.println("The square root of x is "+((high+low)/2));
     }
}
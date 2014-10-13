/////////////////////////////////////////////
//Zherui Wang
//Date: 9/30/14
//Professor Brian Chen 
//Class CSE 002-112
//CourseNumber Java Program
//The program is to analyze whether a roulette is easy to win or not
import java.util.Scanner;
public class Roulette{
     public static void main(String[] args){
     Scanner myScanner = new Scanner( System.in ); 
     System.out.print("Enter the times that you want to run the simulation- ");
         int Count=myScanner.nextInt();
         int count=1,totalCount=1,bonus=0,win=0,lose=0;
         while(totalCount<=Count){
         while(count<=100){
             int roulette=(int)(Math.random()*38)+1;
             int R=(int)(Math.random()*38)+1;
             if (R==roulette){bonus=bonus+1;}
             count++;
         }
         if(count>100){
            int totalBonus=bonus*36;
            if(totalBonus>100){win=win+1;count=0;bonus=0;}
            else{lose=lose+1;count=0;bonus=0;}
         }
         totalCount++;}
         System.out.println("win= "+win+" ,lose= "+lose);
         if(win>=(Count/2)){System.out.println("You win.");}
         else{System.out.println("You lose.");}
     }
}
        
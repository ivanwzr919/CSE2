/////////////////////////////////////////////
//Zherui Wang
//Date: 9/30/14
//Professor Brian Chen 
//Class CSE 002-112
//CourseNumber Java Program
//The program that has three boolean variables to each of which the value of true or false is randomly assigned. Then, at random, combine the three variables with random choices of && and || and stores the result.
import java.util.Scanner;
public class Roulette{
     public static void main(String[] args){
     Scanner myScanner = new Scanner( System.in ); 
     System.out.print("Enter the times that you want to run the simulation- ");
         int Count=myScanner.nextInt();
         int count=1,totalCount=1,bonus=0,win=0;
         while(totalCount<=Count){
         while(count<=100){
             int roulette=(int)(Math.random()*38)+1;
             int R=(int)(Math.random()*38)+1;
             if (R==roulette){bonus=bonus+1;}
             count++;
         }
         if(count>100){
            int totalBonus=bonus*36;
            if(totalBonus>100){win=win+1;count=0;}
         }
         totalCount++;}
         if(win>=(Count/2)){System.out.println("You win.");}
         else{System.out.println("You lose.");}
     }
}
        
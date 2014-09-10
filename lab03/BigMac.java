//a program to calculate the cost of buying Big Macs
//
import java.util.Scanner;

public class BigMac{
    //main method required for every Java program
    public static void main(String[] args){
    Scanner myScanner;
    myScanner = new Scanner( System.in );
    System.out.print( "Enter the number of Big Macs(an interger > 0): ");
    int nBigMacs = myScanner.nextInt();
    System.out.print("Enter the cost per Big Macs as"+" a double (in the form xx.xx) : " );
    double bigMac$ = myScanner.nextDouble();
    System.out.print("Enter the percent tax as a whole number(xx): ");
    double taxRate =myScanner.nextDouble();
    taxRate/=100; //user enters percent, but I want proportion
    double cost$;
    int dollars,dimes,pennies; //whole dollar amount of cost dimes, pennies;//for storing digits//to the right of decimal point
    //for the cost$
    cost$=nBigMacs*bigMac$*(1+taxRate);
    //get the whole amount, dropping decimal fraction
    dollars=(int)cost$;
    //get dimes amount
    dimes=(int)(cost$*10)%10;
    pennies=(int)(cost$*100)%10;
    System.out.println("the total cost of "+nBigMacs+" BigMacs, at $"+bigMac$+" per bigMac, with a" + "sales tax of "+(int)(taxRate*100)+ "%, is$"+dollars+'.'+dimes+pennies);
    
    }//end of main method
}//end class

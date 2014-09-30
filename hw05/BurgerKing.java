/////////////////////////////////////////////
//Zherui Wang
//Date: 9/30/14
//Professor Brian Chen 
//Class CSE 002-112
//BurgerKing Java Program
//The purpose of this program is to prompts the user to enter a choice of a burger, a soda, or fries. Then the program prompts the users for details of their choices.
import java.util.Scanner;
public class BurgerKing{
   //main method required for every Java program
   public static void main(String[] args){
   
   Scanner myScanner = new Scanner( System.in );
    System.out.print("Enter a letter to indicate a choice of Burger (B or b)Soda (S or s)Fries (F or f) ");
    String choice= myScanner.next();
    if (choice.length()==1){
    if (choice.charAt(0)=='B'||choice.charAt(0)=='b'||choice.charAt(0)=='S'||choice.charAt(0)=='s'||choice.charAt(0)=='F'||choice.charAt(0)=='f'){
    if (choice.charAt(0)=='B'||choice.charAt(0)=='b'){
       System.out.print("Enter A or a for 'all the fixins' C or c for cheese N or n for none of the above c ");
      String burgerChoice =myScanner.next();
       if (burgerChoice.length()==1){
    if (burgerChoice.charAt(0)=='A'||burgerChoice.charAt(0)=='a'||burgerChoice.charAt(0)=='C'||burgerChoice.charAt(0)=='c'||burgerChoice.charAt(0)=='N'||burgerChoice.charAt(0)=='n'){
      if (burgerChoice.charAt(0)=='A'|| burgerChoice.charAt(0)=='a'){ System.out.println("You ordered a burger with all the fixins");}
      else if (burgerChoice.charAt(0)=='C'|| burgerChoice.charAt(0)=='c'){ System.out.println("You ordered a burger with cheese");}
      else if (burgerChoice.charAt(0)=='N'|| burgerChoice.charAt(0)=='n'){ System.out.println("You ordered a burger");}
    }
    else{System.out.println("You did not enter any of A, a, C, c, N, or n");
    return;}
    }
    else{System.out.println("a single character expected");
   return;}
    }
    if (choice.charAt(0)=='S'||choice.charAt(0)=='s'){
        System.out.print("Do you want Pepsi (p or P),Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
        String Drinks =myScanner.next();
         if (Drinks.length()==1){
        if (Drinks.charAt(0)=='P'||Drinks.charAt(0)=='p'||Drinks.charAt(0)=='C'||Drinks.charAt(0)=='c'||Drinks.charAt(0)=='S'||Drinks.charAt(0)=='s'||Drinks.charAt(0)=='M'||Drinks.charAt(0)=='m'){
         if (Drinks.charAt(0)=='P'||Drinks.charAt(0)=='p'){System.out.println("You ordered a pepsi");}
         else if (Drinks.charAt(0)=='C'||Drinks.charAt(0)=='c'){System.out.println("You ordered a coke");}
         else if (Drinks.charAt(0)=='S'||Drinks.charAt(0)=='s'){System.out.println("You order a spite");}
         else if (Drinks.charAt(0)=='M'||Drinks.charAt(0)=='m'){System.out.println("You order a Mountain Dew");}
        }
      else{System.out.println("You did not enter any of P, p, C, c, S, s, M, or m");
    return;}      
        }
     else{System.out.println("a single character expected");
   return;}
    }
    if (choice.charAt(0)=='F'||choice.charAt(0)=='f'){
        System.out.print("Do you want a large or small order of fries (l,L,s, or S)- ");
         String fries =myScanner.next();
         if (fries.length()==1){
             if (fries.charAt(0)=='L'||fries.charAt(0)=='l'||fries.charAt(0)=='S'||fries.charAt(0)=='s'){
       if (fries.charAt(0)=='L'||fries.charAt(0)=='l'){System.out.println("You ordered large fries");}
        else if (fries.charAt(0)=='S'||fries.charAt(0)=='s'){System.out.println("You ordered small fries");}
    }
    else{System.out.println("You did not enter any of L, l, S, or s");
    return;}
         }
    else{System.out.println("a single character expected");
   return;}
    }
    }
    else{System.out.println("You did not enter any of B, b, S, s, F, or f");
    return;}
   }
   else{System.out.println("a single character expected");
   return;}

}
}

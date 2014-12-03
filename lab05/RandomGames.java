//import
import java.util.Scanner;
//define a class
public class RandomGames {
    //define a method
    public static void main(String[] args) {
        //begin
        Scanner S;
        S= new Scanner( System.in );
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        String Ji=S.next();
        int L=Ji.length();
        if (L==1) {
            char game=Ji.charAt(0);
            int RN, RN1, RN2, number, sum, suit;
            switch (game) {
                case 'R':
                    RN=(int)(Math.random()*38);
                    if (RN==37) {
                        System.out.println("Roulette: 00");
                    }//case of  00
                    else {
                        System.out.println("Roulette: "+RN);
                    }//normal cases
                    break;
                case 'r':
                    RN=(int)(Math.random()*38);
                    if (RN==37) {
                        System.out.println("Roulette: 00");
                    }//case of  00
                    else {
                        System.out.println("Roulette: "+RN);
                    }//normal cases
                    break;
                case 'C':
                    RN1=(int)(Math.random()*6)+1;
                    RN2=(int)(Math.random()*6)+1;
                    sum=RN1+RN2;
                    System.out.println(RN1+"+"+RN2+"="+sum);
                    break;
                case 'c':
                    RN1=(int)(Math.random()*6)+1;
                    RN2=(int)(Math.random()*6)+1;
                    sum=RN1+RN2;
                    System.out.println(RN1+"+"+RN2+"="+sum);
                    break;
                case 'P':
                    suit=(int)(Math.random()*6)+1;
                    switch (suit) {
                        case 1:
                            number=(int)(Math.random()*13)+1;
                            switch (number) {
                               case 1:
                                    System.out.println("Ace of heart");
                                    break;
                                case 11:
                                    System.out.println("Jack of heart");
                                    break;
                                case 12:
                                    System.out.println("Queen of heart");
                                    break;
                                case 13:
                                    System.out.println("King of heart");
                                    break;
                                default:
                                    System.out.println(number+" of heart");
                                    break;
                            }//show the card's number/jack/queen/king
                            break;
                        case 2:
                            number=(int)(Math.random()*13)+1;
                            switch (number) {
                               case 1:
                                    System.out.println("Ace of spade");
                                    break;
                                case 11:
                                    System.out.println("Jack of spade");
                                    break;
                                case 12:
                                    System.out.println("Queen of spade");
                                    break;
                                case 13:
                                    System.out.println("King of spade");
                                    break;
                                default:
                                    System.out.println(number+" of spade");
                                    break;
                            }//show the card's number/jack/queen/king
                            break;
                        case 3:
                            number=(int)(Math.random()*13)+1;
                            switch (number) {
                               case 1:
                                    System.out.println("Ace of  club");
                                    break;
                                case 11:
                                    System.out.println("Jack of club");
                                    break;
                                case 12:
                                    System.out.println("Queen of club");
                                    break;
                                case 13:
                                    System.out.println("King of club");
                                    break;
                                default:
                                    System.out.println(number+" of club");
                                    break;
                            }//show the card's number/jack/queen/king
                            break;
                        case 4:
                            number=(int)(Math.random()*13)+1;
                            switch (number) {
                               case 1:
                                    System.out.println("Ace of diamond");
                                    break;
                                case 11:
                                    System.out.println("Jack of diamond");
                                    break;
                                case 12:
                                    System.out.println("Queen of diamond");
                                    break;
                                case 13:
                                    System.out.println("King of diamond");
                                    break;
                                default:
                                    System.out.println(number+" of diamond");
                                    break;
                            }//show the card's number/jack/queen/king
                            break;
                        case 5:
                            System.out.println("Joker");
                            break;
                        case 6:
                            System.out.println("Big Joker");
                            break;
                        case 7:
                            System.out.println("Little Joker");
                            break;
                    }//end of suit case
                    break;
                case 'p':
                    suit=(int)(Math.random()*6)+1;
                    switch (suit) {
                        case 1:
                            number=(int)(Math.random()*13)+1;
                            switch (number) {
                               case 1:
                                    System.out.println("Ace of heart");
                                    break;
                                case 11:
                                    System.out.println("Jack of heart");
                                    break;
                                case 12:
                                    System.out.println("Queen of heart");
                                    break;
                                case 13:
                                    System.out.println("King of heart");
                                    break;
                                default:
                                    System.out.println(number+" of heart");
                                    break;
                            }//show the card's number/jack/queen/king
                            break;
                        case 2:
                            number=(int)(Math.random()*13)+1;
                            switch (number) {
                               case 1:
                                    System.out.println("Ace of spade");
                                    break;
                                case 11:
                                    System.out.println("Jack of spade");
                                    break;
                                case 12:
                                    System.out.println("Queen of spade");
                                    break;
                                case 13:
                                    System.out.println("King of spade");
                                    break;
                                default:
                                    System.out.println(number+" of spade");
                                    break;
                            }//show the card's number/jack/queen/king
                            break;
                        case 3:
                            number=(int)(Math.random()*13)+1;
                            switch (number) {
                               case 1:
                                    System.out.println("Ace of  club");
                                    break;
                                case 11:
                                    System.out.println("Jack of club");
                                    break;
                                case 12:
                                    System.out.println("Queen of club");
                                    break;
                                case 13:
                                    System.out.println("King of club");
                                    break;
                                default:
                                    System.out.println(number+" of club");
                                    break;
                            }//show the card's number/jack/queen/king
                            break;
                        case 4:
                            number=(int)(Math.random()*13)+1;
                            switch (number) {
                               case 1:
                                    System.out.println("Ace of diamond");
                                    break;
                                case 11:
                                    System.out.println("Jack of diamond");
                                    break;
                                case 12:
                                    System.out.println("Queen of diamond");
                                    break;
                                case 13:
                                    System.out.println("King of diamond");
                                    break;
                                default:
                                    System.out.println(number+" of diamond");
                                    break;
                            }//show the card's number/jack/queen/king
                            break;
                        case 5:
                            System.out.println("Joker");
                            break;
                        case 6:
                            System.out.println("Big Joker");
                            break;
                        case 7:
                            System.out.println("Little Joker");
                            break;
                    }//end of suit case
                    break;
                }//end of switch (game)
        }//end of length test
        else {
            System.out.println("A single character expected");
            return;
        }
    }//end of method 
}//end of class
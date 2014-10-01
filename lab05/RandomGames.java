import java.util.Scanner;
public class RandomGames{
   //main method required for every Java program
   public static void main(String[] args){
   
   Scanner myScanner = new Scanner( System.in );
    System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
    String game= myScanner.next();
    if (game.length()==1){
    if (game=="R"||game=="r"){
       int Roulette=(int)(Math.random()*38);
       if (Roulette==37){
       System.out.println("Roulette: 00");}
    }
       if (game=="C"||game=="c"){
       int Craps1=(int)(Math.random()*6)+1;
       int Craps2=(int)(Math.random()*6)+1;
       System.out.println("Craps:"+Craps1+"+"+Craps2+"="+(Craps1+Craps2));
       }
      if (game=="P"||game=="p"){
       int pick=(int)(Math.random()*54);
       int flower=(pick)%4;
       int number=(int)(pick/4)+1;
       if (pick>=0&&pick<=51&&number<=10){
       int Num1=number; String Flower;
       if (flower==0){Flower="diamonds";}
       else if (flower==1){Flower="spade";}
       else if (flower==2){Flower="club";}
       else if (flower==3){Flower="heart";}
       System.out.println(Num1+" of "+Flower);}
       if (pick>=0&&pick<=51&&number>=10){
       String Flower,Num2;
       if (flower==0){Flower="diamonds";}
       else if (flower==1){Flower="spade";}
       else if (flower==2){Flower="club";}
       else if (flower==3){Flower="heart";} 
       if (number==11){Num2="jack";}
       else if (number==12){Num2="queen";}
       else if (number==13){Num2="king";}
       System.out.println(Num2+" of "+Flower);}
       if(pick==52 || pick==53){
       System.out.println("Joker");}
      }
       else{
        System.out.println("'"+game+"' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
       return;
       }
    }
    else{
       System.out.println("a single character expected");}
   return;
   }
}
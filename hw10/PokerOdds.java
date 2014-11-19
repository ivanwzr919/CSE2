/////////////////////////////////////////////
//Zherui Wang
//Date: 10/28/14
//Professor Brian Chen 
//Class CSE 002-112
//CourseNumber Java Program
//The program is to complete the methods in a poker program
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
   public static void showHands(){
       while(true){
       int[] Hand={-1,-1,-1,-1,-1};
       int[] Deck= new int[52];
       int p=0;
       for(int i=0;i<52;i++){
           Deck[i]=i;
       }
       for(int j=0;j<5;j++){
           while (true){
           p=(int)(Math.random()*52);
           if (p<=52-j){break;}
           }
           Hand[j]=Deck[p];
           Deck[51-j]=-1;
       }
        String clubs="";
           String diamonds="";
           String hearts="";
           String spades="";
       for (int k=0;k<5;k++){
           int F= Hand[k]%4;
           int N= Hand[k]%13;
           String Num="0";
           if(N==0){Num="A";}
           else if(N==1){Num="K";}
           else if(N==2){Num="Q";}
           else if(N==3){Num="J";}
           else if(N==4){Num="10";}
           else if(N==5){Num="9";}
           else if(N==6){Num="8";}
           else if(N==7){Num="7";}
           else if(N==8){Num="6";}
           else if(N==9){Num="5";}
           else if(N==10){Num="4";}
           else if(N==11){Num="3";}
           else if(N==12){Num="2";}
           if(F==0){clubs=clubs+" "+Num;}
           else if(F==1){diamonds=diamonds+" "+Num;}
           else if(F==2){hearts=hearts+" "+Num;}
           else if(F==3){spades=spades+" "+Num;}
       }
           System.out.println("Clubs: "+clubs);
           System.out.println("Diamonds: "+diamonds);
           System.out.println("Hearts: "+hearts);
           System.out.println("Spades: "+spades);
       Scanner myScanner=new Scanner(System.in);
       System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
       String Try=myScanner.next();
       if(Try.equals("Y")||Try.equals("y")){
           }
        else{break;}
       }
   }
    public static void simulateOdds(){
        int[] Fre={0,0,0,0,0,0,0,0,0,0,0,0,0};
        int S=0;
        for(int X=0;X<10000;X++){
            int p=0;
            int C=0;
             int[] Hand={-1,-1,-1,-1,-1};
       int[] Deck= new int[52];
       for(int i=0;i<52;i++){
           Deck[i]=i;
       }
       for(int j=0;j<5;j++){
           while (true){
           p=(int)(Math.random()*52);
           if (p<=52-j){break;}
           }
           Hand[j]=Deck[p];
           Deck[51-j]=-1;
       }
       for (int k=0;k<5;k++){
           for(int q=0;q<k;q++){
               if( (Hand[q]%13)==(Hand[k]%13)){
                   int NN=Hand[k]%13;
                   if(NN>=0&&NN<=12){
                   Fre[NN]+=1;}
                   C=C+1;
               }
           }
       }
       if(C!=1){S=S+1;}
        }
        String labels[]={"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
        for(int g=0;g<13;g++){
            System.out.println(labels[g]+":"+Fre[g]);
         }
         System.out.println(" total not exactly one pair: "+S);
    }
}


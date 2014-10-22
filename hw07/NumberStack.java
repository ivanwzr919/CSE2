/////////////////////////////////////////////
//Zherui Wang
//Date: 10/12/14
//Professor Brian Chen 
//Class CSE 002-112
//CourseNumber Java Program
//The program is to print out number stacks by for,while,do-while loops.
import java.util.Scanner;
public class NumberStack{
     public static void main(String[] args){
     Scanner myScanner = new Scanner( System.in );
     System.out.print("Enter a number between 1 and 9- ");
     int Num=myScanner.nextInt();
     for(int num=1;num<=Num;num++){
     for(int n=1;n<=num;n++){
      for(int line=0;line<num*2-1;line++){
         System.out.print(num);  
        }
      System.out.println(" ");}  
      System.out.println(" ");
      System.out.println(" ");
        }
        
        int x=0,y=0,z=0;
     while(x<Num){
         x++;
         while(y<x){
             y++;
         
         while(z<x*2-1){
             z++;
             System.out.print(x);
         }
          z=0;
           System.out.println(" ");
     }
      System.out.println(" ");
       y=0;
     }
     
     
     int o=0,p=0,q=0;
     do{o++;
      do{p++;
      do{q++; System.out.print(o);
         }
    while(q<o*2-1);
    q=0;
    System.out.println(" ");}
    while(p<o);
    System.out.println(" ");
       p=0;
     }
     while(o<Num);
}
}
  
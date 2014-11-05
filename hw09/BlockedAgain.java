/////////////////////////////////////////////
//Zherui Wang
//Date: 11/4/14
//Professor Brian Chen 
//Class CSE 002-112
//CourseNumber Java Program
//The program is to write 2 methods make blocks.
import java.util.Scanner;
public class BlockedAgain{
public static void main(String []s){
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); 
allBlocks(m);
}
public static int getInt(){
    int out=0;
    while(true){
   	System.out.println("Enter an in int between 1 and 9, inclusive: ");
   	Scanner myScanner=new Scanner(System.in);
    if(myScanner.hasNextInt()){
        int x=myScanner.nextInt();
        if (x>=1&&x<=9){out=x; break;}
        else { System.out.println("You did not enter an int in [1,9]; try again: ");
       }
    }
     else { System.out.println("You did not enter an int; try again: ");
     }
    }
    return out;
    }
    public static void allBlocks(int m){
    for (int i=1;i<=m;i++){
        String line="";
        for(int j=0;j<i;j++){
        line="";
        int l=2*i-1;
         for(int k=0;k<l;k++){
             line= line+"-";
             System.out.print(i);}
             System.out.println(" ");
        }
        System.out.println(line);
        System.out.println(" ");
    }
         }
}

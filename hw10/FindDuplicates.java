/////////////////////////////////////////////
//Zherui Wang
//Date: 10/28/14
//Professor Brian Chen 
//Class CSE 002-112
//CourseNumber Java Program
//The program is to complete the methods in a duplicates finding program
import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  public static boolean hasDups(int[] num){
     int i=0;
     int k=0;
     boolean TF=true;
     for(i=0;i<num.length/2;i++){
         for(int j=0;j<i;j++){
             if (num[j]==num[i]){
                 k=k+1;
             }
         }
     }
     if(k>0){TF=true;}
     else{TF=false;}
     return TF;
  }
  public static boolean exactlyOneDup(int[] num){
     int i=0;
     int k=0;
     boolean TF=true;
     for(i=0;i<num.length/2;i++){
         for(int j=0;j<i;j++){
             if (num[j]==num[i]){
                 k=k+1;
             }
         }
     }
     if(k==1){ TF=true;}
     else{TF=false;}
     return TF;
  }
}


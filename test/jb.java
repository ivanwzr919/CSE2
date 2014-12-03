import java.util.Scanner;
public class jb{
  public static void main(String []arg){
     	Scanner myScanner=new Scanner(System.in);
     	 System.out.print("Enter an int between 1 to 7- ");
     	 if (myScanner.hasNextInt()){
       int Day = myScanner.nextInt();
       if (Day>=1 && Day<=7){ 
         String day=Integer.toHexString(Day);
         day=converToDay(day);
          System.out.println(day);}
     else{System.out.println("Not a day.");
     return;}
     	 }
     else{System.out.println("You did not enter an int.");
     return;}
     
      }
  public static String converToDay(String x){
      String out=" ";
      if(x.equals("1")){
      out="Monday";}
        else if(x.equals("2")){
      out="Tuesday";}
     else if(x.equals("3")){
      out="Wednesday";}
       else if(x.equals("4")){
      out="Thursday";}
      else if(x.equals("5")){
      out="Friday";}
      else if(x.equals("6")){
       out="Saturday";}
      else if(x.equals("7")){
      out="Sunday";}
      return out;
  }
}


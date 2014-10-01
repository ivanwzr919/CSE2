/////////////////////////////////////////////
//Zherui Wang
//Date: 9/30/14
//Professor Brian Chen 
//Class CSE 002-112
//CourseNumber Java Program
//The program that has three boolean variables to each of which the value of true or false is randomly assigned. Then, at random, combine the three variables with random choices of && and || and stores the result. 
import java.util.Scanner;
public class BoolaBoola{
   //main method required for every Java program
   public static void main(String[] args){
       int a,b,c,d,e;
       a=(int)(Math.random()*2);
       b=(int)(Math.random()*2);
       c=(int)(Math.random()*2);
       d=(int)(Math.random()*2);
       e=(int)(Math.random()*2);
       if(a==0){ String A="false";
           if(b==0){ String B="||";
              if(c==0){ String C="false";
                 if(d==0){ String D="||";
                    if(e==0){ String E="false";
                       System.out.print("Does "+A+" "+B+" "+C+" "+D+" "+E+" have the value true(t/T) or false(f/F)?");
                    }
                     else{String E="true";}
                 }
                 else{String D="&&";}
              }
              else{String C="true";}
           }
           else{String B="&&";}
       }
       else{String A="true";
          System.out.print("Does "+A+" "+B+" "+C+" "+D+" "+E+" have the value true(t/T) or false(f/F)?");
       }
       Scanner myScanner = new Scanner( System.in );
       String answer=myScanner.next();
      if(answer=="t"||answer=="f"){ 
       if( answer=="t"){int AA=1;}if (a*c*d=AA){System.out.println("correct");}
        else{System.out.println("Wrong; try again");
      }
      if(answer="f"){int AA=0;if (a*c*d=AA){System.out.println("correct");}
            else{System.out.println("Wrong; try again");
      }
       }
      }
      else{System.out.println("Wrong; try again");
      return;}
}
}

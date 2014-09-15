import java.util.Scanner;

public class Root{
    public static void main(String[] args){
       Scanner myScanner;
       myScanner = new Scanner( System.in );
       System.out.print ("Enter a double, and I print ites cube root- ");
       double x = myScanner.nextDouble();
       double guess1,guess2,guess3,guess4,guess5,guess6;
       guess1=x/3;
       guess2=(2*guess1*guess1*guess1+x)/(3*guess1*guess1);
       guess3=(2*guess2*guess2*guess2+x)/(3*guess2*guess2);
       guess4=(2*guess3*guess3*guess3+x)/(3*guess3*guess3);
       guess5=(2*guess4*guess4*guess4+x)/(3*guess4*guess4);
       guess6=(2*guess5*guess5*guess5+x)/(3*guess5*guess5);
       double x1;
       x1=guess6*guess6*guess6;
       System.out.println("The cube root is "+guess6+": "+guess6+"*"+guess6+"*"+guess6+"="+x1 );
    }
}
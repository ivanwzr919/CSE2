import java.util.Scanner;

public class FourDigits{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print("Enter a double and I display the four digits to the right of the decimal points- ");
        double X = myScanner.nextDouble();
        double X1,X2,X3,X4,X5;
        int Digits1,Digits2,Digits3,Digits4;
        X1=((int)X*10000)/10000;
        X2=10*(X-X1);
        Digits1=(int)X2;
        X3=(int)(10*X);
        Digits2=(int)(10*(X*10-X3));
        X4=(int)(100*X);
        Digits3=(int)(10*(100*X-X4));
        X5=(int)(1000*X);
        Digits4=(int)(10*(1000*X-X5));
        System.out.println("The four digits are: "+Digits1+Digits2+Digits3+Digits4);
    }
}
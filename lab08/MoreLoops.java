/////////////////////////////////////////////
//Zherui Wang
//Date: 11/4/14
//Professor Brian Chen 
//Class CSE 002-112
//MoreLoop Java Program
//The program is to rewrite 4 loops into different types.
import java.util.Scanner;
public class MoreLoops{
	public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int n=0;

    System.out.print("Enter an int- ");
    do{
    	if(!scan.hasNextInt()){
    	System.out.print("You did not enter an int; try again- ");}
    }while(!scan.hasNextInt());
    //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
    //DO-WHILE LOOP
    n=scan.nextInt();
    int j=0;
    int k=0;
    while(j<n && j<40){
    	while(k<j+1){
   	 System.out.print('*');
   	      k=k+1;
    	}
    	System.out.println();
    	j=j+1;
    	k=0;
    }
    
    //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH
    //WHILE STATEMENTS
        k=4;

    while(k<=4){
    	System.out.println("k="+k);
    	k++;
    }
    	//COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
    //WITH A WHILE LOOP
    	for(int count=0;count<=10;count++){
    	if(n==1||n==2||n==3||n==4||n==5){
    	if(n==1){};
        if(n==2){System.out.print("Case 2 ");}
    	else if(n==3){ break;}
    	else if(n==4){System.out.println("Case 4");}
    	else if(n==5){System.out.println("Case 5");}
    	}
    	else{System.out.println(n + " is > 5 or <1");
        }
    }
    //COMMENT OUT THE ABOVE 21 LINES AND REWRITE THE CODE USING
    // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
    //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G.,
    //   -5, 1, 20, 5, ETC.
    //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY
    //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
	}
}


 	 

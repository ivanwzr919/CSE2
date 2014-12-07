/////////////////////////////////////////////
//Zherui Wang
//Date: 6/12/14
//Professor Brian Chen 
//Class CSE 002-112
//CourseNumber Java Program
//The program is to analyze a had of cards.
import java.util.Scanner;
//main class
	public class PokerHands{
		static int h[];
		static String[] c = {"A","K","Q","J","10","9","8","7","6","5","4","3","2"}; //array to keep track of rank of cards
		static int[] Fre;
		static int[] Occ;
//main method
	public static void main(String args[]){
		h = new int[5]; 
	
		int suite =0,card=0;
		String Suite,Card; 
		Scanner input = new Scanner(System.in);
		boolean A = true;
		
		while(A){
			Fre = new int[4];
			Occ = new int[13];
			
			for(int i=0;i<5;i++){
				System.out.print("Enter the suite : 'c', 'd', 'h' or 's' -");
				
				boolean B = false;
				
				while(!B){
					Suite= input.next();
					switch(Suite){
						case "c" : 	{
										suite = 0;
										B = true;
									}
						break;
						case "d" : 	{
										suite = 13;
										B = true;
									}
						break;
						case "h" : 	{
										suite = 26;
										B = true;
									}
						break;
						case "s" : 	{
										suite = 39;
										B = true;
									}
						break;
						default : 	{
										System.out.println("You did not enter a valid response");
										System.out.print("Enter the suite : 'c', 'd', 'h' or 's' -");
									}
					}
					if(B){
						Fre[suite/13]++; 
					}		
				}
				
				System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
				boolean C = false;
				
				while(!C){
					C = true;
					Card = input.next();
					switch(Card){
						case "a" : card = 0; 
						break;
						case "A" : card = 0; 
						break;
						case "k" : card = 1; 
						break;
						case "K" : card = 1; 
						break;
						case "q" : card = 2; 
						break;
						case "Q" : card = 2; 
						break;
						case "j" : card = 3; 
						break;
						case "J" : card = 3; 
						break;
						case "10" : card = 4; 
						break;
						case "9" : card = 5; 
						break;
						case "8" : card = 6; 
						break;
						case "7" : card = 7; 
						break;
						case "6" : card = 8; 
						break;
						case "5" : card = 9; 
						break;
						case "4" : card = 10; 
						break;
						case "3" : card = 11; 
						break;
						case "2" : card = 12;
						break;
						default : 	{
										C = false;
										System.out.println("There is no such card.");
										System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
									}
					}
					boolean D = false;
					for(int j=0;j<i;j++){
						if((suite+card) == h[j]){
							D = true;
						}
					}
					if(!D){
						h[i] = suite+card;
						Occ[(suite+card)%13]+=1; }
						else{
						System.out.println("You already entered that card");
						i--;
					}
				}
				
			}
			System.out.println();
			Hand(h); 
			System.out.println();
			HandRank();
			
			System.out.print("Enter 'y' or 'Y' to enter a(nother) hand-");
			String response = input.next();
			A = (response.equals("y") || response.equals("Y"));
		}
				
	}
	
	public static void Hand(int hand[]){
		String S[]={"Clubs:	", "Diamonds: ", "Hearts:   ","Spades:   "};
		String Num[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
		String out="";
		for(int s=0;s<4;s++){
			out+=S[s];
			for(int rank=0;rank<13;rank++)
				for(int card=0;card<5;card++)
					if(hand[card]/13==s && hand[card]%13==rank)
										out+=Num[rank];
			out+='\n';
		}
		System.out.println(out);
	}
	

	public static void HandRank(){
		for(int a : Fre){
			System.out.print(a+",");
		}
		System.out.println();
		for(int a : Occ){
			System.out.print(a+",");
		}
		System.out.println();
		String out;
		if(Sum(Fre)==5 && Value(Fre,0)==3){
			out = "Flush";
			if(Value(Occ,0)==8 && Successive(Occ,1)==5){
				if(h[0]%13==0){
					out = "Royal "+out;
				}else{
					out = "Straight "+out;
				}
			}
		}else{
			if(Value(Occ,0)==11 && Value(Occ,4)==1){
				out = "Four of a Kind";
			}else if(Value(Occ,0)==11 && Value(Occ,2)==1){
				out = "Full House";
			}else if(Value(Occ,0)==8 && Successive(Occ,1)==5){
				out = "Straight";
			}else if(Value(Occ,2)==2){
				out = "Two Pair";
			}else if(Value(Occ,2)==1){
				out = "One Pair";
			}else{
				out = "High Card";
			}
		}
		System.out.println("This is a "+out);
	}
	
	
	public static int Sum(int array[]){
		int total=0;
		for(int i=0;i<array.length;i++){
			total+=array[i];
		}
		return total;
	}

	public static int Value(int[] array,int value){
		int count=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==value){
				count++;
			}
		}
		return count;
	}
	

	public static int Successive(int[] values, int key){
		int tempCount=0;
		int maxCount=0;
		
		for(int i=0;i<values.length;i++){
			if(values[i]==key){
				tempCount++;
				if(tempCount>maxCount){
					maxCount=tempCount;
				}
			}else{
				tempCount=0;
			}
		}
		return maxCount;
	}
}//end of main class
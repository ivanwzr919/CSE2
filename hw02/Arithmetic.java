public class Arithmetic{

  public static void main(String[] args){
  
  //input
  //Numbers of pairs of socks 
  int nSocks=3;
  //Cost per pair of socks
  //('$'is part of the variable name)
  double sockCost$=2.58;
  
  //Numbers of drinking glasses
  int nGlasses=6;
  //cost per glass
  double glassCost$=2.29;
  
  //Numbers of boxes of envelopes
  int nEnvelope=1;
  //cost per box of envelopes
  double envelopeCost$=3.25;
  double taxPercent=0.06;
  
  //total cost of socks before tax
  double totalSockCost$=nSocks*sockCost$;
  //tax for the socks
  double taxForSock$=taxPercent*totalSockCost$;
  
  //total cost of glasses before tax
  double totalGlassCost$=nGlasses*glassCost$;
  //tax for the glasses
  double taxForGlass$=taxPercent*totalGlassCost$;
  
  //total cost of boxes of envelopes
  double totalEnvelopeCost$=nEnvelope*envelopeCost$;
  //tax for the boxs of envelopes
  double taxForEnvelope$=taxPercent*totalEnvelopeCost$;
  
  //total cost of purchases before tax
  double totalPurchaseCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
  
  //the total tax for the purchases
  double taxForPurchase$=taxForSock$+taxForGlass$+taxForEnvelope$;
  //actually paid for the transaction
  double actuallyPaid$=totalPurchaseCost$+taxForPurchase$;
  
  //output
  System.out.println("Cost of socks is "+totalSockCost$+"$ and tax for them is "+taxForSock$+"$.");
  System.out.println("Cost of glasses is "+totalGlassCost$+"$ and tax for them is "+taxForGlass$+"$.");
  System.out.println("Cost of envelopes is "+totalEnvelopeCost$+"$ and tax for them is "+taxForEnvelope$+"$.");
  System.out.println("Cost of purchases is "+totalPurchaseCost$+"$.");
  System.out.println("Actually paid is "+actuallyPaid$+"$.");
  
  }//end of main method
}//end class  
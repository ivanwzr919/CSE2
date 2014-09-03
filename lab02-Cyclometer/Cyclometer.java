//the program is for calculating the distance and mitutes of a cycling trip
public class Cyclometer {
    //main method required for every java program
    public static void main(String[] args){
//our input data
    int secsTrip1=480; //trip1 time
    int secsTrip2=3220; //trip2 time
    int countsTrip1=1561; //trip1 counts
    int countsTrip2=9037; //trip2 counts
//our intermediate variables and output data
    double wheelDiameter=27.0,// wheel diameter
    PI=3.14159,// pi
    feetperMile=5280, //change miles to feet
    inchesPerFoot=12, //change feet to inches
    secondsPerMinute=60; //change minutes to seconds
    double distanceTrip1, distanceTrip2,totalDistance; //output data
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts. ");
    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts. ");
//run the calculations; store the values
    distanceTrip1=countsTrip1*wheelDiameter*PI;
//above give distance in inches
//(for each count, a rotation of the wheel travels the diameter in inches time PI)
    distanceTrip1/=inchesPerFoot*feetperMile; //give distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetperMile;
    totalDistance=distanceTrip1+distanceTrip2;
//print out the output data
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
  }//end of main method
}//end class




public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  public static boolean equals(double [] x, double [] y){
      boolean out=true;
      int a=x.length;
      int b=y.length;
      while(true){
      if(a!=b){out=false; break;}
      for(int j=0;j<a;j++){
          if (x[j]!=y[j]){
              out=false; break;
          }
      }
      break;
      }
      return out;
  }
  public static double[] addArrays(double [] x, double [] y){
      int a=x.length;
      int b=y.length;
      int c=0;
          if(a<b){c=b;}
          if(a>b){c=a;}
          if(a==b){c=a;}
          double z[]=new double[c];
      if(a!=b){ 
          if(a<b){
           double x2[]=new double[b];
          for(int j=0;j<a;j++){
              x2[j]=x[j];
          }
              for(int j=a;j<b;j++){
              x2[j]=0;}
      for(int j=0;j<c;j++){
          z[j]=x2[j]+y[j];
      }
          }
          if(a>b){
              double y2[]=new double[a];
          for(int j=0;j<b;j++){
              y2[j]=y[j];
          }
              for(int j=b;j<a;j++){
              y2[j]=0;}
      for(int j=0;j<c;j++){
          z[j]=x[j]+y2[j];
      }
          }
      }
      if(a==b){
      for(int j=0;j<c;j++){
          z[j]=x[j]+y[j];
      } 
    }
      return z;
  }
}

//output:

//OUTPUT: {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
//+ {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
//   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
//{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
//  + {2.3, 13.0, 14.0}
//   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
//It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
//  == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
//It is false that {2.3, 13.0, 14.0}
//   == {2.3, 13.0, 14.0, 12.0}
//It is false that {2.3, 12.0, 14.0}
//   == {2.3, 13.0, 14.0}

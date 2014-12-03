public class MethodCalls{
	public static int addDigit(int a,int b)
	{
		int c=0;
		if((a<0 && b<0)||(a>=0 && b>=0))
		{
			if(a<0 && b<0)
			{
			a=(-1*a);
			b=(-1*b);
			}
			c=Integer.parseInt(b+""+a);
		}
		if((a<0 && b>=0)||(a>=0 && b<0))
		{
			if(a<0 && b>=0)
			{
			a=(-1*a);
			
			}
			if(a>=0 && b<0)
			{
				b=(-1*b);
			}
			c=Integer.parseInt("-"+b+""+a);
		}
		
		return c;
		
//		int m=1*b;
//		if(a<0)
//		{
//			for(int i=0;i<b-1;i++)
//			{
//				m=m*10;
//				
//			}
//		c=(-1*(m+(-1*a)));
//		}
//		else
//		{
//		for(int i=0;i<b;i++)
//		{
//			m=m*10;
//			c=m+a;
//		}
//		}
		 
		
	}
	
	public static int join(int a,int b)
	{
		int c=0;
		
		if((a>=0 && b>=0) || (a<0 && b<0) )
		{
			if((a<0 && b<0))
			{
				a=(-1*a);
				b=(-1*b);
			}
		c= Integer.parseInt(a+""+b);
		}
		if((a<0 && b>=0) ||(a>=0 && b<0))
		{
			if(a<0 && b>=0)
			{
				a=(-1*a);
			}
			if(a>=0 && b<0)
			{
				b=(-1*b);
			}
			
		c= Integer.parseInt("-"+a+""+b);
		}
		return c;
	}
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
       c=join(a,b);
       System.out.println("Join "+a+" to "+b+" to get "+c);
      System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
     System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
}  
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/

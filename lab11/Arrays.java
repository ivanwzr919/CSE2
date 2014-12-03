import java.util.Scanner;

public class Arrays{

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			int low=0;
			int high=0,sum=0,j=0;
			
			int ar[]=new int[10];
			int revar[]=new int[10];
			System.out.println("Enter 10 ints-");
			
			// Assign values to array
			
			for(int i=0;i<10;i++)
			{
				ar[i]=sc.nextInt();
				low=ar[0];
				high=ar[0];
				
				
			}
			
			// Find highest and lowest value
			
			for(int i=9;i>=0;i--)
			{
				//lowest
				if(ar[i]<low)
				{
					low=ar[i];
				}
				//highest
			if(ar[i]>high)
			{
				high=ar[i];
			}
			
			// Sum of array
			
			sum=sum+ar[i];
			
			// put array in reverse order
			
			revar[j]=ar[i];
			j++;
			
			}
	System.out.println("The lowest entry is"+" "+low);
	System.out.println("The highest entry is"+" "+high);
	System.out.println("The sum is"+" "+sum);
	
	// Print two array in two columns
	
	for(int i=0;i<10;i++)
	{
		if(ar[i]>=10 || ar[i]<0)
		System.out.println("  "+ar[i]+"   "+revar[i]);
		if(ar[i]<10 && ar[i]>=0)
		System.out.println("   "+ar[i]+"   "+revar[i]);
		
	}
			
	}
}
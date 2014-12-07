/////////////////////////////////////////////
//Zherui Wang
//Date: 6/12/14
//Professor Brian Chen 
//Class CSE 002-112
//CourseNumber Java Program
//The program is to sort a 3d matrix.
import java.util.Random;

//public class
public class MatrixSorter{
	//main method
	public static void main(String args[]){
		int[][][] mat3d;
		mat3d = buildMat3d();
		show(mat3d);
		System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d));
		System.out.println("After sorting the 3rd matrix we get");
		sort(mat3d[2]);
		show(mat3d);
	}
	
	public static int[][][] buildMat3d(){
		int[][][] mat3d = new int[3][][];
		for(int s=0; s<mat3d.length;s++){
			mat3d[s] = new int[3+(2*s)][];
		}
		for(int s=0;s<mat3d.length;s++){
			for(int j=0;j<mat3d[s].length;j++){
				mat3d[s][j] = new int[s+j+1];
			}
		}
		
		Random randomGenarator = new Random();
		for(int s=0;s<mat3d.length;s++){
			for(int j=0;j<mat3d[s].length;j++){
				for(int i=0;i<mat3d[s][j].length;i++){
					mat3d[s][j][i] = randomGenarator.nextInt(98)+1;
				}
			}
		}
		return mat3d;
	}
	
	public static void show(int[][][] mat3d){
		for(int s=0;s<mat3d.length;s++){
			System.out.println("---------------------Slab "+(s+1));
			for(int j=0;j<mat3d[s].length;j++){
				for(int i=0;i<mat3d[s][j].length;i++){
					System.out.print(mat3d[s][j][i]+" ");
				}
				System.out.println("\b");
			}
		}
		System.out.println("------------------------");
	}
	
	public static int findMin(int[][][] mat3d){
		int min = mat3d[0][0][0];
		for(int s=0;s<mat3d.length;s++){
			for(int j=0;j<mat3d[s].length;j++){
				for(int i=0;i<mat3d[s][j].length;i++){
					if(mat3d[s][j][i]<min){
						min=mat3d[s][j][i];
					}
				}
			}
		}
		return min;
	}
	
	public static void sort(int values[][]){
		for(int i=0;i<values.length;i++){
			Sort(values[i]);
		}
		
		int j;					
		int k;               
		int i; 

		for (j = 1; j < values.length; j++){    
           k = values[j][0];
			for(i= j-1; (i >= 0) && (values[i][0] > k); i--){   // Smaller values are moving up
               int[] temp = values[i+1];
               values[i+1] = values[i];
               values[i] = temp;
			}
			values[i+1][0] = k;    
		}
	}
	
	private static void Sort(int[] Array){
		int temp;
		for(int i=0;i<Array.length;i++){
			for(int j=i+1;j<Array.length;j++){
				if(Array[i]>Array[j]){
					temp = Array[i];
					Array[i]=Array[j];
					Array[j]=temp;
				}
			}
		}
	}
	
}//end of main class
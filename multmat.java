package multimax;
import java.util.Random;
public class multimax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = new int[3][3];
	    int[][] mat2 = new int[3][3];
	    int[][] result = new int[3][3];
	 
	    	
			//Creating the object of random class
	        Random rand = new Random();
	        //Filling first matrix with random values
	        for (int i = 0; i < mat.length; i++) {
	            for (int j = 0; j < mat[i].length; j++) {
	                mat[i][j]=rand.nextInt(9);
	            }
	        }
	        
	        //Filling second matrix with random values
	        for (int i = 0; i < mat2.length; i++) {
	            for (int j = 0; j < mat2[i].length; j++) {
	                mat2[i][j]=rand.nextInt(9);
	            }
	        }
	        int i,j,k;
	       
	        for(i=0;i<mat.length;i++)
	        {
	        	for(j=0;j<mat.length;j++)
	        	{
	        		result[i][j]=0;
	        		for(k=0;k<mat.length;k++)
	        		{
	        			result[i][j]+=mat[i][k]*mat2[k][j];
	        		}
	        	}
	        }
	       
	        for (i = 0; i < mat.length; i++) {
	            for (j = 0; j < mat[i].length; j++) {
	            	System.out.print(mat[i][j]+" ");
	               
	            }
	            System.out.println();
	        }System.out.println();
	        for (i = 0; i < mat.length; i++) {
	            for (j = 0; j < mat[i].length; j++) {
	            	System.out.print(mat2[i][j]+" ");
	               
	            }
	            System.out.println();
	        }System.out.println();
	        for (i = 0; i < mat.length; i++) {
	            for ( j = 0; j < mat[i].length; j++) {
	            	System.out.print(result[i][j]+" ");
	               
	            }
	            System.out.println();
	        }

	
	}
}

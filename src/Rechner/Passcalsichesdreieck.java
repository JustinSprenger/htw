package Rechner;
import java.util.Scanner;
public class Passcalsichesdreieck {

	public static void main(String[] args) {
		int tiefe = 20;
	
	        int[][] dreieck = new int[tiefe][tiefe];
	        int zeile=1;
	        for(int i=0;i<tiefe;i++)
	        {
	          for(int j=0;j<zeile;j++)
	            {
	                if(j==0 || j== (zeile-1))
	                {
	                    dreieck[i][j]=1;
	                }
	                else
	                    {
	                        dreieck[i][j]=dreieck[i-1][j-1]+dreieck[i-1][j];
	                    }
	                System.out.print(dreieck[i][j]+" ");
	            } 
	          zeile++;
	          System.out.println("");
	        }
	        		
	}

}

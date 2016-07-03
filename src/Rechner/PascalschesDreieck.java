package Rechner;

public class PascalschesDreieck {
	 private int tiefe;
	    
	    public PascalschesDreieck(int tiefe)
	    {
	        this.tiefe = tiefe;
	    }
	    
	    public void print()
	    {
	        int[][] dreieck = new int[this.tiefe][this.tiefe];
	        int zeile=1;
	        for(int i=0;i<this.tiefe;i++)
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

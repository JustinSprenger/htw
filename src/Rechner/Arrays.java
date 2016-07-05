package Rechner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] zahl = new double[100];
		
		for(int i=0;i<zahl.length;i++)
		{
			zahl[i] = i+1;
			System.out.println(zahl[i]);
		}
	}

}

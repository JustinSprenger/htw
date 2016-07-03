package Bank;
import java.util.Scanner;
public class Kredit {
	private double schulden, neuschulden, zinsen, tilgung, gebuehren, gesamt, zinswert, tilgungswert, ztsatz;
	Scanner sc = new Scanner(System.in);
	
	Kredit()
	{
	schulden = 0;
	neuschulden = 0;
	zinsen = 0;
	tilgung = 0;
	gebuehren = 500;
	gesamt = 0;
	zinswert = 0;
	tilgungswert = 0;
	ztsatz = 0;
	}
	
	public void setwerte()
	{
		System.out.println("Bitte geben Sie die aktuellen Schulden ein:         ");
		this.schulden = sc.nextDouble();
		System.out.println("Bitte geben Sie den aktuellen Zinssatz ein:         ");
		this.zinsen = sc.nextDouble();
		System.out.println("Bitte geben Sie die aktuelle Tilgung ein:           ");
		this.tilgung = sc.nextDouble();
	}
	
	public void showerte()
	{
		System.out.println("Dies sind die eingegebenen Werte:");
		System.out.println("Schulden:    " + schulden + "€");
		System.out.println("Zinsen:      " + zinsen + "%");
		System.out.println("Tilgung:     " + tilgung + "%");
		System.out.println("");
		System.out.println("Gebühren:    " + gebuehren + "€");
	}
	
	public double brechnen()
	{
		schulden = schulden + gebuehren;
		zinswert = schulden / 100 * zinsen;
		zinswert = zinswert / 12;
		tilgungswert = schulden/100 * tilgung;
		tilgungswert = tilgungswert / 12;
		
		for(int i=0;i<61;i++)
		{
			ztsatz = ztsatz - zinswert;
			zinswert = schulden / 100 * zinsen;
			zinswert = zinswert / 12;
			
			neuschulden = schulden - tilgungswert;
			
		}
		return gesamt;
	}
	
	
	
}

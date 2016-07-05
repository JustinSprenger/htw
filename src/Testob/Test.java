package Testob;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Testklasse t1 = new Testklasse();
		String vorname, nachname;
		int alter;
		
		System.out.println("Bitte geben Sie Ihren Vornamen ein:     ");
		vorname = sc.next();
		t1.setVorname(vorname);
		System.out.println("Bitte geben Sie Ihren Nachnamen ein     ");
		nachname = sc.next();
		t1.setNachname(nachname);
		System.out.println("Bitte geben Sie Ihr Alter ein:          ");
		alter = sc.nextInt();
		t1.setAlter(alter);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		t1.ausgabe();
		
		
	}

}

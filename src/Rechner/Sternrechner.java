package Rechner;

import java.util.Scanner;

public class Sternrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int jahr = 0 , monat = 0 , tag = 0 , stunde = 0 , minute = 0;
		double sternzeit = 0;
		double sternstunden = 0;
		boolean wieder = true;
		
		do
		{
		
			System.out.print("Bitte geben Sie den Tag an:		");
			tag = sc.nextInt();
			System.out.print("Bitte geben Sie den Monat an:		");
			monat = sc.nextInt();
			System.out.print("Bitte geben Sie das Jahr an:		");
			jahr = sc.nextInt();
			System.out.print("Bitte geben Sie die Stunden an:		");
			stunde = sc.nextInt();
			System.out.print("Bitte geben Sie die Minuten an:		");
			minute = sc.nextInt();
			System.out.println("");
			
			sternzeit = (jahr - 1111)* 365;	
			
			sternzeit = sternzeit + tag;
			
			for(int z = 1;z < monat;z++)
			{
				switch(monat)
				{
				case 1:
					sternzeit = sternzeit + 31;
					break;
				case 2:
					sternzeit = sternzeit + 28;
					break;
				case 3:
					sternzeit = sternzeit + 31;
					break;
				case 4:
					sternzeit = sternzeit + 30;
					break;
				case 5:
					sternzeit = sternzeit + 31;
					break;
				case 6:
					sternzeit = sternzeit + 30;
					break;
				case 7:
					sternzeit = sternzeit + 31;
					break;
				case 8:
					sternzeit = sternzeit + 31;
					break;
				case 9:
					sternzeit = sternzeit + 30;
					break;
				case 10:
					sternzeit = sternzeit + 31;
					break;
				case 11:
					sternzeit = sternzeit + 30;
					break;
				case 12:
					sternzeit = sternzeit + 31;
					break;
				default:
					
					break;
				}
			}
			sternstunden = stunde*1000 / 24;
			sternstunden = sternstunden / 1000;
			sternstunden = sternstunden + (minute / 60);
			
			System.out.println(sternstunden);
			System.out.println(sternzeit);
			
			sternzeit = sternzeit + sternstunden;
			
			System.out.println(sternzeit);
			System.out.println("");
			
			System.out.println("Möchten Sie wiederholen?	");
			wieder = sc.nextBoolean();
			System.out.println("");
			
		}while(wieder == true);
		
	}

}

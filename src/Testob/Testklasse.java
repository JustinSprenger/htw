package Testob;

public class Testklasse {
	
	public String vname;
	public String nname;
	public int alter;
	
	Testklasse(){
		vname = "";
		nname = "";
		alter = 0;
	}
	
	public void setVorname(String v){
		this.vname = v;	
	}
	
	public void setNachname(String n){
		this.nname = n;	
	}
	
	public void setAlter(int a){
		this.alter = a;	
	}
	
	public String getVorname(){
		return this.vname;
	}
	
	public String getNachname(){
		return this.nname;
	}
	
	public int getAlter(){
		return this.alter;
	}
	
	public void ausgabe(){
		System.out.println("Vorname:       " + this.vname);
		System.out.println("Nachname:      " + this.nname);
		System.out.println("Alter:         " + this.alter);
	}
	
}

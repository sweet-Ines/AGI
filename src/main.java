import java.io.IOException;
import java.util.Scanner;

public class main {

	static int breite;
	static int laenge;
	static boolean eingabe= false;

	
	public static void main(String[] args) throws IOException {

		while(eingabe==false){
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("Geben Sie die Breite der Matrix an:");
			breite=scan.nextInt();
			eingabe=true;
		}
		catch( Exception ex){
			System.out.println("Es duerfen nur Zahlen angegeben werden.");
			
		}
		}
		
		eingabe=false;
		
		while(eingabe==false){
			try{
				Scanner scan = new Scanner(System.in);
				System.out.println("Geben Sie die Laenge der Matrix an:");
				laenge=scan.nextInt();
				eingabe=true;
			}
			catch( Exception ex){
				System.out.println("Es duerfen nur Zahlen angegeben werden.");
				
			}
			}
		System.out.println("Groesse der Matrix erstellt.");
		Spielfeld s = new Spielfeld(breite, laenge);
	}
	
	
	
//	public static void abfrage(){
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Geben Sie die Breite der Matrix an:");
//		breite=scan.nextInt();
//		
//		System.out.println("Geben Sie die Laenge der Matrix an:");
//		laenge=scan.nextInt();
//	}

}

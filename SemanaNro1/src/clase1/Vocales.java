package clase1;
import java.util.Scanner;
public class Vocales {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String Palabra;
		int Consonante = 0;
		Scanner scanner = new Scanner (System.in);
			System.out.println("Ingrese Una Frase");
				Palabra = scanner.next();		
for(int x=0; x<Palabra.length(); x++) {
		if ((Palabra.charAt(x)=='a') || (Palabra.charAt(x)=='A') || 
			(Palabra.charAt(x)=='e') || (Palabra.charAt(x)=='E') || 
			(Palabra.charAt(x)=='i') || (Palabra.charAt(x)=='I') || 
			(Palabra.charAt(x)=='o') || (Palabra.charAt(x)=='O') || 
			(Palabra.charAt(x)=='u') || (Palabra.charAt(x)=='U')){ 
		Consonante++;
		}
	}			
System.out.println("La Palabra " + Palabra + " Contiene " + Consonante + " Vocales");						
	}
}

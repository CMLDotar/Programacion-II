package clase1;
import java.util.Scanner;
public class SumaDeNumeros {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int primerNumero, segundoNumero, resultado;
			Scanner scanner = new Scanner (System.in);
				System.out.println("Ingrese un N�mero");
					primerNumero = scanner.nextInt();
				System.out.println("Ingrese Otro N�mero");
					segundoNumero = scanner.nextInt();	
						resultado = primerNumero + segundoNumero;
				System.out.println("La Suma de "+ primerNumero +" + "+ segundoNumero + " es: "+ resultado);	
	}
}

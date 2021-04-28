package clase1;
import java.util.Scanner;
public class SiempreDeMenorAMayor {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int primerNumero, segundoNumero;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese un Número");
			primerNumero = scanner.nextInt();
		System.out.println("Ingrese Otro Número");
			segundoNumero = scanner.nextInt();
	if (segundoNumero > primerNumero) {
		System.out.println("Los Enteros Entre "+ primerNumero + " y "+ segundoNumero + " Son:");
			for (int i = primerNumero; i <= segundoNumero ; i++) {
				System.out.println(i);
			}			
				}else {
					System.out.println("Los Enteros Entre "+ primerNumero + " y "+ segundoNumero + " Son:");
					for (int i = segundoNumero; i <= primerNumero ; i++) {
						System.out.println(i);
					}
		}
	}
}
	
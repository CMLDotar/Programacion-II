package clase1;
import java.util.Scanner;
public class EnterosEntreDosNumeros {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int primerNumero, segundoNumero;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese un Número");
			primerNumero = scanner.nextInt();
		System.out.println("Ingrese Otro Número, de Mayor Valor");
			segundoNumero = scanner.nextInt();
	if (segundoNumero > primerNumero) {
		System.out.println("Los Enteros Entre "+ primerNumero + " y "+ segundoNumero + " Son:");
			for (int i = primerNumero; i <= segundoNumero ; i++) {
				System.out.println(i);
			}			
				}else {
				System.out.println("ERROR, el Segundo Número Ingresado Debe Ser de Mayor Valor Que el Primer Número");
		}
	}
}
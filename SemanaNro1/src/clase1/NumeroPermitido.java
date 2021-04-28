package clase1;
import java.util.Scanner;
public class NumeroPermitido {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int primerNumero, segundoNumero, multiplo, resta;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese un Número");
			primerNumero = scanner.nextInt();
		System.out.println("Ingrese Otro Número");
			segundoNumero = scanner.nextInt();
		System.out.println("Ingresar el Multiplo");
			multiplo = scanner.nextInt();	
			resta = primerNumero - segundoNumero ;
if(multiplo < resta) {			
	if (segundoNumero > primerNumero) {
		System.out.println("Los Enteros Entre "+ primerNumero + " y "+ segundoNumero + " Sin Multiplos de "+ multiplo +" Son:");	
			for (int i = primerNumero; i <= segundoNumero ; i++) {
					if (i%multiplo==0) {					
					}else {
						System.out.println(i);
					}				
			}			
				}else {
					System.out.println("Los Enteros Entre "+ primerNumero + " y "+ segundoNumero + " Sin Multiplos de "+ multiplo +" Son:");
					for (int i = segundoNumero; i <= primerNumero ; i++) {
							if (i%multiplo==0) {					
							}else {
								System.out.println(i);
					}
				}
			}
		}else {
			System.out.println(multiplo +" No es un Número Permitido");
		}
	}
}
package clase4;
import java.util.Scanner;
public class CuartoVector {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int valorGuardado [] = new int [5];
	int posicion, valorMostrado;
	for (int noRepetir=0;noRepetir<valorGuardado.length;noRepetir++) {
		System.out.print("Ingrese un Valor a Guardar: ");
		boolean repeat=true;
		valorMostrado=scanner.nextInt();
		for (posicion=0;posicion<valorGuardado.length;posicion++) {
			if (valorMostrado==valorGuardado[posicion]) {
				repeat=false;
			}
		}
		if (repeat==false) {
			System.out.println("Número Repetido. Ingrese Otro Número");
			noRepetir=noRepetir-1;
		}
		valorGuardado[noRepetir]=valorMostrado;		
	}
	System.out.println("Números Sin Repetir: ");
	int noRepetir=0;
	while(noRepetir<valorGuardado.length) {
		System.out.println(valorGuardado[noRepetir]);
		noRepetir++;
		}
	}
}

package clase4;
import java.util.Scanner;
public class SegundoVector {
@SuppressWarnings("resource")
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valorGuardado [] = new int [5];
		int valorMostrado [] = new int [5];
		int posicion;
		for (posicion=0;posicion<4;posicion++) {
			System.out.print("Ingrese un Valor a Guardar: ");
			valorGuardado[posicion]=scanner.nextInt();
			if (valorGuardado[posicion]%7!=0) {
				valorMostrado[posicion]=valorGuardado[posicion];
			}	
		}
		for (posicion=0;posicion<4;posicion++) {
				System.out.println("Posición: "+ posicion +" Valor: "+valorMostrado[posicion]);
		}
	}
}

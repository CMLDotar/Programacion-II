package clase4;
import java.util.Scanner;
public class TercerVector {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valorGuardado [] = new int [5];
		int posicion;
		for (posicion=0;posicion<=4;posicion++) {
			System.out.print("Ingrese un Valor a Guardar: ");
			valorGuardado[posicion]=scanner.nextInt();
		}
		int almacenar=0;
		for (int valorMostrado=0;valorMostrado<=4;valorMostrado++) {
			for (posicion=0;posicion<=3;posicion++) {
				if (valorGuardado[posicion]>valorGuardado[posicion+1]) {
					almacenar = valorGuardado[posicion];
					valorGuardado[posicion]=valorGuardado[posicion+1];
					valorGuardado[posicion+1]=almacenar;
				}
			}
		}
		int ordenar =0;
		System.out.println("Numeros Ordenados de Menor a Mayor: ");
		while(ordenar<=4) {
			System.out.println(valorGuardado[ordenar]);
			ordenar++;
		}
	}

}

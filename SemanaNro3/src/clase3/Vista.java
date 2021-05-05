package clase3;
import java.util.Scanner;
public class Vista {
	public static void mostrarCiudadano(Ciudadano ciudadano) {
		System.out.println(ciudadano.getNombre());
		System.out.println(ciudadano.getApellido());
		}
	public static Ciudadano entregarCiudadano(){
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("====== Bienvenido ======");
			System.out.println("");
			System.out.println("Ingrese un Nombre:");
			String nombre = scanner.next();
			System.out.println("Ingrese un Apellido:");
			String apellido = scanner.next();	
			System.out.println("¡Ciudadano Almacenado!");
			System.out.println("");
			Ciudadano nuevoCiudadano = new Ciudadano(nombre, apellido);
			return nuevoCiudadano;
		}
	}
}

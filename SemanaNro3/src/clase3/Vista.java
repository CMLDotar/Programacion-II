package clase3;
import java.util.Scanner;
public class Vista {
	public static void mostrarPersona(Persona persona) {
		System.out.println(persona.getNombre());
		System.out.println(persona.getApellido());
	}
	public static Persona entregarPersona(){
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese un Nombre");
			String nombre = scanner.next();
			System.out.println("Ingrese un Apellido");
			String apellido = scanner.next();	
			Persona nuevaPersona = new Persona(nombre, apellido);
			return nuevaPersona;
		}
	}

}

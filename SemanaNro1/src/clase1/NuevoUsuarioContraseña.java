package clase1;
import java.util.Scanner;
public class NuevoUsuarioContrase�a {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String Usuario;
		String Contrase�a;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese el Usuario");
			Usuario = scanner.next();
		System.out.println("Ingrese la Contrase�a");
			Contrase�a = scanner.next();
		String UsuarioRegistrado = "Enzo";
		String Contrase�aRegistrada = "4321";
		if (Usuario.equals(UsuarioRegistrado)) {
			if (Contrase�a.equals(Contrase�aRegistrada)) {
				System.out.println("Sesi�n Iniciada");
				System.out.println("Nueva Contrase�a");
				Contrase�aRegistrada = scanner.next();
				System.out.println("Cambio de Contrase�a Exitoso");
			}else {
				System.out.println("La Contrase�a Ingresada es Incorrecta");
			}
		}else {
			System.out.println("El Usuario Ingresado no es Valido");
		}
	}
}
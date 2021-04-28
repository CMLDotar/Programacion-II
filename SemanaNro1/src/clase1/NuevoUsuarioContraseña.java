package clase1;
import java.util.Scanner;
public class NuevoUsuarioContraseña {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String Usuario;
		String Contraseña;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese el Usuario");
			Usuario = scanner.next();
		System.out.println("Ingrese la Contraseña");
			Contraseña = scanner.next();
		String UsuarioRegistrado = "Enzo";
		String ContraseñaRegistrada = "4321";
		if (Usuario.equals(UsuarioRegistrado)) {
			if (Contraseña.equals(ContraseñaRegistrada)) {
				System.out.println("Sesión Iniciada");
				System.out.println("Nueva Contraseña");
				ContraseñaRegistrada = scanner.next();
				System.out.println("Cambio de Contraseña Exitoso");
			}else {
				System.out.println("La Contraseña Ingresada es Incorrecta");
			}
		}else {
			System.out.println("El Usuario Ingresado no es Valido");
		}
	}
}
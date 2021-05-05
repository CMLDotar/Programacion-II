package clase3;
public class Ciudadano {
	private String Nombre, Apellido;
	public Ciudadano(String nombre ,String apellido) {
		this.Nombre = nombre;
		this.Apellido = apellido;
	} 
	public void setNombre(String nombre){
		this.Nombre = nombre;
	}
	public void setApellido(String apellido){
		this.Apellido = apellido;
	}
	public String getNombre(){
		return this.Nombre;
	}
	public String getApellido(){
		return this.Apellido;
	}
	@Override
	public String toString() {
		return "Ciudadano [Apellido = " + Apellido + ", Nombre = " + Nombre + "]";
	}
}

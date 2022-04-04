
/**
 * 
 * Clase Persona es para crear objetos que hacen referencia a personas
 * Nuestras personas s�lo tienen una edad y un nombre
 * 
 * @author Miguel Ovejero
 * @version 1.0
 *
 */

public class Persona {
	private String nombre;
	private int edad;

	/**
	 * Metodo constructor con los par�metros edad (entero) y nombre (String).
	 * @param nombre sin restricci�n.
	 * @param edad es un entero y de momento no controlamos nada,
	 */

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	/**
	 * @param devuelve el nombre (String) del objeto dentro de la clase persona.
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return devuelve el nombre pasado como texto.
	 */

	public int getEdad() {
		return edad;
	}

	/**
	 * Establece la edad pasada como entero.
	 * @param edad es un entero sin restricciones.
	 */

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Metodo que nos permite cambiar la edad (int)
	 * 
	 */
	
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
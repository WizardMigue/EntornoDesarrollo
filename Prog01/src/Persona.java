import java.util.Date;

/**
 * 
 * Clase Persona es para crear objetos que hacen referencia a personas Nuestras
 * personas sólo tienen una edad y un nombre
 * 
 * @author Miguel Ovejero
 * @version 1.0
 *
 */

public class Persona {
	private String nombre;
	private Date fecha_nac;
	private int edad;

	/**
	 * Metodo constructor con los parámetros edad (entero) y nombre (String).
	 * 
	 * @param nombre sin restricción.
	 * @param edad   es un entero y de momento no controlamos nada,
	 */

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fecha_nac = fecha_nac;
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
	 * @return the fecha_nac
	 */
	public Date getFecha_nac() {
		return fecha_nac;
	}

	/**
	 * @param fecha_nac the fecha_nac to set
	 */
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	/**
	 * @return devuelve el nombre pasado como texto.
	 */

	public int getEdad() {
		return edad;
	}

	/**
	 * Establece la edad pasada como entero.
	 * [{@literal<b>hola</b>}
	 * @param edad es un entero sin restricciones.
	 */

	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Metodo que nos permite cambiar la edad (int)
	 */

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}


package modelo;

public abstract class Persona {
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;

    public Persona() {
    }

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }
 
}

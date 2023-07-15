package domain;

/**
 *
 * @author reych
 */
public class ClaseHija extends SuperClase {

    private int edad;

    public ClaseHija(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

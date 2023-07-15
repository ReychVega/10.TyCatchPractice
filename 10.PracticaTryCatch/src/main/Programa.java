package main;

import domain.ClaseHija;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author reych
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ClaseHija> listaObjetos = new ArrayList<>();
        try {
            ingresardatos(listaObjetos);
            mostrardatos(listaObjetos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void ingresardatos(ArrayList<ClaseHija> lista) {
        for (int i = 0; i < 5; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del objeto " + (i + 1)
                    + ":");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del objeto " + (i
                    + 1) + ":"));
            ClaseHija objeto = new ClaseHija(nombre, edad);
            lista.add(objeto);
        }
    }

    public static void mostrardatos(ArrayList<ClaseHija> lista) {
        for (int i = 0; i < lista.size(); i++) {
            ClaseHija objeto = lista.get(i);
            JOptionPane.showMessageDialog(null, "Objeto " + (i + 1) + "\nNombre: "
                    + objeto.getNombre() + "\nEdad: " + objeto.getEdad());
        }
    }

}

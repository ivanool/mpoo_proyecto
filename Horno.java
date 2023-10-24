package proyectocasainte;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Horno extends DispositivosInteligentes {
    // Constructor de la clase Horno
    public Horno(int id, String nombre, boolean encendido) {
        // Llama al constructor de la clase padre (DispositivosInteligentes) para inicializar sus atributos.
        super(id, nombre, encendido);
    }

    @Override
    public void encender() {
        System.out.println("Horno encendido"); // Imprime un mensaje en la consola.
        this.encendido = true;
        // Muestra un mensaje emergente indicando que el horno ha sido encendido.
        JOptionPane.showMessageDialog(null, nombre + " encendido.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, encender);
    }

    @Override
    public void apagar() {
        System.out.println("Horno apagado"); // Imprime un mensaje en la consola.
        this.encendido = false;
        // Muestra un mensaje emergente indicando que el horno ha sido apagado.
        JOptionPane.showMessageDialog(null, nombre + " apagado.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, apagar);
    }
}

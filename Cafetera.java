package proyectocasainte;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Cafetera extends DispositivosInteligentes {
    // Constructor de la clase Cafetera
    public Cafetera(int id, String nombre, boolean encendido) {
        // Llama al constructor de la clase padre (DispositivosInteligentes) para inicializar sus atributos.
        super(id, nombre, encendido);
    }

    @Override
    public void encender() {
        System.out.println("Cafetera encendida"); // Imprime un mensaje en la consola.
        this.encendido = true;
        // Muestra un mensaje emergente indicando que la cafetera ha sido encendida.
        JOptionPane.showMessageDialog(null, nombre + " encendida.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, encender);
    }

    @Override
    public void apagar() {
        System.out.println("Cafetera apagada"); // Imprime un mensaje en la consola.
        this.encendido = false;
        // Muestra un mensaje emergente indicando que la cafetera ha sido apagada.
        JOptionPane.showMessageDialog(null, nombre + " apagada.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, apagar);
    }
}


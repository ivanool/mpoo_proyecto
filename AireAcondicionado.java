package proyectocasainte;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class AireAcondicionado extends DispositivosInteligentes {
    // Constructor de la clase AireAcondicionado
    public AireAcondicionado(int id, String nombre, boolean encendido) {
        // Llama al constructor de la clase padre (DispositivosInteligentes) para inicializar sus atributos.
        super(id, nombre, encendido);
    }

    @Override
    public void encender() {
        System.out.println("Aire acondicionado encendido"); // Imprime un mensaje en la consola.
        this.encendido = true;
        // Muestra un mensaje emergente indicando que el aire acondicionado ha sido encendido.
        JOptionPane.showMessageDialog(null, nombre + " encendido.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, encender);
    }

    @Override
    public void apagar() {
        System.out.println("Aire acondicionado apagado"); // Imprime un mensaje en la consola.
        this.encendido = false;
        // Muestra un mensaje emergente indicando que el aire acondicionado ha sido apagado.
        JOptionPane.showMessageDialog(null, nombre + " apagado.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, apagar);
    }
}

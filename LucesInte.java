package proyectocasainte;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class LucesInte extends DispositivosInteligentes {
    // Atributos específicos de la clase LucesInte
    ImageIcon inte = new ImageIcon("src/proyecto/intensidad.jpeg");
    ImageIcon col = new ImageIcon("src/proyecto/color.png");
    ImageIcon est = new ImageIcon("src/proyecto/estadoLuz.jpeg");

    // Constructor de la clase LucesInte
    public LucesInte(int id, String nombre, boolean encendido) {
        // Llama al constructor de la clase padre (DispositivosInteligentes) para inicializar sus atributos.
        super(id, nombre, encendido);
    }

    @Override
    public void encender() {
        this.encendido = true;
        // Muestra un mensaje emergente indicando que las luces han sido encendidas.
        JOptionPane.showMessageDialog(null, this.nombre + " encendidas", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, est);
    }

    @Override
    public void apagar() {
        this.encendido = false;
        // Muestra un mensaje emergente indicando que las luces han sido apagadas.
        JOptionPane.showMessageDialog(null, this.nombre + " apagadas", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, est);
    }
}

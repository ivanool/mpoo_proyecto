package proyectocasainte;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class SeguridadInte extends DispositivosInteligentes {
    // Atributos específicos de la clase SeguridadInte
    private boolean activada;

    ImageIcon seguridad = new ImageIcon("src/proyecto/seguridad.jpg");

    // Constructor de la clase SeguridadInte
    public SeguridadInte(int id, String nombre, boolean encendido) {
        super(id, nombre, encendido);
        this.activada = false;
    }

    // Método para encender la seguridad
    public void encender() {
        this.encendido = true;
        JOptionPane.showMessageDialog(null, "Seguridad activada en " + this.nombre, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, seguridad);
    }

    // Método para apagar la seguridad
    public void apagar() {
        this.encendido = false;
        JOptionPane.showMessageDialog(null, "Seguridad desactivada en " + this.nombre, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, seguridad);
    }
}

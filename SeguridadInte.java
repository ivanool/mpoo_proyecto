package proyectocasainte;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class SeguridadInte extends DispositivosInteligentes{
    private boolean activada;

    ImageIcon seguridad =new ImageIcon("src/proyecto/seguridad.jpg");
    public SeguridadInte(int id,String nombre, boolean encendido) {
        super(id,nombre, encendido);
        this.activada = false;
    }

    public void encender() {
        this.encendido = true;
        JOptionPane.showMessageDialog(null, "Seguridad activada en " + this.nombre, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, seguridad);
    }

    public void apagar() {
        this.encendido = false;
        JOptionPane.showMessageDialog(null, "Seguridad desactivada en " + this.nombre, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, seguridad);
    }
}

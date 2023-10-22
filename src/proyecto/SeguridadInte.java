package proyecto;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class SeguridadInte extends DispositivosInteligentes{
    private boolean activada;

    ImageIcon seguridad =new ImageIcon("src/proyecto/seguridad.jpg");
    public SeguridadInte(int id,String nombre) {
        super(id,nombre);
        this.activada = false;
    }

    public void ActivarSeguridad() {
        activada = true;
        JOptionPane.showMessageDialog(null, "Seguridad activada en " + this.nombre, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, seguridad);
    }

    public void DesactivarSeguridad() {
        activada = false;
        JOptionPane.showMessageDialog(null, "Seguridad desactivada en " + this.nombre, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, seguridad);
    }
}

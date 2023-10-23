package proyectocasainte;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class LucesInte extends DispositivosInteligentes {
    // Atributos
    
    // Constructores
    ImageIcon inte = new ImageIcon("src/proyecto/intensidad.jpeg");
    ImageIcon col = new ImageIcon("src/proyecto/color.png");
    ImageIcon est = new ImageIcon("src/proyecto/estadoLuz.jpeg");

    public LucesInte(int id, String nombre, boolean encendido) {
        super(id, nombre, encendido);
    }

    @Override
    public void encender() {
        this.encendido = true;
        JOptionPane.showMessageDialog(null, this.nombre + " encendidas", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, est);
    }

    @Override
    public void apagar() {
        this.encendido = false;
        JOptionPane.showMessageDialog(null, this.nombre + " apagadas", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, est);
    }
}
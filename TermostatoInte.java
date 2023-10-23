import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class TermostatoInte extends DispositivosInteligentes {
    private int temperaturaDeseada;
    ImageIcon temperatura = new ImageIcon("src/proyecto/temperatura.png");

    public TermostatoInte(int id, String nombre, boolean encendido) {
        super(id, nombre, encendido);
        this.temperaturaDeseada = 25; // Temperatura por defecto
    }

    public void EstablecerTemperaturaDeseada(int nuevaTemperatura) {
        this.temperaturaDeseada = nuevaTemperatura;
        JOptionPane.showMessageDialog(null, "Temperatura deseada de " + this.nombre + " establecida a " + this.temperaturaDeseada + "°C", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, temperatura);
    }

    public void encender() {
        this.encendido = true;
        JOptionPane.showMessageDialog(null, "Temperatura deseada de " + this.nombre + " establecida a " + this.temperaturaDeseada + "°C", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, temperatura);
    }
    public void apagar() {
        this.encendido = false;
        JOptionPane.showMessageDialog(null, "Temperatura deseada de " + this.nombre + " establecida a " + this.temperaturaDeseada + "°C", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, temperatura);
    }
}


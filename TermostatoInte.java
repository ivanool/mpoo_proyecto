package proyectocasainte;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TermostatoInte extends DispositivosInteligentes {
    private int temperatura;
    private ImageIcon iconoTemperatura = new ImageIcon("src/proyecto/temperatura.png");

    public TermostatoInte(int id, String nombre, boolean estado, int temperatura) {
        super(id, nombre, estado);
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void encender() {
        super.encender();
        JOptionPane.showMessageDialog(null, "Temperatura deseada de " + this.getNombre() + " establecida a " + this.temperatura + "°C", "Casa Inteligente", JOptionPane.DEFAULT_OPTION, iconoTemperatura);
    }

    @Override
    public void apagar() {
        super.apagar();
        JOptionPane.showMessageDialog(null, this.getNombre() + " ha sido apagado", "Casa Inteligente", JOptionPane.DEFAULT_OPTION, iconoTemperatura);
    }
}

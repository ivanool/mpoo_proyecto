import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Habitaciones {
    ImageIcon error = new ImageIcon("src/proyecto/error.png");
    protected String nombre;
    protected DispositivosInteligentes[] dispositivosInteligentes;
    protected int numDispositivosInteligentes;

    Habitaciones(String nombre, int maxDispositivosInteligentes) {
        this.nombre = nombre;
        this.dispositivosInteligentes = new DispositivosInteligentes[maxDispositivosInteligentes];
        this.numDispositivosInteligentes = 0;
    }

    public void addDispositivosInteligentes(DispositivosInteligentes dispositivo) {
        if (numDispositivosInteligentes < dispositivosInteligentes.length) {
            dispositivosInteligentes[numDispositivosInteligentes] = dispositivo;
            numDispositivosInteligentes++;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más dispositivos inteligentes.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, error);
        }
    }

    public void removeDispositivosInteligentes(DispositivosInteligentes dispositivo) {
        for (int i = 0; i < numDispositivosInteligentes; i++) {
            if (dispositivosInteligentes[i] == dispositivo) {
                for (int j = i; j < numDispositivosInteligentes - 1; j++) {
                    dispositivosInteligentes[j] = dispositivosInteligentes[j + 1];
                }
                dispositivosInteligentes[numDispositivosInteligentes - 1] = null;
                numDispositivosInteligentes--;
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "El dispositivo inteligente no se encontró en la habitación.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, error);
    }
    
    public DispositivosInteligentes[] getDispositivosInteligentes() {
        return dispositivosInteligentes;
    }

    public void encender_luces() {
        
    }

    public void apagar_luces() {
        
    }

    public void configurar_temperatura(int temperatura) {
        
    }

    public void controlar_iluminacion() {
        
    }
}

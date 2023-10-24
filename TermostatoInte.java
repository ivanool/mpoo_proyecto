package proyectocasainte;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TermostatoInte extends DispositivosInteligentes {
    // Atributos específicos de la clase TermostatoInte
    private int temperatura;
    private ImageIcon iconoTemperatura = new ImageIcon("src/proyecto/temperatura.png");

    // Constructor de la clase TermostatoInte
    public TermostatoInte(int id, String nombre, boolean estado, int temperatura) {
        // Llama al constructor de la clase padre (DispositivosInteligentes) para inicializar sus atributos.
        super(id, nombre, estado);
        // Inicializa el atributo específico "temperatura".
        this.temperatura = temperatura;
    }

    // Método para obtener la temperatura
    public int getTemperatura() {
        return temperatura;
    }

    // Método para establecer la temperatura
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void encender() {
        super.encender(); // Llama al método "encender" de la clase padre.
        // Muestra un mensaje emergente indicando que el termostato se ha encendido y establecido a una temperatura específica.
        JOptionPane.showMessageDialog(null, "Temperatura deseada de " + this.getNombre() + " establecida a " + this.temperatura + "°C", "Casa Inteligente", JOptionPane.DEFAULT_OPTION, iconoTemperatura);
    }

    @Override
    public void apagar() {
        super.apagar(); // Llama al método "apagar" de la clase padre.
        // Muestra un mensaje emergente indicando que el termostato se ha apagado.
        JOptionPane.showMessageDialog(null, this.getNombre() + " ha sido apagado", "Casa Inteligente", JOptionPane.DEFAULT_OPTION, iconoTemperatura);
    }
}


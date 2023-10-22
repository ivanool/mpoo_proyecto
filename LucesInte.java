package proyectocasainte;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class LucesInte extends DispositivosInteligentes {
    // Atributos
    private int intensidad;
    private String color;
    private boolean estado;

    // Constructores
    ImageIcon inte = new ImageIcon("src/proyecto/intensidad.jpeg");
    ImageIcon col = new ImageIcon("src/proyecto/color.png");
    ImageIcon est = new ImageIcon("src/proyecto/estadoLuz.jpeg");

    public LucesInte(int id, String nombre) {
        super(id, nombre);
        this.intensidad = 0;
        this.color = "Blanco";
        this.estado = false; // Inicialmente apagadas
    }

    // Métodos

    // Método para ajustar la intensidad de las luces
    public void ajustarIntensidad(int nuevaIntensidad) {
        this.intensidad = nuevaIntensidad;
        JOptionPane.showMessageDialog(null, "Intensidad de " + this.nombre + " ajustada a " + this.intensidad, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, inte);
    }

    // Método para cambiar el color de las luces
    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        JOptionPane.showMessageDialog(null, "Color de " + this.nombre + " cambiado a " + this.color, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, col);
    }

    // Método para obtener la intensidad actual de las luces
    public int obtenerIntensidad() {
        return intensidad;
    }

    // Método para obtener el color actual de las luces
    public String obtenerColor() {
        return color;
    }

    // Método para mostrar el estado actual de las luces (incluyendo intensidad y color)
    public void mostrarEstado() {
        String estado = this.estado ? "encendidas" : "apagadas";
        JOptionPane.showMessageDialog(null, this.nombre + " están " + estado + " con intensidad " + this.intensidad + " y color " + this.color, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, est);
    }

    @Override
    public void encender() {
        this.estado = true;
        JOptionPane.showMessageDialog(null, this.nombre + " encendidas", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, est);
    }

    @Override
    public void apagar() {
        this.estado = false;
        JOptionPane.showMessageDialog(null, this.nombre + " apagadas", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, est);
    }
}

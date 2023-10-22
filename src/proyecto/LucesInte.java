package proyecto;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class LucesInte extends DispositivosInteligentes{
    //Atributos
    private int intensidad;
    private String color;
    //Constructores
    ImageIcon intensidad =new ImageIcon("src/proyecto/intensidad.jpeg");
    ImageIcon color =new ImageIcon("src/proyecto/color.png");
    ImageIcon estado =new ImageIcon("src/proyecto/estadoLuz.jpeg");
    
    public LucesInte(int id,String nombre) {
        super(id,nombre);
        this.intensidad = 0;
        this.color = "Blanco";
    }
    //Metodos
    
    // Método para ajustar la intensidad de las luces
    public void AjustarIntensidad(int nuevaIntensidad) {
        this.intensidad = nuevaIntensidad;
        JOptionPane.showMessageDialog(null, "Intensidad de " + this.nombre + " ajustada a " + this.intensidad, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, intensidad);
    }    
    // Método para cambiar el color de las luces
    public void CambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        JOptionPane.showMessageDialog(null, "Color de " + this.nombre + " cambiado a " + this.color, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, color);
    }
    // Método para obtener la intensidad actual de las luces
    public int ObtenerIntensidad() {
        return intensidad;
    }

    // Método para obtener el color actual de las luces
    public String ObtenerColor() {
        return color;
    }
    // Método para mostrar el estado actual de las luces (incluyendo intensidad y color)
    public void MostrarEstado() {
        String estado = obtenerEstado() ? "encendidas" : "apagadas";
        JOptionPane.showMessageDialog(null, this.nombre + " están " + estado + " con intensidad " + this.intensidad + " y color " + this.color, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, estado);
    }
    
}

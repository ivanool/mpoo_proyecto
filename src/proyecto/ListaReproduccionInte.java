package proyecto;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.List;

public class ListaReproduccionInte extends DispositivosInteligentes {

    ImageIcon reproducir =new ImageIcon("src/proyecto/reproducir.jpeg");
    ImageIcon vacia =new ImageIcon("src/proyecto/vacia.png");
    ImageIcon pausa =new ImageIcon("src/proyecto/pausa.png");
    ImageIcon detenida =new ImageIcon("src/proyecto/detenida.jpeg");
    ImageIcon actualizada =new ImageIcon("src/proyecto/actualizada.png");
    ImageIcon agregada =new ImageIcon("src/proyecto/agregada.png");
    
    private List<String> listaReproduccion;
    private boolean reproduciendo;

    public ListaReproduccionInte(int id,String nombre) {
        super(id,nombre);
        listaReproduccion = new ArrayList<>();
        reproduciendo = false;
    }

    public void Reproducir() {
        if (!listaReproduccion.isEmpty()) {
            reproduciendo = true;
            JOptionPane.showMessageDialog(null, "Reproduciendo " +  listaReproduccion.get(0), "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, reproducir);
        } else {
            JOptionPane.showMessageDialog(null, "La lista de reproducción está vacía.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, vacia); 
        }
    }

    public void Pausar() {
        reproduciendo = false;
        JOptionPane.showMessageDialog(null, "Reproducción en pausa", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, pausa);
        
    }

    public void Detener() {
        reproduciendo = false;
        JOptionPane.showMessageDialog(null, "Reproducción detenida", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, detenida);
    }

    public void CambiarListaReproduccion(List<String> nuevaLista) {
        listaReproduccion = nuevaLista;
        JOptionPane.showMessageDialog(null, "Lista de reproducción actualizada", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, actualizada););
    }

    public void AgregarCancionALista(String cancion) {
        listaReproduccion.add(cancion);
        JOptionPane.showMessageDialog(null, "Canción " + cancion + " agregada a la lista de reproducción", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, agregada);
    }
}

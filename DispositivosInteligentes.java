package proyectocasainte;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class DispositivosInteligentes {
    //Atributos
    protected int idDispositivo;
    protected String nombre;
    protected boolean encendido;
    //Constructores
    ImageIcon encender =new ImageIcon("src/proyecto/encendido.png");
    ImageIcon apagar =new ImageIcon("src/proyecto/apagado.jpeg");
    int iD,ID;
    public DispositivosInteligentes(int id, String nombre, boolean encendido) {
        this.idDispositivo = id;
        this.nombre = nombre;
        this.encendido = false;
        
    }
    //Metodos
    public void encender() {
        encendido = true;
        JOptionPane.showMessageDialog(null, nombre+" encendido.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, encender);
    }
    public void apagar() {
        encendido = false;
        JOptionPane.showMessageDialog(null, nombre+" apagado.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, apagar);
    }
    public boolean obtenerEstado() {
        return encendido;
    }
    public void establecerEstado(boolean estado) {
        encendido = estado;
    }
    public int getId() {
        return idDispositivo;

    }

    public String getNombre() {
        return nombre;
    }
}
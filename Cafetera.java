package proyectocasainte;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Cafetera extends DispositivosInteligentes{
    public Cafetera(int id, String nombre, boolean encendido){
        super(id, nombre, encendido);
    }

    @Override
    public void encender(){
        System.out.println("Cafetera encendida");
        this.encendido = true;
        JOptionPane.showMessageDialog(null, nombre+" encendido.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, encender);
    }

    @Override
    public void apagar(){
        System.out.println("Cafetera apagada");
        this.encendido = false;
        JOptionPane.showMessageDialog(null, nombre+" apagado.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, apagar);
    }
}

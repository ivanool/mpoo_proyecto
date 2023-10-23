import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class AireAcondicionado extends DispositivosInteligentes{
    public AireAcondicionado(int id, String nombre, boolean encendido){
        super(id, nombre, encendido);
    }

    @Override
    public void encender(){
        System.out.println("Aire acondicionado encendido");
        this.encendido = true;
        JOptionPane.showMessageDialog(null, nombre+" encendido.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, encender);
    }

    @Override
    public void apagar(){
        System.out.println("Aire acondicionado apagado");
        this.encendido = false;
        JOptionPane.showMessageDialog(null, nombre+" apagado.", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, apagar);
    }
}
// JOptionPane.showMessageDialog(null, "Seguridad desactivada en " + this.nombre, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, seguridad);
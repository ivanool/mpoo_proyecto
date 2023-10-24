import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class AireAcondicionado extends DispositivosInteligentes{
    ImageIcon encender =new ImageIcon("src/proyecto/encendido.png");
    ImageIcon apagar =new ImageIcon("src/proyecto/apagado.jpeg");
    public AireAcondicionado(int id, String nombre){
        super(id, nombre);
    }

    public void encender(){
         JOptionPane.showMessageDialog(null, "Aire acondicionado encendido", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, encender);
    }

    public void apagar(){
        JOptionPane.showMessageDialog(null, "Aire acondicionado apagado", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, apagar);
    }
}

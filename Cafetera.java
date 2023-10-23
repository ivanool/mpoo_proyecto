import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

    public class Cafetera extends DispositivosInteligentes{
    ImageIcon encender =new ImageIcon("src/proyecto/encendido.png");
    ImageIcon apagar =new ImageIcon("src/proyecto/apagado.jpeg");
    
    public Cafetera(int id, String nombre){
        super(id, nombre);
    }

    @Override
    public void encender(){
        JOptionPane.showMessageDialog(null, "Cafetera encendida", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, encender);
    }
    @Override
    public void apagar(){
        JOptionPane.showMessageDialog(null, "Cafetera apagada", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, apagar);
    }
}

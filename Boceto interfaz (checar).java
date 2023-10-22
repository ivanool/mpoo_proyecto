import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class CasaInteligente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=0, IDcuarto, IDdispositivo, opcCuarto;
        Scanner teclado;
        teclado = new Scanner(System.in);
        ArrayList <Cuarto> listaCuartos= new ArrayList();
        ArrayList <DispositivosInteligentes> listaDispTot= new ArrayList();
        int V=0, h;
        String j;

        verificacion ver= new verificacion();
        ImageIcon Bienvenida =new ImageIcon("src/proyecto/Bienvenida.jpeg");
        ImageIcon menu =new ImageIcon("src/proyecto/casaInteligente.jpeg");
        ImageIcon cuartos =new ImageIcon("src/proyecto/cuartos.jpg");
        ImageIcon error =new ImageIcon("src/proyecto/error.png");
        String[] MenuPpal = {"1. Ingresar cuartos", "2. Ingresar dispositivos a conectar", "3. Encender dispositivos", "4. Apagar dispositivos", "5. Obtener estado", "6. Salir"};
        String[] TipoCuarto = {"1. Sala de estar", "2. Cocina", "3. Dormitorio", "4. Salir"};
        
        do{
        JOptionPane.showMessageDialog(null, "**Bienvenido a la interfaz de: Tu Casa Inteligente**" , "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, Bienvenida);
        n = JOptionPane.showOptionDialog(null,"Seleccione lo que guste realizar: ", "Jaime, Navarro, Perez y Soto",JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION,menu ,MenuPpal, MenuPpal[0]);
        switch(n+1){
            case 1:
                  do{ 
                   opcCuarto = JOptionPane.showOptionDialog(null,"¿Qué tipo de cuarto es? seleccione una opción: ", "Jaime, Navarro, Perez y Soto",JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION,cuartos ,TipoCuarto, TipoCuarto[0]);
                   switch(opcCuarto+1){
                       case 1:
                           do{
                                j=JOptionPane.showInputDialog(null, "Ingrese el número de cuartos a registrar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                V= ver.numero(j);
                              }while(V==0);
                                h = Integer.parseInt(j);
                           for(int i=0; i<h; i++){
                                String nombresala;
                                nombresala=JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Sala de Estar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                sala = new SalaEstar(nombresala);
                                listaCuartos.add(sala);
                           }
                           break;
                       case 2:
                           do{
                                j=JOptionPane.showInputDialog(null, "Ingrese el número de cuartos a registrar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                V= ver.numero(j);
                              }while(V==0);
                                h = Integer.parseInt(j);
                           for(int i=0; i<h; i++){
                                String nombrecocina;
                                nombrecocina=JOptionPane.showInputDialog(null,  "Por favor, ingrese el nombre de su cocina: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                cocina = new Cocina(nombrecocina);
                                listaCuartos.add(cocina);
                           }
                           break;
                       case 3:
                           do{
                                j=JOptionPane.showInputDialog(null, "Ingrese el número de cuartos a registrar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                V= ver.numero(j);
                              }while(V==0);
                                h = Integer.parseInt(j);
                           for(int i=0; i<h; i++){
                                String nombreDorm;
                                nombreDorm=JOptionPane.showInputDialog(null,  "Por favor, ingrese el nombre de su dormitorio: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                dorm = new Dormitorio(nombreDorm);
                                listaCuartos.add(dorm);
                           }
                           break;
                    }
                  }while(opcCuarto!=4);
                
                if(listaCuartos.size()!=0){
                    
                    do{ 
                        opcCuarto = JOptionPane.showOptionDialog(null,"¿Qué tipo de cuarto es? seleccione una opción: ", "Jaime, Navarro, Perez y Soto",JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION,cuartos ,TipoCuarto, TipoCuarto[0]);
                        switch(opcCuarto+1){
                            case 1:
                               do{
                                    j=JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a registrar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                    V= ver.numero(j);
                                 }while(V==0);
                                    h = Integer.parseInt(j);
                               for(int i=0; i<h; i++){
                                   SalaEstar.agregarDispositivo();
                                   listaDispTot.add(dispositivo agregado arriba);
                               }
                               break;
                            case 2:
                               do{
                                    j=JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a registrar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                    V= ver.numero(j);
                                 }while(V==0);
                                    h = Integer.parseInt(j);
                               for(int i=0; i<h; i++){
                                   Cocina.agregarDispositivo;
                                   listaDispTot.add(dispositivo agregado arriba);
                               }
                               break;
                            case 3:
                               System.out.println("\t Ingrese el número de dispositivos a registrar: ");
                               j= teclado.nextInt();
                               for(int i=0; i<j; i++){
                                   Dormitorio.agregarDispositivo();
                                   listaDispTot.add(dispositivo agregado arriba);
                               }
                               break;   
                        }
                    }while(opcCuarto!=4);
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR registre primero un cuarto para poder hacer esta acción", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, error);
                    break;
                }
            case 3:
                if(listaDispTot.size()!=0){
                    do{
                            j=JOptionPane.showInputDialog(null, "Ingrese el ID del dispositivo a apagar", "Jaime, Navarro, Perez y Soto", JOptionPane.WARNING_MESSAGE);
                            V= ver.numero(j);
                       }while(V==0);
                            IDdispositivo = Integer.parseInt(j);
                    for(DispositivosInteligentes Dispositivo: listaDispTot){
                        if(DispositivosInteligentes.ID==IDdispositivo){
                            DispositivosInteligentes.apagar();
                        }
                    }
                }else
                      JOptionPane.showMessageDialog(null, "No se encontró el dispositivo de ID "+IDdispositivo, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, error);
            case 4:
                if(listaDispTot.size()!=0){
                    do{
                            j=JOptionPane.showInputDialog(null, "Ingrese el ID del dispositivo a apagar", "Jaime, Navarro, Perez y Soto", JOptionPane.WARNING_MESSAGE);
                            V= ver.numero(j);
                       }while(V==0);
                            IDdispositivo = Integer.parseInt(j);
                    for(DispositivosInteligentes Dispositivo: listaDispTot){
                        if(DispositivosInteligentes.ID==IDdispositivo){
                            DispositivosInteligentes.apagar();
                        }
                    }
                }else
                      JOptionPane.showMessageDialog(null, "No se encontró el dispositivo de ID "+IDdispositivo, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, error);
            case 5:
                if(listaDispTot.size()!=0){
                    do{
                            j=JOptionPane.showInputDialog(null, "Ingrese el ID del dispositivo a consultar estado", "Jaime, Navarro, Perez y Soto", JOptionPane.WARNING_MESSAGE);
                            V= ver.numero(j);
                       }while(V==0);
                            IDdispositivo = Integer.parseInt(j);
                    for(DispositivosInteligentes Dispositivo: listaDispTot){
                        if(DispositivosInteligentes.ID==IDdispositivo){
                            DispositivosInteligentes.obtenerEstado();
                        }
                    }
                }else
                      JOptionPane.showMessageDialog(null, "No se encontró el dispositivo de ID "+IDdispositivo, "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, error);
                
        }
 
        }while(n!=6);
    }
}

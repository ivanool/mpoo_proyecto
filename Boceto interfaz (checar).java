import java.util.ArrayList;
import java.util.Scanner;
public class CasaInteligente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j, n=0, IDcuarto, IDdispositivo, opcCuarto;
        Scanner teclado;
        teclado = new Scanner(System.in);
        ArrayList <Cuarto> listaCuartos= new ArrayList();
        ArrayList <DispositivosInteligentes> listaDispTot= new ArrayList();
        
        do{
        System.out.println("**Bienvenido a la interfaz de: Tu Casa Inteligente**");
        System.out.println("\t Por favor, seleccione una opción");
        System.out.println("\n\t\t1. Ingresar cuartos"
                + "\n\t\t2.Ingresar dispositivos a conectar"
                + "\n\t\t3.Encender dispositivos"
                + "\n\t\t4. Apagar Dispositivos"
                + "\n\t\t5. Obtener Estado"
                + "\n\t\t6.Salir");
        n=teclado.nextInt();
        switch(n){
            case 1:
                  do{ 
                   System.out.println("\t ¿Qué tipo de cuarto es? seleccione una opción: ");
                   System.out.println("\n\t\t1. Sala de Estar"
                    + "\n\t\t2.Cocina"
                    + "\n\t\t3.Dormitorio"
                    + "\n\t\t4. Salir");
                   opcCuarto= teclado.nextInt();
                   switch(opcCuarto){
                       case 1:
                           System.out.println("\t Ingrese el número de cuartos a registrar: ");
                           j= teclado.nextInt();
                           
                           for(int i=0; i<j; i++){
                                String nombresala;
                                System.out.println("\t Por favor, ingrese el nombre de su Sala de Estar: ");
                                nombresala= teclado.nextLine();
                                sala = new SalaEstar(nombresala);
                                listaCuartos.add(sala);
                           }
                           break;
                       case 2:
                           System.out.println("\t Ingrese el número de cuartos a registrar: ");
                           j= teclado.nextInt();
                           
                           for(int i=0; i<j; i++){
                            String nombrecocina;
                            System.out.println("\t Por favor, ingrese el nombre de su cocina: ");
                            nombrecocina= teclado.nextLine();
                            cocina = new Cocina(nombrecocina);
                            listaCuartos.add(cocina);
                           }
                           break;
                       case 3:
                           System.out.println("\t Ingrese el número de cuartos a registrar: ");
                           j= teclado.nextInt();
                           
                           for(int i=0; i<j; i++){
                            String nombreDorm;
                            System.out.println("\t Por favor, ingrese el nombre de su dormitorio: ");
                            nombreDorm= teclado.nextLine();
                            dorm = new Dormitorio(nombreDorm);
                            listaCuartos.add(dorm);
                           }
                           break;
                    }
                  }while(opcCuarto!=4);
            case 2:
                if(listaCuartos.size()!=0){
                    
                    do{ 
                        System.out.println("\t ¿Qué tipo de cuarto es? seleccione una opción: ");
                        System.out.println("\n\t\t1. Sala de Estar"
                            + "\n\t\t2.Cocina"
                            + "\n\t\t3.Dormitorio"
                            + "\n\t\t4. Salir");
                        opcCuarto= teclado.nextInt();
                        switch(opcCuarto){
                            case 1:
                               System.out.println("\t Ingrese el número de dispositivos a registrar: ");
                               j= teclado.nextInt();
                               for(int i=0; i<j; i++){
                                   SalaEstar.agregarDispositivo();
                                   listaDispTot.add(dispositivo agregado arriba);
                               }
                               break;
                            case 2:
                               System.out.println("\t Ingrese el número de dispositivos a registrar: ");
                               j= teclado.nextInt();
                               for(int i=0; i<j; i++){
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
                    System.out.println("\t ERROR registre primero un cuarto para poder hacer esta acción");
                    break;
                }
            case 3:
                if(listaDispTot.size()!=0){
                    System.out.println("\t Ingrese el ID del dispositivo a apagar");
                    IDdispositivo= teclado.nextInt();
                    for(DispositivosInteligentes Dispositivo: listaDispTot){
                        if(DispositivosInteligentes.ID==IDdispositivo){
                            DispositivosInteligentes.apagar();
                        }
                    }
                }else
                      System.out.println("\t No se encontró el dispositivo de ID "+IDdispositivo);
            case 4:
                if(listaDispTot.size()!=0){
                    System.out.println("\t Ingrese el ID del dispositivo a apagar");
                    IDdispositivo= teclado.nextInt();
                    for(DispositivosInteligentes Dispositivo: listaDispTot){
                        if(DispositivosInteligentes.ID==IDdispositivo){
                            DispositivosInteligentes.apagar();
                        }
                    }
                }else
                      System.out.println("\t No se encontró el dispositivo de ID "+IDdispositivo);
            case 5:
                if(listaDispTot.size()!=0){
                    System.out.println("\t Ingrese el ID del dispositivo a consultar estado");
                    IDdispositivo= teclado.nextInt();
                    for(DispositivosInteligentes Dispositivo: listaDispTot){
                        if(DispositivosInteligentes.ID==IDdispositivo){
                            DispositivosInteligentes.obtenerEstado();
                        }
                    }
                }else
                      System.out.println("\t No se encontró el dispositivo de ID "+IDdispositivo);
                
        }
 
        }while(n!=6);
    }
}

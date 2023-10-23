import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class CasaInteligente {

    public static void main(String[] args) {
        int n = 0, IDcuarto, IDdispositivo, opcCuarto, opcDisp;
        Scanner teclado;
        teclado = new Scanner(System.in);
        ArrayList<Habitaciones> listaCuartos = new ArrayList();
        ArrayList<DispositivosInteligentes> listaDispTot = new ArrayList<DispositivosInteligentes>();
        int V = 0, h;
        String j;

        verificacion ver = new verificacion();
        ImageIcon Bienvenida = new ImageIcon("src/proyecto/Bienvenida.jpeg");
        ImageIcon menu = new ImageIcon("src/proyecto/casaInteligente.jpeg");
        ImageIcon cuartos = new ImageIcon("src/proyecto/cuartos.jpg");
        ImageIcon error = new ImageIcon("src/proyecto/error.png");
        String[] MenuPpal = {"1. Ingresar cuartos", "2. Ingresar dispositivos a conectar", "3. Encender dispositivos", "4. Apagar dispositivos", "5. Obtener estado", "6. Salir"};
        String[] TipoCuarto = {"1. Sala de estar", "2. Cocina", "3. Dormitorio", "4. Salir"};
        String[] DispCocina ={"1. Horno", "2. Cafetera", "3. Luces"};
        String[] DispDorm ={"1. Aire acondicionado", "2. Luces"};
        String[] DispSala ={"1. Aire acondicionado", "2. Luces"};



        do {
            JOptionPane.showMessageDialog(null, "**Bienvenido a la interfaz de: Tu Casa Inteligente**", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, Bienvenida);
            n = JOptionPane.showOptionDialog(null, "Seleccione lo que guste realizar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, menu, MenuPpal, MenuPpal[0]);
            switch (n+1) {
                case 1:
                    do {
                        opcCuarto = JOptionPane.showOptionDialog(null, "¿Qué tipo de cuarto es? seleccione una opción: ", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, TipoCuarto, TipoCuarto[0]);
                        switch (opcCuarto + 1) {
                            case 1:
                                
                                    j = JOptionPane.showInputDialog(null, "Ingrese el número de cuartos a registrar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                    V = ver.numero(j);
                                
                                h = Integer.parseInt(j);
                                for (int i = 0; i < h; i++) {
                                    String nombresala;
                                    nombresala = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Sala de Estar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                    String numDisp;
                                    numDisp = JOptionPane.showInputDialog(null,"Por favor, ingrese el numero de dispositivos de su Sala de Estar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                    int k = Integer.parseInt(numDisp);
                                    Saladeestar sala = new Saladeestar(nombresala,k);
                                    
                                    listaCuartos.add(sala);
                                }
                                break;
                            case 2:
                                
                                    j = JOptionPane.showInputDialog(null, "Ingrese el número de cuartos a registrar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                    V = ver.numero(j);
                                
                                h = Integer.parseInt(j);
                                for (int i = 0; i < h; i++) {
                                    String nombrecocina;
                                    nombrecocina = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Cocina: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                    
                                    
                                    String numDisp;
                                    numDisp = JOptionPane.showInputDialog(null,"Por favor, ingrese el numero de dispositivos de su Cocina: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                    int k = Integer.parseInt(numDisp);
                                    Saladeestar sala = new Saladeestar(nombrecocina,k);
                                    
                                    listaCuartos.add(sala);
                                }
                                break;
                            case 3:
                                
                                    j = JOptionPane.showInputDialog(null, "Ingrese el número de cuartos a registrar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                    V = ver.numero(j);
                                
                                h = Integer.parseInt(j);
                                for (int i = 0; i < h; i++) {
                                    String nombredorm;
                                    nombredorm = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Dormitorio: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                    
                                    
                                    String numDisp;
                                    numDisp = JOptionPane.showInputDialog(null,"Por favor, ingrese el numero de dispositivos de su Dormitorio: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                    int k = Integer.parseInt(numDisp);
                                    Saladeestar sala = new Saladeestar(nombredorm,k);
                                    
                                    listaCuartos.add(sala);
                                }
                                break;
                        }
                
                    } while (opcCuarto !=4);
                break;
                    
                case 2:

                    if (listaCuartos.size() != 0) {
                        do {
                            opcCuarto = JOptionPane.showOptionDialog(null, "¿Qué tipo de cuarto es? seleccione una opción: ", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, TipoCuarto, TipoCuarto[0]);
                            switch (opcCuarto + 1) {
                                case 1:
                                    
                                        j = JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a registrar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                        V = ver.numero(j);
                                    
                                    h = Integer.parseInt(j);
                                    for (int i = 0; i < h; i++) {
                                        opcDisp=JOptionPane.showOptionDialog(null, "Qué dispositivo desea registrar?", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, error, DispSala,DispSala[0]);
                                        Habitaciones sala = listaCuartos.get(0); // Obtener la Sala de Estar
                                        switch(opcDisp){
                                            case 1:
                                                String nombreaa;
                                                nombreaa = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                String IDaa;
                                                IDaa = JOptionPane.showInputDialog(null, "Por favor, ingrese el ID de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int ID= Integer.parseInt(IDaa);
                                                AireAcondicionado AA = new AireAcondicionado(ID, nombreaa);
                                                listaDispTot.add(AA);
                                                break;
                                            case 2:
                                                String nombreluz;
                                                nombreluz = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                String IDluz;
                                                IDluz = JOptionPane.showInputDialog(null, "Por favor, ingrese el ID de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int IDluces= Integer.parseInt(IDluz);
                                                LucesInte luz = new LucesInte(IDluces, nombreluz);
                                                listaDispTot.add(luz);
                                                break;    
                                        }                                       
                                    }
                                    break;
                                case 2:
                                    
                                        j = JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a registrar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                        V = ver.numero(j);
                                    
                                    h = Integer.parseInt(j);
                                    for (int i = 0; i < h; i++) {
                                        opcDisp=JOptionPane.showOptionDialog(null, "Qué dispositivo desea registrar?", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, error, DispCocina,DispCocina[0]);
                                        Habitaciones sala = listaCuartos.get(0); // Obtener la Sala de Estar
                                        switch(opcDisp){
                                            case 1:
                                                String nombreHorn;
                                                nombreHorn = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Horno: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                String IDH;
                                                IDH = JOptionPane.showInputDialog(null, "Por favor, ingrese el ID de su ire Horno: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int ID= Integer.parseInt(IDH);
                                                Horno Horno = new Horno(ID, nombreHorn);
                                                listaDispTot.add(Horno);
                                                break;
                                            case 2:
                                                String nombreCafe;
                                                nombreCafe = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Cafetera: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                String IDC;
                                                IDC = JOptionPane.showInputDialog(null, "Por favor, ingrese el ID de su Cafetera: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int IDcafes= Integer.parseInt(IDC);
                                                LucesInte luz = new LucesInte(IDcafes, nombreCafe);
                                                listaDispTot.add(luz);
                                                break;
                                            case 3:
                                                String nombreluzc;
                                                nombreluzc = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                String IDluzc;
                                                IDluzc = JOptionPane.showInputDialog(null, "Por favor, ingrese el ID de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int IDlucesc= Integer.parseInt(IDluzc);
                                                LucesInte luzc = new LucesInte(IDlucesc, nombreluzc);
                                                listaDispTot.add(luzc);
                                                break;
                                        }                                       
                                    }
                                    break;
                                case 3:
                                   
                                        j = JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a registrar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                        V = ver.numero(j);
                                    
                                    h = Integer.parseInt(j);
                                    for (int i = 0; i < h; i++) {
                                        opcDisp=JOptionPane.showOptionDialog(null, "Qué dispositivo desea registrar?", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, error, DispDorm,DispDorm[0]);
                                        Habitaciones sala = listaCuartos.get(0); // Obtener la Sala de Estar
                                        switch(opcDisp){
                                            case 1:
                                                String nombreaad;
                                                nombreaad = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                String IDaad;
                                                IDaad = JOptionPane.showInputDialog(null, "Por favor, ingrese el ID de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int IDd= Integer.parseInt(IDaad);
                                                AireAcondicionado AAd = new AireAcondicionado(IDd, nombreaad);
                                                listaDispTot.add(AAd);
                                                break;
                                            case 2:
                                                String nombreluzd;
                                                nombreluzd = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                String IDluzd;
                                                IDluzd = JOptionPane.showInputDialog(null, "Por favor, ingrese el ID de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int IDlucesd= Integer.parseInt(IDluzd);
                                                LucesInte luzd = new LucesInte(IDlucesd, nombreluzd);
                                                listaDispTot.add(luzd);
                                                break;
                                        }                                       
                                    }
                                    break;
                            }
                        } while (opcCuarto != 4);
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR: registre primero un cuarto para poder hacer esta acción", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, error);
                        break;
                    }
                    break;
                case 3:
                    //Aquí apenas estoy modificando para que sea el de apagar, pero mejor revisa si lo de arriba está bien :c
                    if (listaCuartos.size() != 0) {
                        do {
                            opcCuarto = JOptionPane.showOptionDialog(null, "¿Qué tipo de cuarto es? seleccione una opción: ", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, TipoCuarto, TipoCuarto[0]);
                            switch (opcCuarto + 1) {
                                case 1:
                                    
                                        j = JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a apagar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                        V = ver.numero(j);
                                    
                                    h = Integer.parseInt(j);
                                    for (int i = 0; i < h; i++) {
                                        opcDisp=JOptionPane.showOptionDialog(null, "Qué dispositivo desea apagar?", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, DispSala,DispSala[0]);
                                        Habitaciones sala = listaCuartos.get(0); // Obtener la Sala de Estar
                                        switch(opcDisp){
                                            case 1:
                                                String nombreaa;
                                                nombreaa = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexAA= listaDispTot.indexOf(nombreaa);
                                                
                                                listaDispTot.get(indexAA).Apagar();
                                                break;
                                            case 2:
                                                String nombreluz;
                                                nombreluz = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexluz= listaDispTot.indexOf(nombreluz);
                                                listaDispTot.get(indexluz).Apagar();
                                                break;    
                                        }                                       
                                    }
                                    break;
                                case 2:
                                    
                                        j = JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a apagar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                        V = ver.numero(j);
                                    
                                    h = Integer.parseInt(j);
                                    for (int i = 0; i < h; i++) {
                                        opcDisp=JOptionPane.showOptionDialog(null, "Qué dispositivo desea apagar?", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, DispSala,DispSala[0]);
                                        Habitaciones sala = listaCuartos.get(0); // Obtener la Sala de Estar
                                        switch(opcDisp){
                                            case 1:
                                                String nombreHorn;
                                                nombreHorn = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexHorn= listaDispTot.indexOf(nombreHorn);
                                                
                                                listaDispTot.get(indexHorn).Apagar();
                                                break;
                                            case 2:
                                                String nombreCafe;
                                                nombreCafe = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexCafe= listaDispTot.indexOf(nombreCafe);
                                                
                                                listaDispTot.get(indexCafe).Apagar();
                                                break;
                                                
                                            case 3:
                                                String nombreluzc;
                                                nombreluzc = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexluzc= listaDispTot.indexOf(nombreluzc);
                                                listaDispTot.get(indexluzc).Apagar();
                                                break;   
                                        }                                       
                                    }
                                    break;
                                case 3:
                                   
                                        j = JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a apagar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                        V = ver.numero(j);
                                    
                                    h = Integer.parseInt(j);
                                    for (int i = 0; i < h; i++) {
                                        opcDisp=JOptionPane.showOptionDialog(null, "Qué dispositivo desea apagar?", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, DispSala,DispSala[0]);
                                        Habitaciones sala = listaCuartos.get(0); // Obtener la Sala de Estar
                                        switch(opcDisp){
                                            case 1:
                                                String nombreaad;
                                                nombreaad = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexAAd= listaDispTot.indexOf(nombreaad);
                                                
                                                listaDispTot.get(indexAAd).Apagar();
                                                break;
                                            case 2:
                                                String nombreluzd;
                                                nombreluzd = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexluzd= listaDispTot.indexOf(nombreluzd);
                                                listaDispTot.get(indexluzd).Apagar();
                                                break;    
                                        }                                       
                                    }
                                    break;
                            }
                        } while (opcCuarto != 4);
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR: registre primero un cuarto para poder hacer esta acción", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, error);
                        break;
                    }
                    break;
                case 4:
                    if (listaDispTot.size() != 0) {
                        do {
                            opcCuarto = JOptionPane.showOptionDialog(null, "¿Qué tipo de cuarto es? seleccione una opción: ", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, TipoCuarto, TipoCuarto[0]);
                            switch (opcCuarto + 1) {
                                case 1:
                                    
                                        j = JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a apagar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                        V = ver.numero(j);
                                    
                                    h = Integer.parseInt(j);
                                    for (int i = 0; i < h; i++) {
                                        opcDisp=JOptionPane.showOptionDialog(null, "Qué dispositivo desea apagar?", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, DispSala,DispSala[0]);
                                        Habitaciones sala = listaCuartos.get(0); // Obtener la Sala de Estar
                                        switch(opcDisp){
                                            case 1:
                                                String nombreaa;
                                                nombreaa = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexAA= listaDispTot.indexOf(nombreaa);
                                                
                                                listaDispTot.get(indexAA).Encender();
                                                break;
                                            case 2:
                                                String nombreluz;
                                                nombreluz = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexluz= listaDispTot.indexOf(nombreluz);
                                                listaDispTot.get(indexluz).Encender();
                                                break;    
                                        }                                       
                                    }
                                    break;
                                case 2:
                                    
                                        j = JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a apagar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                        V = ver.numero(j);
                                    
                                    h = Integer.parseInt(j);
                                    for (int i = 0; i < h; i++) {
                                        opcDisp=JOptionPane.showOptionDialog(null, "Qué dispositivo desea apagar?", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, DispSala,DispSala[0]);
                                        Habitaciones sala = listaCuartos.get(0); // Obtener la Sala de Estar
                                        switch(opcDisp){
                                            case 1:
                                                String nombreHorn;
                                                nombreHorn = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexHorn= listaDispTot.indexOf(nombreHorn);
                                                
                                                listaDispTot.get(indexHorn).Encender();
                                                break;
                                            case 2:
                                                String nombreCafe;
                                                nombreCafe = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexCafe= listaDispTot.indexOf(nombreCafe);
                                                
                                                listaDispTot.get(indexCafe).Encender();
                                                break;
                                                
                                            case 3:
                                                String nombreluzc;
                                                nombreluzc = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexluzc= listaDispTot.indexOf(nombreluzc);
                                                listaDispTot.get(indexluzc).Encender();
                                                break;   
                                        }                                       
                                    }
                                    break;
                                case 3:
                                   
                                        j = JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a apagar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                        V = ver.numero(j);
                                    
                                    h = Integer.parseInt(j);
                                    for (int i = 0; i < h; i++) {
                                        opcDisp=JOptionPane.showOptionDialog(null, "Qué dispositivo desea apagar?", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, DispSala,DispSala[0]);
                                        Habitaciones sala = listaCuartos.get(0); // Obtener la Sala de Estar
                                        switch(opcDisp){
                                            case 1:
                                                String nombreaad;
                                                nombreaad = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexAAd= listaDispTot.indexOf(nombreaad);
                                                
                                                listaDispTot.get(indexAAd).Encender();
                                                break;
                                            case 2:
                                                String nombreluzd;
                                                nombreluzd = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexluzd= listaDispTot.indexOf(nombreluzd);
                                                listaDispTot.get(indexluzd).Encender();
                                                break;    
                                        }                                       
                                    }
                                    break;
                            }
                        } while (opcCuarto != 4);
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR: registre primero un dispositivos para poder hacer esta acción", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, error);
                        break;
                    }
                    break;
                case 5:
                    if (listaCuartos.size() != 0) {
                        do {
                            opcCuarto = JOptionPane.showOptionDialog(null, "¿Qué tipo de cuarto es? seleccione una opción: ", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, TipoCuarto, TipoCuarto[0]);
                            switch (opcCuarto + 1) {
                                case 1:
                                    
                                        j = JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a consultar estado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                        V = ver.numero(j);
                                    
                                    h = Integer.parseInt(j);
                                    for (int i = 0; i < h; i++) {
                                        opcDisp=JOptionPane.showOptionDialog(null, "Qué dispositivo desea consultar?", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, DispSala,DispSala[0]);
                                        Habitaciones sala = listaCuartos.get(0); // Obtener la Sala de Estar
                                        switch(opcDisp){
                                            case 1:
                                                String nombreaa;
                                                nombreaa = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexAA= listaDispTot.indexOf(nombreaa);
                                                
                                                listaDispTot.get(indexAA).obtenerEstado();
                                                break;
                                            case 2:
                                                String nombreluz;
                                                nombreluz = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexluz= listaDispTot.indexOf(nombreluz);
                                                listaDispTot.get(indexluz).obtenerEstado();
                                                break;    
                                        }                                       
                                    }
                                    break;
                                case 2:
                                    
                                        j = JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a apagar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                        V = ver.numero(j);
                                    
                                    h = Integer.parseInt(j);
                                    for (int i = 0; i < h; i++) {
                                        opcDisp=JOptionPane.showOptionDialog(null, "Qué dispositivo desea apagar?", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, DispSala,DispSala[0]);
                                        Habitaciones sala = listaCuartos.get(0); // Obtener la Sala de Estar
                                        switch(opcDisp){
                                            case 1:
                                                String nombreHorn;
                                                nombreHorn = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexHorn= listaDispTot.indexOf(nombreHorn);
                                                
                                                listaDispTot.get(indexHorn).obtenerEstado();
                                                break;
                                            case 2:
                                                String nombreCafe;
                                                nombreCafe = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexCafe= listaDispTot.indexOf(nombreCafe);
                                                
                                                listaDispTot.get(indexCafe).obtenerEstado();
                                                break;
                                                
                                            case 3:
                                                String nombreluzc;
                                                nombreluzc = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexluzc= listaDispTot.indexOf(nombreluzc);
                                                listaDispTot.get(indexluzc).obtenerEstado();
                                                break;   
                                        }                                       
                                    }
                                    break;
                                case 3:
                                   
                                        j = JOptionPane.showInputDialog(null, "Ingrese el número de dispositivos a apagar: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                        V = ver.numero(j);
                                    
                                    h = Integer.parseInt(j);
                                    for (int i = 0; i < h; i++) {
                                        opcDisp=JOptionPane.showOptionDialog(null, "Qué dispositivo desea apagar?", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, cuartos, DispSala,DispSala[0]);
                                        Habitaciones sala = listaCuartos.get(0); // Obtener la Sala de Estar
                                        switch(opcDisp){
                                            case 1:
                                                String nombreaad;
                                                nombreaad = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de su Aire acondicionado: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexAAd= listaDispTot.indexOf(nombreaad);
                                                
                                                listaDispTot.get(indexAAd).obtenerEstado();
                                                break;
                                            case 2:
                                                String nombreluzd;
                                                nombreluzd = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de sus Luces Inteligentes: ", "Jaime, Navarro, Perez y Soto", JOptionPane.QUESTION_MESSAGE);
                                                int indexluzd= listaDispTot.indexOf(nombreluzd);
                                                listaDispTot.get(indexluzd).obtenerEstado();
                                                break;    
                                        }                                       
                                    }
                                    break;
                            }
                        } while (opcCuarto != 4);
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR: registre primero un dispositivo para poder hacer esta acción", "Jaime, Navarro, Perez y Soto", JOptionPane.DEFAULT_OPTION, error);
                        break;
                    }
                    break;
            }
        } while (n != 6);
    }
}
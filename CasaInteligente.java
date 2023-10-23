import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CasaInteligente {

    public static void main(String[] args) {
        ArrayList<Habitaciones> listaCuartos = new ArrayList<>();
        ArrayList<DispositivosInteligentes> listaDispTot = new ArrayList<>();

        int n;
        do {
            n = mostrarMenuPrincipal();

            switch (n) {
                case 1:
                    ingresarCuartos(listaCuartos);
                    break;
                case 2:
                    ingresarDispositivos(listaCuartos, listaDispTot);
                    break;
                case 3:
                    encenderDispositivo(listaDispTot);
                    break;
                case 4:
                    apagarDispositivo(listaDispTot);
                    break;
                case 5:
                    mostrarDispositivosEnHabitaciones(listaCuartos);
                    break;
                case 6:
                    mostrarDispositivosReproduciendo(listaDispTot);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. Hasta luego.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.", "Casa Inteligente", JOptionPane.WARNING_MESSAGE);
            }

        } while (n != 6);
    }

    public static int mostrarMenuPrincipal() {
        String[] MenuPpal = {"1. Ingresar cuartos", "2. Ingresar dispositivos a conectar", "3. Encender dispositivos", "4. Apagar dispositivos", "5. Mostrar dispositivos en habitaciones", "6. Salir"};

        return JOptionPane.showOptionDialog(null, "Seleccione lo que guste realizar: ", "Casa Inteligente", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, MenuPpal, MenuPpal[0]) + 1;
    }

    public static void mostrarDispositivosEnHabitaciones(ArrayList<Habitaciones> listaCuartos) {
        if (listaCuartos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuartos registrados para mostrar dispositivos.", "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StringBuilder mensaje = new StringBuilder("Dispositivos en cada habitación:\n");

        for (Habitaciones cuarto : listaCuartos) {
            mensaje.append(cuarto.getNombre()).append(":\n");

            DispositivosInteligentes[] dispositivos = cuarto.getDispositivosInteligentes();

            for (DispositivosInteligentes dispositivo : dispositivos) {
                if (dispositivo != null) {
                    mensaje.append("Nombre: ").append(dispositivo.getNombre()).append(", Estado: ");
                    mensaje.append(dispositivo.obtenerEstado() ? "Encendido" : "Apagado").append("\n");
                }
            }

            mensaje.append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void ingresarCuartos(ArrayList<Habitaciones> listaCuartos) {
        String[] TipoCuarto = {"Sala de estar", "Cocina", "Dormitorio"};
        boolean volverAlMenu = false;

        do {
            String nombreCuarto = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre del cuarto: ", "Casa Inteligente", JOptionPane.QUESTION_MESSAGE);
            int tipoCuarto = mostrarMenuTipoCuarto(TipoCuarto);

            if (tipoCuarto >= 0) {
                int maxDispositivos = verNumero("Ingrese la cantidad máxima de dispositivos inteligentes para esta habitación: ");
                ingresarCuarto(listaCuartos, tipoCuarto, nombreCuarto, maxDispositivos);
            } else {
                volverAlMenu = true;
            }

        } while (!volverAlMenu);
    }

    public static int mostrarMenuTipoCuarto(String[] tipos) {
        String message = "¿Qué tipo de cuarto es? Seleccione una opción:";
        String title = "Casa Inteligente";
        return JOptionPane.showOptionDialog(null, message, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);
    }

    public static void ingresarCuarto(ArrayList<Habitaciones> listaCuartos, int tipoCuarto, String nombreCuarto, int maxDispositivos) {
        int numCuartos = verNumero("Ingrese el número de cuartos a registrar: ");

        for (int i = 0; i < numCuartos; i++) {
            Habitaciones cuarto = null;

            switch (tipoCuarto) {
                case 0:
                    cuarto = new Saladeestar(nombreCuarto, maxDispositivos);
                    break;
                case 1:
                    cuarto = new Cocina(nombreCuarto, maxDispositivos);
                    break;
                case 2:
                    cuarto = new Dormitorio(nombreCuarto, maxDispositivos);
                    break;
            }

            if (cuarto != null) {
                listaCuartos.add(cuarto);
            }
        }
    }

    public static void ingresarDispositivos(ArrayList<Habitaciones> listaCuartos, ArrayList<DispositivosInteligentes> listaDispTot) {
        if (listaCuartos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR: Registre primero un cuarto para poder hacer esta acción.", "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] tiposCuarto = listaCuartos.stream()
            .map(cuarto -> cuarto.getClass().getSimpleName())
            .distinct()
            .toArray(String[]::new);

        int tipoCuarto = mostrarMenuTipoCuarto(tiposCuarto);

        if (tipoCuarto >= 0) {
            Habitaciones cuarto = listaCuartos.stream()
                .filter(c -> c.getClass().getSimpleName().equals(tiposCuarto[tipoCuarto]))
                .findFirst()
                .orElse(null);

            int numDispositivos = verNumero("Ingrese el número de dispositivos a registrar: ");

            for (int i = 0; i < numDispositivos; i++) {
                String nombreDispositivo = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre del dispositivo: ", "Casa Inteligente", JOptionPane.QUESTION_MESSAGE);
                int idDispositivo = verNumero("Ingrese el ID del dispositivo o presione 0 para asignar automáticamente: ");
                
                if (idDispositivo == 0) {
                    idDispositivo = listaDispTot.size() + 1;
                }

                DispositivosInteligentes dispositivo = new DispositivosInteligentes(idDispositivo, nombreDispositivo);
                cuarto.addDispositivosInteligentes(dispositivo);
                listaDispTot.add(dispositivo);
            }
        }
    }

    public static void encenderDispositivo(ArrayList<DispositivosInteligentes> listaDispTot) {
        if (listaDispTot.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay dispositivos registrados para encender.", "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idDispositivo = verNumero("Ingrese el ID del dispositivo a encender: ");

        for (DispositivosInteligentes dispositivo : listaDispTot) {
            if (dispositivo.getId() == idDispositivo) {
                dispositivo.encender();
                JOptionPane.showMessageDialog(null, "El dispositivo ha sido encendido.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "No se encontró el dispositivo de ID " + idDispositivo, "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
    }

    public static void apagarDispositivo(ArrayList<DispositivosInteligentes> listaDispTot) {
        if (listaDispTot.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay dispositivos registrados para apagar.", "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idDispositivo = verNumero("Ingrese el ID del dispositivo a apagar: ");

        for (DispositivosInteligentes dispositivo : listaDispTot) {
            if (dispositivo.getId() == idDispositivo) {
                dispositivo.apagar();
                JOptionPane.showMessageDialog(null, "El dispositivo ha sido apagado.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "No se encontró el dispositivo de ID " + idDispositivo, "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
    }

    public static int verNumero(String mensaje) {
        int numero = 0;
        boolean esNumeroValido = false;

        do {
            String input = JOptionPane.showInputDialog(null, mensaje, "Casa Inteligente", JOptionPane.QUESTION_MESSAGE);

            try {
                numero = Integer.parseInt(input);
                esNumeroValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Casa Inteligente", JOptionPane.WARNING_MESSAGE);
            }

        } while (!esNumeroValido);

        return numero;
    }

    public static void mostrarDispositivosReproduciendo(ArrayList<DispositivosInteligentes> listaDispTot) {
        if (listaDispTot.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay dispositivos registrados para mostrar el estado de reproducción.", "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StringBuilder mensaje = new StringBuilder("Dispositivos encendidos:\n");

        for (DispositivosInteligentes dispositivo : listaDispTot) {
            if (dispositivo.obtenerEstado()) {
                mensaje.append("Nombre: ").append(dispositivo.getNombre()).append(", Estado de reproducción: Encendido\n");
            }
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
    }
}

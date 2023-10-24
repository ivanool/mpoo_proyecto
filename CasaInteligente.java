package proyectocasainte;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Clase que representa una casa inteligente con la capacidad de registrar habitaciones y dispositivos inteligentes en ellas.
 */
public class CasaInteligente {

    /**
     * Método principal que ejecuta el programa de la casa inteligente.
     * @param args argumentos de línea de comandos (no se utilizan en este programa)
     */
    public static void main(String[] args) {
        // Crea dos listas para almacenar las habitaciones y los dispositivos inteligentes de la casa inteligente
        ArrayList<Habitaciones> listaCuartos = new ArrayList<>();
        ArrayList<DispositivosInteligentes> listaDispTot = new ArrayList<>();

        int n;
        // Muestra el menú principal y ejecuta la acción seleccionada por el usuario hasta que seleccione la opción de salir
        do {
            n = mostrarMenuPrincipal();

            switch (n) {
                case 1:
                    // Si el usuario selecciona la opción de ingresar cuarto, llama a la función ingresarCuartos
                    ingresarCuartos(listaCuartos);
                    break;
                case 2:
                    // Si el usuario selecciona la opción de ingresar dispositivos, llama a la función ingresarDispositivos
                    ingresarDispositivos(listaCuartos, listaDispTot);
                    break;
                case 3:
                    // Si el usuario selecciona la opción de encender dispositivos, llama a la función encenderDispositivo
                    encenderDispositivo(listaDispTot);
                    break;
                case 4:
                    // Si el usuario selecciona la opción de apagar dispositivos, llama a la función apagarDispositivo
                    apagarDispositivo(listaDispTot);
                    break;
                case 5:
                    // Si el usuario selecciona la opción de mostrar dispositivos en habitaciones, llama a la función mostrarDispositivosEnHabitaciones
                    mostrarDispositivosEnHabitaciones(listaCuartos);
                    break;
                case 6:
                    // Si el usuario selecciona la opción de salir, muestra un mensaje de despedida y sale del programa
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. Hasta luego.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    // Si el usuario selecciona una opción inválida, muestra un mensaje de advertencia
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.", "Casa Inteligente", JOptionPane.WARNING_MESSAGE);
            }

        } while (n != 6);
    }

    /**
     * Muestra el menú principal del programa y devuelve la opción seleccionada por el usuario.
     * @return la opción seleccionada por el usuario
     */
    // Función para mostrar un cuadro de diálogo con opciones para seleccionar una acción a realizar en la casa inteligente
    public static int mostrarMenuPrincipal() {
        // Crea un arreglo con las opciones disponibles en el menú principal
        String[] MenuPpal = {"1. Ingresar cuarto", "2. Ingresar dispositivos a conectar", "3. Encender dispositivos", "4. Apagar dispositivos", "5. Mostrar dispositivos en habitaciones", "6. Salir"};

        // Muestra el cuadro de diálogo con las opciones y devuelve el índice de la opción seleccionada más uno (para que coincida con el número de opción)
        return JOptionPane.showOptionDialog(
                null, "Seleccione lo que guste realizar: ", "Casa Inteligente", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, MenuPpal, MenuPpal[0]) + 1;
    }

    /**
     * Muestra los dispositivos en cada habitación registrada en la casa inteligente.
     * @param listaCuartos la lista de habitaciones registradas en la casa inteligente
     */
    // Función para mostrar una lista de los dispositivos inteligentes en cada habitación de la casa inteligente
    public static void mostrarDispositivosEnHabitaciones(ArrayList<Habitaciones> listaCuartos) {
        // Si no hay habitaciones registradas, muestra un mensaje de error y sale de la función
        if (listaCuartos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay cuartos registrados para mostrar dispositivos.", "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crea un StringBuilder para almacenar el mensaje que se mostrará al usuario
        StringBuilder mensaje = new StringBuilder("Dispositivos en cada habitación:\n");

        // Recorre la lista de habitaciones y agrega los dispositivos de cada habitación al mensaje
        for (Habitaciones cuarto : listaCuartos) {
            mensaje.append(cuarto.getNombre()).append(":\n");

            // Obtiene los dispositivos de la habitación
            DispositivosInteligentes[] dispositivos = cuarto.getDispositivosInteligentes();

            // Recorre los dispositivos de la habitación y agrega su información al mensaje
            for (DispositivosInteligentes dispositivo : dispositivos) {
                if (dispositivo != null) {
                    mensaje.append("Nombre: ").append(dispositivo.getNombre()).append(", Estado: ");
                    mensaje.append(dispositivo.obtenerEstado() ? "Encendido" : "Apagado").append(", ");

                    // Si el dispositivo es un termostato inteligente, agrega su temperatura al mensaje
                    if (dispositivo instanceof TermostatoInte) {
                        mensaje.append("Temperatura: ").append(((TermostatoInte) dispositivo).getTemperatura()).append("°C, ");
                    }

                    mensaje.append("\n");
                }
            }

            mensaje.append("\n");
        }

        // Muestra el mensaje con la lista de dispositivos en cada habitación
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Permite al usuario ingresar una nueva habitación en la casa inteligente.
     * @param listaCuartos la lista de habitaciones registradas en la casa inteligente
     */
    // Función para ingresar una habitación a una casa inteligente
    public static void ingresarCuartos(ArrayList<Habitaciones> listaCuartos) {
        // Crea un arreglo con los tipos de habitaciones disponibles
        String[] TipoCuarto = {"Sala de estar", "Cocina", "Dormitorio"};

        // Pide al usuario que ingrese el nombre de la habitación
        String nombreCuarto = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre del cuarto: ", "Casa Inteligente", JOptionPane.QUESTION_MESSAGE);

        // Muestra un cuadro de diálogo para que el usuario seleccione el tipo de habitación
        int tipoCuarto = mostrarMenuTipoCuarto(TipoCuarto);

        // Si el usuario selecciona un tipo de habitación, continúa con el proceso
        if (tipoCuarto >= 0) {
            // Pide al usuario que ingrese la cantidad máxima de dispositivos inteligentes para la habitación
            int maxDispositivos = verNumero("Ingrese la cantidad máxima de dispositivos inteligentes para esta habitación: ");

            // Crea la habitación con los datos ingresados por el usuario y la agrega a la lista de habitaciones
            ingresarCuarto(listaCuartos, tipoCuarto, nombreCuarto, maxDispositivos);
        }
    }

    /**
     * Muestra el menú para seleccionar el tipo de habitación a registrar.
     * @param tipos los tipos de habitaciones disponibles
     * @return el índice del tipo de habitación seleccionado
     */
    // Función para mostrar un cuadro de diálogo con opciones para seleccionar el tipo de habitación
    public static int mostrarMenuTipoCuarto(String[] tipos) {
        // Crea un mensaje para el cuadro de diálogo
        String message = "¿Qué tipo de cuarto es? Seleccione una opción:";

        // Crea un título para el cuadro de diálogo
        String title = "Casa Inteligente";

        // Muestra el cuadro de diálogo con las opciones y devuelve el índice de la opción seleccionada
        return JOptionPane.showOptionDialog(
                null, message, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);
    }

    /**
     * Registra una nueva habitación en la casa inteligente.
     * @param listaCuartos la lista de habitaciones registradas en la casa inteligente
     * @param tipoCuarto el índice del tipo de habitación seleccionado
     * @param nombreCuarto el nombre de la habitación a registrar
     * @param maxDispositivos la cantidad máxima de dispositivos inteligentes que se pueden conectar en la habitación
     */
    // Función para ingresar una habitación a una casa inteligente
    public static void ingresarCuarto(ArrayList<Habitaciones> listaCuartos, int tipoCuarto, String nombreCuarto, int maxDispositivos) {
        // Crea una variable para almacenar la habitación
        Habitaciones cuarto = null;

        // Crea la habitación dependiendo del tipo seleccionado por el usuario
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

        // Si se creó la habitación correctamente, la agrega a la lista de habitaciones y muestra un mensaje de éxito
        if (cuarto != null) {
            listaCuartos.add(cuarto);
            JOptionPane.showMessageDialog(null, "El cuarto " + cuarto.getNombre() + " se ha registrado con éxito.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    // Función para ingresar dispositivos inteligentes a una casa inteligente
    public static void ingresarDispositivos(ArrayList<Habitaciones> listaCuartos, ArrayList<DispositivosInteligentes> listaDispTot) {
        // Si no hay habitaciones registradas, muestra un mensaje de error y sale de la función
        if (listaCuartos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR: Registre primero un cuarto para poder hacer esta acción.", "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Muestra un cuadro de diálogo para que el usuario seleccione la subclase del dispositivo inteligente
        String[] subclases = {"Aire Acondicionado", "Cafetera", "Horno", "Luces Inteligentes", "Termostato Inteligente", "Seguridad Inteligente"};
        int seleccionSubclase = JOptionPane.showOptionDialog(
                null, "Seleccione la subclase de dispositivo inteligente:", "Casa Inteligente", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, subclases, subclases[0]);

        // Si el usuario selecciona una subclase, continúa con el proceso
        if (seleccionSubclase >= 0) {
            String subclaseSeleccionada = subclases[seleccionSubclase];

            // Crea una variable para almacenar el dispositivo inteligente
            DispositivosInteligentes dispositivo = null;

            // Pide al usuario que ingrese el ID del dispositivo o presione 0 para asignar automáticamente
            int idDispositivo = verNumero("Ingrese el ID del dispositivo o presione 0 para asignar automáticamente: ");

            // Pide al usuario que ingrese el nombre del dispositivo
            String nombreDispositivo = JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre del dispositivo: ", "Casa Inteligente", JOptionPane.QUESTION_MESSAGE);

            // Crea un arreglo con las habitaciones disponibles
            String[] habitacionesDisponibles = new String[listaCuartos.size()];
            for (int i = 0; i < listaCuartos.size(); i++) {
                habitacionesDisponibles[i] = listaCuartos.get(i).getNombre();
            }

            // Pide al usuario que seleccione la habitación a la que desea asignar el dispositivo
            String habitacionElegida = (String) JOptionPane.showInputDialog(null, "Seleccione la habitación a la que desea asignar el dispositivo:", "Casa Inteligente", JOptionPane.QUESTION_MESSAGE, null, habitacionesDisponibles, habitacionesDisponibles[0]);

            // Si el usuario selecciona una habitación, continúa con el proceso
            if (habitacionElegida != null) {
                for (Habitaciones cuarto : listaCuartos) {
                    if (cuarto.getNombre().equals(habitacionElegida)) {
                        // Si la subclase seleccionada es "Termostato Inteligente", pide al usuario que ingrese la temperatura deseada
                        if (subclaseSeleccionada.equals("Termostato Inteligente")) {
                            int temperatura = verNumero("Ingrese la temperatura deseada: ");
                            dispositivo = new TermostatoInte(idDispositivo, nombreDispositivo, false, temperatura);
                        } else {
                            dispositivo = new DispositivosInteligentes(idDispositivo, nombreDispositivo, false);
                        }

                        // Si se creó el dispositivo correctamente, lo agrega a la habitación y a la lista de dispositivos totales
                        if (dispositivo != null) {
                            cuarto.addDispositivosInteligentes(dispositivo);
                            listaDispTot.add(dispositivo);

                            // Muestra un mensaje de éxito dependiendo del tipo de dispositivo
                            if (dispositivo instanceof TermostatoInte) {
                                JOptionPane.showMessageDialog(null, "El dispositivo " + dispositivo.getNombre() + " se ha registrado con éxito en la habitación " + cuarto.getNombre() + " con temperatura establecida en " + ((TermostatoInte) dispositivo).getTemperatura() + "°C.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "El dispositivo " + dispositivo.getNombre() + " se ha registrado con éxito en la habitación " + cuarto.getNombre(), "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
    }

// Función para encender un dispositivo inteligente en la casa inteligente
public static void encenderDispositivo(ArrayList<DispositivosInteligentes> listaDispTot) {
    // Si no hay dispositivos registrados, muestra un mensaje de error y sale de la función
    if (listaDispTot.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay dispositivos registrados para encender.", "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Pide al usuario que ingrese el ID del dispositivo a encender
    int idDispositivo = verNumero("Ingrese el ID del dispositivo a encender: ");

    // Busca el dispositivo en la lista de dispositivos y lo enciende si lo encuentra
    for (DispositivosInteligentes dispositivo : listaDispTot) {
        if (dispositivo.getId() == idDispositivo) {
            dispositivo.encender();
            // Si el dispositivo es un termostato inteligente, pide al usuario que ingrese la nueva temperatura deseada y la establece
            if (dispositivo instanceof TermostatoInte) {
                int nuevaTemperatura = verNumero("Ingrese la nueva temperatura deseada: ");
                ((TermostatoInte) dispositivo).setTemperatura(nuevaTemperatura);
                JOptionPane.showMessageDialog(null, "El dispositivo ha sido encendido y la temperatura se ha establecido en " + nuevaTemperatura + "°C.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El dispositivo ha sido encendido.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
            }
            return;
        }
    }

    // Si no se encuentra el dispositivo, muestra un mensaje de error
    JOptionPane.showMessageDialog(null, "No se encontró el dispositivo de ID " + idDispositivo, "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
}

    // Función para apagar un dispositivo inteligente en la casa inteligente
    public static void apagarDispositivo(ArrayList<DispositivosInteligentes> listaDispTot) {
        // Si no hay dispositivos registrados, muestra un mensaje de error y sale de la función
        if (listaDispTot.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay dispositivos registrados para apagar.", "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Pide al usuario que ingrese el ID del dispositivo a apagar
        int idDispositivo = verNumero("Ingrese el ID del dispositivo a apagar: ");

        // Busca el dispositivo en la lista de dispositivos y lo apaga si lo encuentra
        for (DispositivosInteligentes dispositivo : listaDispTot) {
            if (dispositivo.getId() == idDispositivo) {
                dispositivo.apagar();
                JOptionPane.showMessageDialog(null, "El dispositivo ha sido apagado.", "Casa Inteligente", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        // Si no se encuentra el dispositivo, muestra un mensaje de error
        JOptionPane.showMessageDialog(null, "No se encontró el dispositivo de ID " + idDispositivo, "Casa Inteligente", JOptionPane.ERROR_MESSAGE);
    }

    // Función para pedir al usuario que ingrese un número entero
    public static int verNumero(String mensaje) {
        // Inicializa la variable que almacenará el número ingresado y la bandera que indica si el número es válido
        int numero = 0;
        boolean esNumeroValido = false;

        // Repite el proceso de pedir al usuario que ingrese un número hasta que ingrese un número válido
        do {
            // Muestra un cuadro de diálogo para que el usuario ingrese el número
            String input = JOptionPane.showInputDialog(null, mensaje, "Casa Inteligente", JOptionPane.QUESTION_MESSAGE);

            try {
                // Intenta convertir el número ingresado a un entero y establece la bandera en verdadero si es válido
                numero = Integer.parseInt(input);
                esNumeroValido = true;
            } catch (NumberFormatException e) {
                // Si el número no es válido, muestra un mensaje de advertencia
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Casa Inteligente", JOptionPane.WARNING_MESSAGE);
            }

        } while (!esNumeroValido);

        // Devuelve el número ingresado
        return numero;
    }
}
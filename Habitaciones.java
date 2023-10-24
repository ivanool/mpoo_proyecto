package proyectocasainte;

// Declaración del paquete en el que se encuentra la clase.
public class Habitaciones {
    // Declaración de variables de instancia protegidas.
    // "nombre" es una cadena que representa el nombre de la habitación.
    // "dispositivosInteligentes" es una matriz de objetos de tipo "DispositivosInteligentes" que almacena los dispositivos en la habitación.
    // "numDispositivosInteligentes" es un entero que lleva el seguimiento del número actual de dispositivos en la habitación.

    // Constructor predeterminado de la clase Habitaciones (no toma argumentos).
    protected Habitaciones() {
        // El constructor predeterminado está vacío, por lo que no realiza ninguna acción específica.
    }

    // Constructor que toma un nombre y el número máximo de dispositivos inteligentes permitidos en la habitación.
    protected Habitaciones(String nombre, int maxDispositivosInteligentes) {
        this.nombre = nombre; // Asigna el nombre proporcionado a la variable "nombre".
        this.dispositivosInteligentes = new DispositivosInteligentes[maxDispositivosInteligentes];
        // Inicializa una matriz para almacenar dispositivos inteligentes con la longitud especificada.
        this.numDispositivosInteligentes = 0; // Inicializa el contador de dispositivos en 0.
    }

    // Método para agregar un dispositivo inteligente a la habitación.
    public void addDispositivosInteligentes(DispositivosInteligentes dispositivo) {
        if (numDispositivosInteligentes < dispositivosInteligentes.length) {
            // Verifica si el número de dispositivos en la habitación es menor que el máximo permitido.
            dispositivosInteligentes[numDispositivosInteligentes] = dispositivo;
            // Agrega el dispositivo a la matriz de dispositivos.
            numDispositivosInteligentes++; // Incrementa el contador de dispositivos.
        } else {
            System.out.println("No se pueden agregar más dispositivos inteligentes.");
            // Imprime un mensaje si la habitación está llena y no se pueden agregar más dispositivos.
        }
    }

    // Método para eliminar un dispositivo inteligente de la habitación.
    public void removeDispositivosInteligentes(DispositivosInteligentes dispositivo) {
        for (int i = 0; i < numDispositivosInteligentes; i++) {
            // Recorre la lista de dispositivos en la habitación.
            if (dispositivosInteligentes[i] == dispositivo) {
                // Compara cada dispositivo con el que se quiere eliminar.
                for (int j = i; j < numDispositivosInteligentes - 1; j++) {
                    // Desplaza los dispositivos posteriores para llenar el espacio del dispositivo eliminado.
                    dispositivosInteligentes[j] = dispositivosInteligentes[j + 1];
                }
                dispositivosInteligentes[numDispositivosInteligentes - 1] = null;
                // Establece el último elemento de la matriz en nulo.
                numDispositivosInteligentes--; // Decrementa el contador de dispositivos.
                return;
            }
        }
        System.out.println("El dispositivo inteligente no se encontró en la habitación.");
        // Imprime un mensaje si el dispositivo no se encuentra en la habitación.
    }

    // Método para obtener la lista de dispositivos inteligentes en la habitación.
    public DispositivosInteligentes[] getDispositivosInteligentes() {
        return dispositivosInteligentes; // Devuelve la matriz de dispositivos en la habitación.
    }

    // Método para obtener el nombre de la habitación.
    public String getNombre() {
        System.out.println(nombre); // Imprime el nombre de la habitación.
        return nombre; // Devuelve el nombre de la habitación.
    }
}

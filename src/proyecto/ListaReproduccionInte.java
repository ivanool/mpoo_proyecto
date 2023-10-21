package proyecto;

import java.util.ArrayList;
import java.util.List;

public class ListaReproduccionInte extends DispositivosInteligentes {
    private List<String> listaReproduccion;
    private boolean reproduciendo;

    public ListaReproduccionInte(int id,String nombre) {
        super(id,nombre);
        listaReproduccion = new ArrayList<>();
        reproduciendo = false;
    }

    public void Reproducir() {
        if (!listaReproduccion.isEmpty()) {
            reproduciendo = true;
            System.out.println("Reproduciendo " + listaReproduccion.get(0));
        } else {
            System.out.println("La lista de reproducción está vacía.");
        }
    }

    public void Pausar() {
        reproduciendo = false;
        System.out.println("Reproducción en pausa");
    }

    public void Detener() {
        reproduciendo = false;
        System.out.println("Reproducción detenida");
    }

    public void CambiarListaReproduccion(List<String> nuevaLista) {
        listaReproduccion = nuevaLista;
        System.out.println("Lista de reproducción actualizada");
    }

    public void AgregarCancionALista(String cancion) {
        listaReproduccion.add(cancion);
        System.out.println("Canción " + cancion + " agregada a la lista de reproducción");
    }
}

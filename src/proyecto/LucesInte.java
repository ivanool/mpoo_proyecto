package proyecto;

public class LucesInte extends DispositivosInteligentes{
    //Atributos
    private int intensidad;
    private String color;
    //Constructores
    public LucesInte(int id,String nombre) {
        super(id,nombre);
        this.intensidad = 0;
        this.color = "Blanco";
    }
    //Metodos
    
    // Método para ajustar la intensidad de las luces
    public void AjustarIntensidad(int nuevaIntensidad) {
        this.intensidad = nuevaIntensidad;
        System.out.println("Intensidad de " + this.nombre + " ajustada a " + this.intensidad);
    }    
    // Método para cambiar el color de las luces
    public void CambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("Color de " + this.nombre + " cambiado a " + this.color);
    }
    // Método para obtener la intensidad actual de las luces
    public int ObtenerIntensidad() {
        return intensidad;
    }

    // Método para obtener el color actual de las luces
    public String ObtenerColor() {
        return color;
    }
    // Método para mostrar el estado actual de las luces (incluyendo intensidad y color)
    public void MostrarEstado() {
        String estado = obtenerEstado() ? "encendidas" : "apagadas";
        System.out.println(this.nombre + " están " + estado + " con intensidad " + this.intensidad + " y color " + this.color);
    }
    
}
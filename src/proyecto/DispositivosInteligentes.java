package proyecto;

public class DispositivosInteligentes {
    //Atributos
    protected int idDispositivo;
    protected String nombre;
    protected boolean encendido;
    //Constructores
    public DispositivosInteligentes(int id, String nombre) {
        this.idDispositivo = id;
        this.nombre = nombre;
        this.encendido = false;
    }
    //Metodos
    public void Encender() {
        encendido = true;
        System.out.println(nombre + " encendido");
    }
    public void Apagar() {
        encendido = false;
        System.out.println(nombre + " apagado");
    }
    public boolean obtenerEstado() {
        return encendido;
    }
    public void EstablecerEstado(boolean estado) {
        encendido = estado;
    }
    public int getId() {
        return idDispositivo;
    }
}

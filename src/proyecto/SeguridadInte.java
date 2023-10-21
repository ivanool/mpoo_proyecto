package proyecto;
public class SeguridadInte extends DispositivosInteligentes{
    private boolean activada;

    public SeguridadInte(int id,String nombre) {
        super(id,nombre);
        this.activada = false;
    }

    public void ActivarSeguridad() {
        activada = true;
        System.out.println("Seguridad activada en " + this.nombre);
    }

    public void DesactivarSeguridad() {
        activada = false;
        System.out.println("Seguridad desactivada en " + this.nombre);
    }
}
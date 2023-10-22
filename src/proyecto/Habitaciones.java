import java.util.ArrayList;

public class Habitacion(){
    protected String nombre;
    protected ArrayList<DispositivosInteligentes> dispositivosInteligentes;

    Habitacion(String nombre){
        this.nombre = nombre;
        this.dispositivosInteligentes = new ArrayList<DispositivosInteligentes>();
    }

    public void addDispositivoInteligente(DispositivosInteligentes dispositivoInteligente){
        this.dispositivosInteligentes.add(dispositivoInteligente);
    }

    public void removeDispositivoInteligente(DispositivosInteligentes dispositivoInteligente){
        this.dispositivosInteligentes.remove(dispositivoInteligente);
    }

    public void encender_luces(){
        
    }

    public void apagar_luces(){
        
    }

    public void configurar_temperatura(int temperatura){
        
    }

    public void controlar_iluminacion(){
        
    }

    
}
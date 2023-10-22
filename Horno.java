

public class Horno extends DispositivosInteligentes{
    public Horno(int id, String nombre){
        super(id, nombre);
    }

    @Override
    public void encender(){
        System.out.println("Horno encendido");
    }

    @Override
    public void apagar(){
        System.out.println("Horno apagado");
    }

}
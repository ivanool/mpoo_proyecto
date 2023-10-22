public class Horno extends DispositivosInteligentes{
    public Horno(int id, String nombre){
        super(id, nombre);
    }

    public void encender(){
        System.out.println("Horno encendido");
    }

    public void apagar(){
        System.out.println("Horno apagado");
    }
}
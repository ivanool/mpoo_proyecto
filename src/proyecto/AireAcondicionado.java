public class AireAcondicionado extends DispositivosInteligentes{
    public AireAcondicionado(int id, String nombre){
        super(id, nombre);
    }

    public void encender(){
        System.out.println("Aire acondicionado encendido");
    }

    public void apagar(){
        System.out.println("Aire acondicionado apagado");
    }
}
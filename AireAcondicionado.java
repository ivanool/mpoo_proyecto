
public class AireAcondicionado extends DispositivosInteligentes{
    public AireAcondicionado(int id, String nombre){
        super(id, nombre);
    }

    @Override
    public void encender(){
        System.out.println("Aire acondicionado encendido");
    }

    @Override
    public void apagar(){
        System.out.println("Aire acondicionado apagado");
    }
}

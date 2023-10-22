package proyectocasainte;
public class Cafetera extends DispositivosInteligentes{
    public Cafetera(int id, String nombre){
        super(id, nombre);
    }

    @Override
    public void encender(){
        System.out.println("Cafetera encendida");
    }

    @Override
    public void apagar(){
        System.out.println("Cafetera apagada");
    }
}

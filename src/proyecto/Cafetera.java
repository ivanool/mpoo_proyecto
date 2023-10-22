public class Cafetera extends DispositivosInteligentes{
    public Cafetera(int id, String nombre){
        super(id, nombre);
    }

    public void encender(){
        System.out.println("Cafetera encendida");
    }

    public void apagar(){
        System.out.println("Cafetera apagada");
    }
}
package proyecto;
public class TermostatoInte extends DispositivosInteligentes {
    private int temperaturaDeseada;

    public TermostatoInte(int id,String nombre) {
        super(id ,nombre);
        this.temperaturaDeseada = 25; // Temperatura por defecto
    }

    public void EstablecerTemperaturaDeseada(int nuevaTemperatura) {
        this.temperaturaDeseada = nuevaTemperatura;
        System.out.println("Temperatura deseada de " + this.nombre + " establecida a " + this.temperaturaDeseada + "°C");
    }
}

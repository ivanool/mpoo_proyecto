
import java.util.ArrayList;

public class Cocina extends Habitaciones {

    public Cocina(String nombre, int maxDispositivosInteligentes) {
        super(nombre, maxDispositivosInteligentes);
    }

    public void encender_horno() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof Horno horno) {
                horno.encender();
            }
        }
    }

    public void apagar_horno() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof Horno horno) {
                horno.apagar();
            }
        }
    }

    @Override
    public void encender_luces() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof LucesInte lucesInte) {
                lucesInte.encender();
            }
        }
    }

    @Override
    public void apagar_luces() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof LucesInte lucesInte) {
                lucesInte.apagar();
            }
        }
    }

    public void encender_cafetera() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof Cafetera cafetera) {
                cafetera.encender();
            }
        }
    }

    public void apagar_cafetera() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof Cafetera cafetera) {
                cafetera.apagar();
            }
        }
    }
}
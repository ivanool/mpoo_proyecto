import java.util.ArrayList;

public class Cocina extends Habitaciones {

    public Cocina(String nombre, int maxDispositivosInteligentes) {
        super(nombre, maxDispositivosInteligentes);
    }

    public void encender_horno() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof Horno) {
                ((Horno) dispositivo).encender();
            }
        }
    }

    public void apagar_horno() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof Horno) {
                ((Horno) dispositivo).apagar();
            }
        }
    }

    public void encender_luces() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof LucesInte) {
                ((LucesInte) dispositivo).encender();
            }
        }
    }

    public void apagar_luces() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof LucesInte) {
                ((LucesInte) dispositivo).apagar();
            }
        }
    }

    public void encender_cafetera() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof Cafetera) {
                ((Cafetera) dispositivo).encender();
            }
        }
    }

    public void apagar_cafetera() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof Cafetera) {
                ((Cafetera) dispositivo).apagar();
            }
        }
    }
}

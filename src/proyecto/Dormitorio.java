import java.util.ArrayList;

public class Dormitorio extends Habitaciones {
    public Dormitorio(String nombre, int maxDispositivosInteligentes) {
        super(nombre, maxDispositivosInteligentes);
    }

    public void encender_aire_acondicionado() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof AireAcondicionado) {
                ((AireAcondicionado) dispositivo).encender();
            }
        }
    }

    public void apagar_aire_acondicionado() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof AireAcondicionado) {
                ((AireAcondicionado) dispositivo).apagar();
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
}

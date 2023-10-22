package proyectocasainte;
import java.util.ArrayList;

public class Saladeestar extends Habitaciones {
    
    public Saladeestar(String nombre, int maxDispositivosInteligentes) {
        super(nombre,maxDispositivosInteligentes);
    }

     public void encender_aire_acondicionado() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof AireAcondicionado aireAcondicionado) {
                aireAcondicionado.encender();
            }
        }
    }

   public void apagar_aire_acondicionado() {
        for (DispositivosInteligentes dispositivo : dispositivosInteligentes) {
            if (dispositivo instanceof AireAcondicionado aireAcondicionado) {
                aireAcondicionado.apagar();
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
}
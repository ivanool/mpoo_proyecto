public class Dormitorio extends Habitacion{
    public Dormitorio(String nombre){
        super(nombre);
    }

    public void encender_aire_acondicionado(){
        List<DispositivoInteligente> dispositivos = this.getDispositivosInteligentes();

        for (DispositivoInteligente dispositivo : dispositivos) {
            if (dispositivo instanceof AireAcondicionado) {
                dispositivo.setEstado("encendido");
                ((AireAcondicionado) dispositivo).encender();
            }
        }
    }

    public void apagar_aire_acondicionado(){
        List<DispositivoInteligente> dispositivos = this.getDispositivosInteligentes();

        for (DispositivoInteligente dispositivo : dispositivos) {
            if (dispositivo instanceof AireAcondicionado) {
                dispositivo.setEstado("apagado");
                ((AireAcondicionado) dispositivo).apagar();
            }
        }
    }

    public void encender_luces(){
        List<DispositivoInteligente> dispositivos = this.getDispositivosInteligentes();

        for (DispositivoInteligente dispositivo : dispositivos) {
            if (dispositivo instanceof Luz) {
                dispositivo.setEstado("encendido");
                ((Luz) dispositivo).encender();
            }
        }
    }

    public void apagar_luces(){
        List<DispositivoInteligente> dispositivos = this.getDispositivosInteligentes();

        for (DispositivoInteligente dispositivo : dispositivos) {
            if (dispositivo instanceof Luz) {
                dispositivo.setEstado("apagado");
                ((Luz) dispositivo).apagar();
            }
        }
    }

    public void encender_televisor(){
        List<DispositivoInteligente> dispositivos = this.getDispositivosInteligentes();

        for (DispositivoInteligente dispositivo : dispositivos) {
            if (dispositivo instanceof Televisor) {
                dispositivo.setEstado("encendido");
                ((Televisor) dispositivo).encender();
            }
        }
    }

    public void apagar_televisor(){
        List<DispositivoInteligente> dispositivos = this.getDispositivosInteligentes();

        for (DispositivoInteligente dispositivo : dispositivos) {
            if (dispositivo instanceof Televisor) {
                dispositivo.setEstado("apagado");
                ((Televisor) dispositivo).apagar();
            }
        }
    }
}
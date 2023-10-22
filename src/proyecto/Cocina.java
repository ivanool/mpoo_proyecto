public class Cocina extends Habitacion{
    public Cocina(String nombre){
        super(nombre);
    }

    public void encender_horno(){
        List<DispositivoInteligente> dispositivos = this.getDispositivosInteligentes();

        for (DispositivoInteligente dispositivo : dispositivos) {
            if (dispositivo instanceof Horno) {
                dispositivo.setEstado("encendido");
                ((Horno) dispositivo).encender();
            }
        }
    }

    public void apagar_horno(){
        List<DispositivoInteligente> dispositivos = this.getDispositivosInteligentes();

        for (DispositivoInteligente dispositivo : dispositivos) {
            if (dispositivo instanceof Horno) {
                dispositivo.setEstado("apagado");
                ((Horno) dispositivo).apagar();
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

    public void encender_cafetera(){
        List<DispositivoInteligente> dispositivos = this.getDispositivosInteligentes();

        for (DispositivoInteligente dispositivo : dispositivos) {
            if (dispositivo instanceof Cafetera) {
                dispositivo.setEstado("encendido");
                ((Cafetera) dispositivo).encender();
            }
        }
    }

    public void apagar_cafetera(){
        List<DispositivoInteligente> dispositivos = this.getDispositivosInteligentes();

        for (DispositivoInteligente dispositivo : dispositivos) {
            if (dispositivo instanceof Cafetera) {
                dispositivo.setEstado("apagado");
                ((Cafetera) dispositivo).apagar();
            }
        }
    }

}
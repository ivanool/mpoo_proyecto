public class Magos extends Personajes{
    // Atributos
    int UsoDeEnergía;
    static final int EnergíaInicial = 100;
    int Vida;

    // Constructores
    public Magos(String nombre, String poder){
        super(nombre, poder);
        energia = EnergíaInicial;
        System.out.println("El mago " + nombre + " tiene un poder " + poder +
                            "con una energía inicial de " + EnergíaInicial);
        int vida = 100;
    }

    // Métodos 
    public void Encantar(int UsoDeEnergía){
        System.out.print("Mago " + nombre + " [Poder: " + poder + ", Energía gastada: "
                            + UsoDeEnergía + ",  Nivel de energía anterior: " + energia +
                            ", Energía actual: ");
        energia = energia - UsoDeEnergía;
        System.out.println(energia);
    }

    @Override
    public void mostrar_info(){
        super.mostrar_info();
        System.out.println("Poder: "+this.poder);
    }

    public int modificar_vida(int valor_random){
        if(valor_random >1 && valor_random <49){
            System.out.println("El mago "+this.nombre+" no ha perdido vida");
            int estado = verificar_vida();
            return estado;
        }
        else if(valor_random >=50 && valor_random <=70){
            vida = vida - 10;
            System.out.printl("El mago "+this.nombre+" ha perdido 10 puntos de vida");
            int estado = verificar_vida();
            return estado;
        }
        else if(valor_random >=71 &&valor_random<=89){
            vida = vida-20;
            System.out.printl("El mago "+this.nombre+" ha perdido 20 puntos de vida");
            int estado =verificar_vida();
            return estado;

        }
        else if(valor_random >=90 && valor_random <=99){
            vida = vida - 30;
            System.out.println("El mago "+this.nombre+" ha perdido 30 puntos de vida");
            int estado =verificar_vida();
            return estado;
        }
        else if(valor_random == 100){
            return 0;
        }
    }

    public int verificar_vida(){
        if(vida <= 0){
            System.out.println("El mago "+this.nombre+" ha muerto");
            return -1;
        }
        else{
            System.out.println("El mago "+this.nombre+" tiene "+this.vida+" puntos de vida");
            return 1;
        }
    }
}
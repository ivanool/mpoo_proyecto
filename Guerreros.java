public class Guerreros extends Personajes{
    //ATRIBUTOS
    String nombre;
    string arma;
    int energia;
    int energiaInicial;
    int energiaConsumo;
    int vida = 100;

    //Constructores
    public Guerreros (String nombre, String arma, int energiaInicial, int energiaConsumo){
        if (energiaConsumo <10 && energiaConsumo > 20){
            System.out.printnl("nivel de consumo de energia en arma fuera del rango");
        }
        
            }

    //MÉTODOS
    public void combatir(){
        energia = energiaInicial - energiaConsumo;
        System.out.println("Guerrero "+nombre+"uso el arma "+arma+"y su nuevo nivel de energia es "+energia);
    }
    public void Alimentarse(){
        super.Alimentarse();

        System.put.println("Guerrero [energia anterior: "+energiaInicial+", energia actual "+energia+"]");
    }
    public void ConteoVida(){

    }
    public void NumAleatorio (){
        int NumeroAleatorio; //creacion de variable con comando numero aleatorio
            if(NumeroAleatorio >=1 && NumeroAleatorio <=49){
                System.out.println("No lastimó");
                if else (NumeroAleatorio >=50 && NumeroAleatorio <=70){
                    System.out.println("Guerrero perdió 10 puntos de vida");
                    vida = vida - 10;
                }
                    if e =e(NumeroAl eatorio >=71 && NumeroAleatorio <=89){
                    System.out.println("Guerrero perdió 20 puntos de vida");
                    vida = vida - 20 ;
                    }
                    else {
                    System.out.println("Guerrero perdió 30 puntos de vida");
                    vida = vida - 30;
                }
            }
}
}





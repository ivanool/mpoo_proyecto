public class Personajes{
    //atributos
    protected String nombre;
    protected int energia;
    //constructor 
    public Personaje(String nombre, String poder){
        this.nombre = nombre;
        this.energia=100;
    }
    //métodos
    public void Alimentarse(int energia){
        //segun yo así es como funciona jaja
        System.out.print("El personaje "+this.nombre+" se ha alimentado y su energia es: ");
        this.energia = this.energia + 30;
        System.out.println(this.energia);
    }

    public void mostrar_info(){
        //mostramos info del personaje
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Energia: "+this.energia);
    }
}
package proyectocasainte;

import javax.swing.JOptionPane;

public class Verificacion {
    boolean res;
    
    public int numero(String j){
        try{
            Integer.valueOf(j);
            res= true;
        } catch(NumberFormatException exeption){
            res= false; 
        }
        if(res==false){
            JOptionPane.showMessageDialog(null, "Ingrese numeros enteros ", "Jaime, Navarro, Perez y Soto", JOptionPane.ERROR_MESSAGE, null);
            return 0;
        }
        else{
            return 1;
        }
}
}
import javax.swing.JOptionPane;

public class Verificacion {
    boolean res;
    
    // Método "numero" que toma una cadena "j" como argumento y devuelve un entero.
    public int numero(String j){
        try{
            Integer.valueOf(j);
            res= true;
        } catch(NumberFormatException exception){
            res= false; 
        }
        if(res==false){
            // Si no se pudo convertir la cadena en un número entero, se muestra un mensaje de error.
            JOptionPane.showMessageDialog(null, "Ingrese números enteros ", "Jaime, Navarro, Perez y Soto", JOptionPane.ERROR_MESSAGE, null);
            return 0;
        }
        else{
            // Si se pudo convertir la cadena en un número entero, se devuelve 1.
            return 1;
        }
    }
}

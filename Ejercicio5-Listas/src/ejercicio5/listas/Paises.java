
package ejercicio5.listas;

import ServicioPaises.ServicioPaises;
import java.util.Scanner;


public class Paises {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioPaises a1 = new ServicioPaises();
        
        String n = "si";        
        while("si".equals(n)) {  
        a1.paises();
        System.out.println("desea ingresar otro pais? ");
        n = leer.next();
        }
        a1.eliminarPais();
    }
    
}

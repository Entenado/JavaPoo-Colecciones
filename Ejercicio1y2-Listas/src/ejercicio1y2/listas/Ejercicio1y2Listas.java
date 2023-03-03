
package ejercicio1y2.listas;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio1y2Listas {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);   
    ArrayList<String>razaP = new ArrayList<String>();
    String M = "s";
       while("s".equals(M)){
       System.out.println("Ingrese la raza de los perros");
           razaP.add(leer.nextLine());
           System.out.println("¿Desea ingresar otra raza?" + "s/n");
           M = leer.nextLine();
       }
       
   
        System.out.println("La raza de los perros serán : " + razaP);
    }
    
}

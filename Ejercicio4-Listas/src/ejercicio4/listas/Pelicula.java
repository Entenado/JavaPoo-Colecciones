
package ejercicio4.listas;

import EntidadesPeliculas.EntidadesPeliculas;
import ServiciosPeliculas.ServicioPeliculas;
import java.util.Scanner;


public class Pelicula {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       ServicioPeliculas a1 = new ServicioPeliculas();
       System.out.println("Bienvenido al videoclub virtual pepito");
       EntidadesPeliculas A = new EntidadesPeliculas();
       
       String n = "si";
       while (n.equals("si")){   
            a1.crearPelicula();
          
       System.out.println("Desea ingresar otra pelicula?");
          n=leer.next();}
        System.out.println("-------------------------------------------------");
         a1.duracion(A);
         System.out.println("-------------------------------------------------");
         System.out.println("El orden Ascendete de las peliculas por tiempo es:");
         a1.ordenAscendente(A);
         System.out.println("-------------------------------------------------");
         System.out.println("El orden Descendete de las peliculas por tiempo es:");
         a1.ordenDescendente(A);
         System.out.println("-------------------------------------------------");
         System.out.println("El orden Alfabetico por titulo es: ");
         a1.ordenTitulo(A);
         System.out.println("-------------------------------------------------");
         System.out.println("El orden Alfabetico por director es: ");
         a1.ordenDirector(A);
    }
    
}

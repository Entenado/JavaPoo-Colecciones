
package ServiciosPeliculas;

import EntidadesPeliculas.EntidadesPeliculas;
import UtilidadesPeliculas.Comparadores;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
  @author Abel
 */
public class ServicioPeliculas {
    Scanner leer = new Scanner (System.in);
    ArrayList<EntidadesPeliculas> peliculas = new ArrayList();
    public EntidadesPeliculas crearPelicula (){
        
    EntidadesPeliculas a1 = new EntidadesPeliculas();
    
        
        System.out.println("Ingrese el titulo de la pelicula que quiere guardar en el inventario");
        a1.setTitulo(leer.next());
        System.out.println("Ingrese el director de la pelicula");
        a1.setDirector(leer.next());
        System.out.println("Ingrese la duracion en horas de la pelicual");
        Double duracion = leer.nextDouble();
        a1.setDuracion(duracion);
        peliculas.add(a1);
        System.out.println("las peliculas son : " + peliculas);
        return a1;
    }
    
    public void duracion(EntidadesPeliculas a1){
    Double n = 0.0;
    String m;
        for (int i = 0; i < peliculas.size(); i++) {
            if (peliculas.get(i).getDuracion()>1) {
                n = peliculas.get(i).getDuracion();
                m = peliculas.get(i).getTitulo();
                
                System.out.println("las peliculas mayores a 1 hora son: " + m + n + " hs.");
            }
             
        }
    }
    public void ordenAscendente(EntidadesPeliculas a1){
    int n = 0;
        Collections.sort(peliculas, Comparadores.ordenarDescendente);
        for (EntidadesPeliculas ordena : peliculas){
        n = n + 1 ;
            System.out.println("La pelicula " + n + " es " + ordena);
        }
    }
    
    public void ordenDescendente(EntidadesPeliculas a1){
    int n = 0;
        Collections.sort(peliculas, Comparadores.ordenarAscendente);
        for (EntidadesPeliculas ordena : peliculas){
        n = n + 1 ;
            System.out.println("La pelicula " + n + " es " + ordena);
        }
    }
    
    public void ordenTitulo(EntidadesPeliculas a1){
    int n = 0;
        Collections.sort(peliculas, Comparadores.ordenarTitulo);
        for (EntidadesPeliculas ordena : peliculas){
        n = n + 1 ;
            System.out.println("La pelicula " + n + " es " + ordena);
        }
    }
    
    public void ordenDirector(EntidadesPeliculas a1){
    int n = 0;
        Collections.sort(peliculas, Comparadores.ordenarDirector);
        for (EntidadesPeliculas ordena : peliculas){
        n = n + 1 ;
            System.out.println("La pelicula " + n + " es " + ordena);
        }
    }
  
    
}

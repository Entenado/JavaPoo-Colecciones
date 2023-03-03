
package UtilidadesPeliculas;

import EntidadesPeliculas.EntidadesPeliculas;
import java.util.Comparator;


public class Comparadores {
    public static Comparator<EntidadesPeliculas> ordenarAscendente = (EntidadesPeliculas t, EntidadesPeliculas t1) -> t1.getDuracion().compareTo(t.getDuracion());
    
    public static Comparator<EntidadesPeliculas> ordenarDescendente = new Comparator <EntidadesPeliculas>() {
        @Override
        public int compare(EntidadesPeliculas t1, EntidadesPeliculas t ) {
            
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
     public static Comparator<EntidadesPeliculas> ordenarTitulo = new Comparator <EntidadesPeliculas>() {
        @Override
        public int compare(EntidadesPeliculas t, EntidadesPeliculas t1) {
            
            return t.getTitulo().compareTo(t1.getTitulo());
           
        }
    };

     public static Comparator<EntidadesPeliculas> ordenarDirector = new Comparator <EntidadesPeliculas>() {
        @Override
        public int compare(EntidadesPeliculas t, EntidadesPeliculas t1) {
            
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
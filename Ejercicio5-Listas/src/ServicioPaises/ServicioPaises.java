
package ServicioPaises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
//Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
//los servicios en la clase correspondiente)
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.

public class ServicioPaises {
    Scanner leer = new Scanner(System.in);
    //HashSet<String>pais = new HashSet();
    TreeSet<String>pais=new TreeSet();
    public TreeSet<String> paises(){
    String paisess;
        System.out.println("Ingrese un pais");
        paisess=leer.next();
        pais.add(paisess);
        System.out.println("Los paises son: " + pais);
        return pais;
    }
    
    public void eliminarPais (){
    
        System.out.println("Ingrese pais");
        String n = leer.next();
        pais.iterator();
        //while(iterator.hasNext()){
        
            if(pais.contains(n)){
                pais.remove(n);
            } 
            else{
                System.out.println("El pais no se encuentra en la lista");
                }
        //}
        for (String pai : pais) {
            System.out.println(pai);
        }
        }
        
        
    
    
}
    

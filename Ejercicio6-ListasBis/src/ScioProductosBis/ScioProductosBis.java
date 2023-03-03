
package ScioProductosBis;

import EntidadesProductosBis.EntidadesProductosBis;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class ScioProductosBis {
    HashMap<Integer, EntidadesProductosBis> producto = new HashMap();
    Scanner leer = new Scanner(System.in);
    
    public EntidadesProductosBis Crear (){
    EntidadesProductosBis a1 = new EntidadesProductosBis();
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el producto.");
        a1.setProductos(leer.nextLine());
        
        System.out.println("Ingrese el precio del producto.");
        a1.setPrecio(leer.nextInt());
        
        System.out.println("Ingrese la llave del producto.");
        Integer llave = leer.nextInt();
        producto.put(llave, a1);
       
        for (Entry<Integer, EntidadesProductosBis> a : producto.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());
        }
      return a1;
    }
    
        public void modificarPrecio(EntidadesProductosBis a1){
            EntidadesProductosBis a2 = new EntidadesProductosBis();
        
          Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el nombre del producto a cambiar");
          a2.setProductos(leer.nextLine());
          
          System.out.println("Ingrese el numero del producto a buscar");
          Integer llaveABuscar = leer.nextInt();
          System.out.println("Ingrese el precio a cambiar");
          a2.setPrecio(leer.nextInt());
          producto.put(llaveABuscar, a2);
      
          for (int i = 0; i < producto.size(); i++) {
  
           if (producto.containsKey(llaveABuscar)) {
                producto.replace(llaveABuscar,a2);
                
        }
    }

          for (Entry<Integer, EntidadesProductosBis> a : producto.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());}
}
        
        public void eliminar (EntidadesProductosBis a1){
            Integer llave2=0;
            System.out.println("Ingrese la llave del producto a eliminar");
            llave2=leer.nextInt();
            producto.remove(llave2);
            for (Entry<Integer, EntidadesProductosBis> a : producto.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());}
        }
        
     public void mostrar(EntidadesProductosBis a1){
     for (Entry<Integer, EntidadesProductosBis> a : producto.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());}
         
     }   
}










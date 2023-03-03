
package ejercicio6.listasbis;

import EntidadesProductosBis.EntidadesProductosBis;
import ScioProductosBis.ScioProductosBis;
import java.util.Scanner;


public class ProductosBis {

   
    public static void main(String[] args) {
        
        
         ScioProductosBis a1 = new ScioProductosBis();
        EntidadesProductosBis A = new EntidadesProductosBis();
        Scanner leer = new Scanner(System.in);
        Integer opc;
        do {    
                      
            System.out.println("Ingrese la opcion que desea realizar.\n"
                    +"si desea salir ingrese por teclado " + "´salir´.\n"
                    +"1.Crear producto.\n"
                    + "2.Modificar precio.\n"
                    + "3.Eliminar.\n"
                    + "4.Mostrar.\n"
                    + "5.Salir.");
        opc = leer.nextInt();
        switch (opc) {
                case 1:
                    a1.Crear();
                    break;
                case 2:
                    a1.modificarPrecio(A);
                    break;
                case 3:
                    a1.eliminar(A);
                    break;
                case 4:
                    a1.mostrar(A);
                    break;
                case 5:
                    System.out.println("Saliste");
                    break;
            } 
   
        }while (!opc.equals(5));
        
    }
    
}

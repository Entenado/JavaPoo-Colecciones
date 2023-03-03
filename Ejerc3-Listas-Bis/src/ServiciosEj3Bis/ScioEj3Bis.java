
package ServiciosEj3Bis;

import Ej3listasEntidadesBis.Ej3Bis;
import java.util.ArrayList;
import java.util.Scanner;


public class ScioEj3Bis {
    ArrayList<Integer> notasss = new ArrayList();
    ArrayList<Ej3Bis> alumno = new ArrayList();
    public Ej3Bis crearAlumno(){
        Scanner leer = new Scanner(System.in);
    Ej3Bis a1 = new Ej3Bis();
     System.out.println("Ingrese el nombre del alumno");
    a1.setNombre(leer.nextLine());
        System.out.println("Ingrese nota1");
    Integer nota1 = leer.nextInt();
    System.out.println("Ingrese nota2");
    Integer nota2 = leer.nextInt();
    System.out.println("Ingrese nota3");
    Integer nota3 = leer.nextInt();
    notasss.add(nota1);
    notasss.add(nota2);
    notasss.add(nota3);
    a1.setNotas(notasss);



    alumno.add(a1);
        System.out.println(alumno);
    return a1;
}
}

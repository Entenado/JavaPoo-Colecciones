
package ServiciosAlumnos;

import EntidadadesAlumnos.EntidadesAlumnos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class ServiciosAlumnos {
    Scanner leer = new Scanner(System.in); 
    ArrayList<EntidadesAlumnos> alumno = new ArrayList<EntidadesAlumnos>();
    public EntidadesAlumnos crearAlumno(){
    EntidadesAlumnos a1 = new EntidadesAlumnos();
    
        System.out.println("Ingrese el nombre del alumno");
    a1.setNombre(leer.next());
//    a1.setNotaTrimestre1(leer.nextInt());
//    a1.setNotaTrimestre2(leer.nextInt());
//    a1.setNotaTrimestre3(leer.nextInt());
System.out.println("Ingrese la nota del primer trimestre");
a1.setNota1(leer.nextInt());
System.out.println("Ingrese la nota del segundo trimestre");
a1.setNota2(leer.nextInt());
System.out.println("Ingrese la nota del tercer trimestre");
a1.setNota3(leer.nextInt());
Integer notas[] = {a1.getNota1(),a1.getNota2(),a1.getNota3()};


a1.setNotas(notas);
    alumno.add(a1);
        System.out.println(alumno);
    return a1;
}
        
  
//    Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
    


    public void notaFinal(EntidadesAlumnos a1){
        System.out.println("Ingrese el nombre del alumno que desea buscar");
    String nombree = leer.next();
     int n = 0;
     
        for (int i = 0; i < alumno.size(); i++) {
            if (alumno.get(i).getNombre().equals(nombree)) {
                
            
                
               // System.out.println("prueba" + Arrays.toString(alumno.get(i).getNotas())); 
              // n = Integer.parseInt(Arrays.toString(alumno.get(i).getNotas()));
                System.out.println("nota 1 : " + alumno.get(i).getNota1());
                System.out.println("nota 2  : "  + alumno.get(i).getNota2());
                System.out.println("nota 3  : " + alumno.get(i).getNota3());
               n = ((alumno.get(i).getNota1()) + (alumno.get(i).getNota2())+ (alumno.get(i).getNota3()))/3;
                        
               
                
               
                
                    
                System.out.println("El promedio de las notas es: " + n);
            }
            
            
            
           
        }
}
}
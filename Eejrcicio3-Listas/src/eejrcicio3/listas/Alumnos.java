
package eejrcicio3.listas;

import EntidadadesAlumnos.EntidadesAlumnos;
import ServiciosAlumnos.ServiciosAlumnos;
import java.util.Scanner;


public class Alumnos {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosAlumnos a1 = new ServiciosAlumnos();
        EntidadesAlumnos A = a1.crearAlumno();
        String m = "s";
        while("s".equals(m)){
        a1.crearAlumno();
           System.out.println("¿Desea ingresar otro alumno?" + "s/n");
           m = leer.nextLine();
       }
       // a1.notaFinal(A);
        
        
    }
    
}

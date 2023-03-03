
package EntidadadesAlumnos;

import java.util.ArrayList;
import java.util.Arrays;


public class EntidadesAlumnos {
   
String nombre;
int nota1;
int nota2;
int nota3;
Integer notas[];

    public EntidadesAlumnos() {
    }

    public EntidadesAlumnos(String nombre, int nota1, int nota2, int nota3, Integer[] notas) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public Integer[] getNotas() {
        return notas;
    }

    public void setNotas(Integer[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "EntidadesAlumnos{" + "nombre=" + nombre + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", notas=" + Arrays.toString(notas) + '}';
    }

   



  
   
}

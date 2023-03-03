
package Ej3listasEntidadesBis;

import java.util.ArrayList;


public class Ej3Bis {
    
    String nombre;
    ArrayList<Integer> notas = new ArrayList();
    Integer nota1;
    Integer nota2;
    Integer nota3;
    
   
    public Ej3Bis() {
        this.notas = new ArrayList();
    }

    public Ej3Bis(String nombre) {
        this.notas = new ArrayList();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    public void trolo(ArrayList<Integer> notas){
    
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
    }

    @Override
    public String toString() {
        return "Ej3Bis{" + "nombre=" + nombre + ", notas=" + notas + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }


   
    
}


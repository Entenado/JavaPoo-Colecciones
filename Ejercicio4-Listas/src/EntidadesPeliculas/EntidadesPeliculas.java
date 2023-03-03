
package EntidadesPeliculas;

/**
  @author Abel
 */
public class EntidadesPeliculas {
    
    String titulo;
    String director;
    Double duracion;

    public EntidadesPeliculas() {
    }

    public EntidadesPeliculas(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "EntidadesPeliculas{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

   
    
    
}

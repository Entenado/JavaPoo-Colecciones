
package EntidadesProductosBis;


public class EntidadesProductosBis {
    Integer precio;
    String productos;

    public EntidadesProductosBis() {
    }

    public EntidadesProductosBis(Integer precio, String productos) {
        this.precio = precio;
        this.productos = productos;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "EntidadesProductosBis{" + "precio=" + precio + ", productos=" + productos + '}';
    }
    
}

package modelo;

/**
 *
 * @author bruno
 */
public class Producto {
    
    int codProducto; 
    String nombre;       
    String descripcion;    
    Double precio;     
    int stock;     
    int codRubro;
    
public Producto(){

}

public Producto(int codProducto, String nombre, String descripcion, Double precio, int stock, int codRubro) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.codRubro = codRubro;
    } //fin de Constructor

    public int getCodProducto() {
        return codProducto;
    }

    //Metodos
    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodRubro() {
        return codRubro;
    }

    public void setCodRubro(int codRubro) {
        this.codRubro = codRubro;
    }



}//Fin de Producto

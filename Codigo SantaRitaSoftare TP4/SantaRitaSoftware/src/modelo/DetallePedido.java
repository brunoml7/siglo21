package modelo;

/**
 *
 * @author bruno
 */
public class DetallePedido {
    
    int codPedidod;     
    int codProductod;    
    Double montoD;
    int cantidad;

    
    public DetallePedido() {
    }

    public DetallePedido(int codPedidod, int codProductod, Double montoD, int cantidad) {
        this.codPedidod = codPedidod;
        this.codProductod = codProductod;
        this.montoD = montoD;
        this.cantidad = cantidad;
    }

    public int getCodPedidod() {
        return codPedidod;
    }

    public void setCodPedidod(int codPedidod) {
        this.codPedidod = codPedidod;
    }

    public int getCodProductod() {
        return codProductod;
    }

    public void setCodProductod(int codProductod) {
        this.codProductod = codProductod;
    }

    public Double getMontoD() {
        return montoD;
    }

    public void setMontoD(Double montoD) {
        this.montoD = montoD;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
    
    
}//fin DEtallePedido

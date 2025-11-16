package modelo;

/**
 *
 * @author bruno
 */
public class PedidoCliente {
    
    int codPedido;  
    int codCliente;    
    Double monto;   
    String fecha;

    public PedidoCliente() {
    }

    public PedidoCliente(int codPedido, int codCliente, Double monto, String fecha) {
        this.codPedido = codPedido;
        this.codCliente = codCliente;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}//FinPedidoCliente

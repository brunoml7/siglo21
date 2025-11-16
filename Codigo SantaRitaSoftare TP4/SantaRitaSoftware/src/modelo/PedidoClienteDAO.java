
package modelo;

/**
 *
 * @author bruno
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PedidoClienteDAO {
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    
    public String IdPedidoC(){
        String idPe="";
        String sql= "select max(codPedido) AS codPedido FROM pedidocliente ";
    try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                idPe=rs.getString("codPedido");
            
            }
            
        } catch (Exception e) {
            System.out.println("Error IdPedidoC: " + e.getMessage());
        }
        return idPe;  
    
    }//fin idePedidoCli
    
    public int guardarPedidoC(PedidoCliente pc) {
    
    String sql = "INSERT INTO pedidocliente (codCliente, monto, fecha) VALUES (?, ?, ?)";
    int idGenerado = 0; // Se inicializa a 0; si falla, devuelve 0.
       
    PreparedStatement psLocal = null; 
    ResultSet rsLocal = null;
    Connection conLocal = null; 
    try {
        conLocal = cn.Conectar();        
        psLocal = conLocal.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);              
        psLocal.setInt(1, pc.getCodCliente());  // codCliente
        psLocal.setDouble(2, pc.getMonto());    // monto
        psLocal.setString(3, pc.getFecha());    // fecha
        
          int r = psLocal.executeUpdate();
        
        //  Obtengo las claves generadas
        rsLocal = psLocal.getGeneratedKeys();
               
        if (rsLocal.next()) {
            idGenerado = rsLocal.getInt(1); // el primero esID autoincremental
        }
        
    } catch (Exception e) {
        System.err.println("Error al guardar pedido C: " + e.getMessage());
        e.printStackTrace();
        idGenerado = 0; // Asegurarse de que devuelve 0 si hay una excepción (ej: Clave Foránea)
        
    } finally {       
        try {
            if (rsLocal != null) rsLocal.close();
            if (psLocal != null) psLocal.close();
            if (conLocal != null) conLocal.close();
        } catch (Exception ex) {
            System.err.println("Error al cerrar recursos en pedido C: " + ex.getMessage());
        }
    }
    
    return idGenerado; // Devuelve el ID generado (o 0 si falló)
}
    
    
     public int GuardarDetallePe(DetallePedido dp){
        
        String sql = "INSERT INTO detallepedido (codPedido, codProducto, monto, Cantidad) VALUES (?, ?, ?, ?)";
        try {
            con=cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dp.codPedidod);
            ps.setInt(2, dp.codProductod);
            ps.setDouble(3, dp.montoD);
            ps.setInt(4, dp.cantidad);
            
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
        
        return r;
    
    }//Fin de GuardarPedidoCliente
    
    
}//Fin PedidoClienteDAO


package modelo;

/**
 *
 * @author bruno
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DetallePedidoDAO {
   /* 
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    
    public String IdDetalleP(){
    
           String idd=""; //IDDetalle
           String sql= "select max(codPedido) from detallePedido ";
           try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                idd=rs.getString("codPedido");
            
            }
            
        } catch (Exception e) {
        }
        return idd;          
    }//Fin de IdDetalleP
    
    public int guardarDetalleP(DetallePedido dp){
        DetallePedido detallePe = new DetallePedido();
        String sql = "INSERT INTO DetallePedido (codPedido, codProducto, monto, Cantidad) VALUES (?, ?, ?, ?)";
        try {
        con = cn.Conectar();
        ps.setInt(r, r);
        ps = con.prepareStatement(sql);
                   
        ps.setInt(1, dp.getCodPedidod());     
        ps.setInt(2, dp.getCodProductod());   
        ps.setDouble(3, dp.getMontoD());     
        ps.setInt(4, dp.getCantidad());     
        
        r = ps.executeUpdate();
        
    } catch (Exception e) {
        System.err.println("Error al guardar detalle: " + e.getMessage());
        e.printStackTrace();
    } finally {        
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            System.err.println("Error al cerrar recursos en detalle: " + ex.getMessage());
        }
    }
    return r;
    
    }//fin de guardarDetalleP
    
    public int GuardarPedidoCliente(PedidoCliente pc){
        
        String sql = "INSERT INTO pedidocliente (codPedido, codCliente, monto, fecha) VALUES (?, ?, ?, ?)";
        try {
            con=cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pc.codCliente);
            ps.setInt(2, pc.codPedido);
            ps.setDouble(3, pc.monto);
            ps.setString(4, pc.fecha);
            
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
        
        return r;
    
    }//Fin de GuardarPedidoCliente
*/
}//Fin detallepedidoDAO

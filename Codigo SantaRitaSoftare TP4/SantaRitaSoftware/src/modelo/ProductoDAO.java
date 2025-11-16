package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author bruno
 */
public class ProductoDAO implements CRUD {
    
    int r;
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso=new Conexion();
    
    //buscar Producto
    public Producto listarID(int codProducto){
        Producto p=new Producto();
       String sql= "select * from producto where codProducto=?";
        try {
            con=acceso.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, codProducto);
            rs=ps.executeQuery();
            
            while(rs.next()){
                p.setCodProducto(rs.getInt("codProducto")); //Realizo esto para poder encontrar el dato en la columna que corresponde de la Base de Datos
                p.setNombre(rs.getString("nombre"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("strock"));
                p.setCodRubro(rs.getInt("codRubro"));
            }
            
        } catch (Exception e) {
        }
        return p;
    }
    
 @Override
    public List listar() { //Aqui defino una variable de tipo List del objeto que quiero listar
        List<Producto> lista = new ArrayList<>();
        String sql = "select * from producto";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){                
            Producto p= new Producto();
            
            p.setCodProducto(rs.getInt("codProducto")); //Realizo esto para poder encontrar el dato en la columna que corresponde de la Base de Datos
            p.setNombre(rs.getString("nombre"));
            p.setDescripcion(rs.getString("descripcion"));
            p.setPrecio(rs.getDouble("precio"));
            p.setStock(rs.getInt("strock"));
            p.setCodRubro(rs.getInt("codRubro"));
            
                             //Estos datos del objeto los agrego en una lista, lo mando como parametro
           
            lista.add(p);
            
            }//Fin del while
        } catch (Exception e) {
        }
        return lista;
    }//Fin de Listar()

    @Override
    public int add(Object[] o) { //Metodo Agregar
        int r=0;
        String sql ="insert into producto (nombre, descripcion, precio, strock, codRubro)values (?,?,?,?,?)";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            
            r=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(); // Mostrar el error real de la DB
        }//fin del trycatch
        finally {
       
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
        return r;
    }//Fin del metodo Add

    @Override
    public int actualizar(Object[] o) { //Metodo Actualizar - Aqui respeto el orden de los valores que actualizo en el metodo Actualizar en ProductoForm
        int r=0;
        String sql ="UPDATE producto set nombre=?, descripcion=?, precio=?, strock=?, codRubro=? where codProducto=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r=ps.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
        return r;
        
    }// fin Actualizar

    @Override
    public void eliminar(int codProducto) { //Metodo Eliminar
        String sql="delete from producto where codProducto=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, codProducto);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    } //Fin Metodo Eliminar 

    
    
    
} //Fin de la Clase ProductoDAO

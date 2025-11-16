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
public class ClienteDAO implements CRUD{
    //aqui impemente todos los metodos de la clase CRUD
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    //Metodo BuscarCliente
    
    public Cliente listarID(String dni){
        Cliente c=new Cliente();
    
    String sql="select * from Cliente where dni=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, dni);
            rs=ps.executeQuery();
            while (rs.next()) {
                     c.setCodCliente(rs.getInt("codCliente"));
                     c.setNomC(rs.getString("nombre"));
                     c.setApeC(rs.getString("Apellido"));
                     c.setDomC(rs.getString("domicilio"));
                     c.setCorreoC(rs.getString("correo"));
                     c.setFechaC(rs.getString("fechaNac"));
                     c.setDniC(rs.getString("dni"));
                     
            }//Fin del while
            
        } catch (Exception e) {
        }
        return c;
    
    }//Fin ListarID
    
    @Override
    public List listar() { //Aqui defino una variable de tipo List del objeto que quiero listar
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from cliente";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
            Cliente c=new Cliente();
            c.setCodCliente(rs.getInt("CodCliente"));  //Realizo esto para poder encontrar el dato en la columna que corresponde de la Base de Datos
            c.setNomC(rs.getString("nombre"));
            c.setApeC(rs.getString("Apellido"));
            c.setDomC(rs.getString("domicilio"));
            c.setCorreoC(rs.getString("correo"));
            c.setFechaC(rs.getString("fechaNac"));
            c.setDniC(rs.getString("dni"));
            
            //Estos datos del objeto los agrego en una lista, lo mando como parametro
            lista.add(c);
            
            }//Fin del while
        } catch (Exception e) {
        }
        return lista;
    }//Fin de Listar()

    @Override
    public int add(Object[] o) { //Metodo Agregar
        int r=0;
        String sql ="insert into Cliente (nombre, Apellido, domicilio, correo, fechaNac, dni)values (?,?,?,?,?,?)";
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
        }//fin del trycatch
        return r;
    }//Fin del metodo Add

    @Override
    public int actualizar(Object[] o) { //Metodo Actualizar - Aqui respeto el orden de los valores que actualizo en el metodo Actualizar en ClienteForm
        int r=0;
        String sql ="update cliente set dni=?, nombre=?, Apellido=?,domicilio=?, correo=? where codCliente=?";
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
        }
        return r;
        
    }// fin Actualizar

    @Override
    public void eliminar(int codCliente) { //Metodo Eliminar
        String sql="delete from cliente where codCliente=?";
        try {
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, codCliente);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
    } //Fin Metodo Eliminar
    
    
} //Fin ClaseClienteDao

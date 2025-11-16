/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author bruno
 */
public class UsuarioDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    Usuario ev=new Usuario();
    
 //Instancio mi clase conexion.   
    Conexion con=new Conexion();
    Connection acceso;
           
        
    public Usuario ValidarUsuario(String nombreUsuario, String contrasenia ){
        
       
         Usuario u= null;
         
      //Declaro los campos de la tabla
        String sql = "SELECT nombreUsuario, contrasenia, nombreApellido, tipo FROM usuario WHERE nombreUsuario=? AND contrasenia=?";
        try {
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setString(2, contrasenia);
            rs=ps.executeQuery();
            
            //while(rs.next()){
            if(rs.next()){
                
                u = new Usuario();
                u.setNombreUsuario(rs.getString("nombreUsuario"));
                u.setContrasenia(rs.getString("contrasenia"));
                u.setNombreApellido(rs.getString("nombreApellido"));
                u.setTipo(rs.getString("tipo"));
                
            }//fin del while
            
        } catch (Exception e) {
           System.out.println("Error al validar Usuario: "+ e.getMessage());
            
        }
        return u;
    
    } //fin de ListaId
    
}//fin clase UsuarioDAO

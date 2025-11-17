/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    Connection con;
    
    public Connection Conectar() {
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");            
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/santarita_db", "root", "root");           
        } catch (Exception e) {
        }
        return con;
    } //Fin conectar ()
    
    public void main(String[] args) { 

        Conexion c = new Conexion();
        Connection con = c.Conectar();

        try {
            // Probamos la coneccion
            System.out.println("Conectada"); 
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    } //Fin main
    
} // Fin Clase Conexion

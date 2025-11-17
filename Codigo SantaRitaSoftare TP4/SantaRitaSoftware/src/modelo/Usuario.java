/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author bruno
 */

public class Usuario {
    
    private String nombreUsuario;     
    private String contrasenia;    
    private String nombreApellido;     
    private String tipo;
 //Defino un costructor Vacio y otro inicializando las variables)
    public Usuario() {
    }
    public Usuario(String nombreUsuario, String contrasenia, String nombreApellido, String tipo) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.nombreApellido = nombreApellido;
        this.tipo = tipo;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getContrasenia() {
        return contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public String getNombreApellido() {
        return nombreApellido;
    }
    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
} // Fin Class Usuario 

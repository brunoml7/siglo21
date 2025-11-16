/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author bruno
 */
public class Cliente {
    
    //Declaro los campos
    int codCliente;
    String nomC;
    String apeC;
    String domC;
    String correoC;
    String fechaC;
    String dniC;
    
    public Cliente(){
    }//Fin ConstructorVacio
    
    public Cliente(int codCliente, String nomC, String apeC, String domC, String correoC, String fechaC, String dniC) {
        this.codCliente = codCliente;
        this.nomC = nomC;
        this.apeC = apeC;
        this.domC = domC;
        this.correoC = correoC;
        this.fechaC = fechaC;
        this.dniC = dniC;
      
    } //Fin ConstructorCLiente

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    public String getApeC() {
        return apeC;
    }

    public void setApeC(String apeC) {
        this.apeC = apeC;
    }

    public String getDomC() {
        return domC;
    }

    public void setDomC(String domC) {
        this.domC = domC;
    }

    public String getCorreoC() {
        return correoC;
    }

    public void setCorreoC(String correoC) {
        this.correoC = correoC;
    }

    public String getFechaC() {
        return fechaC;
    }

    public void setFechaC(String fechaC) {
        this.fechaC = fechaC;
    }

    public String getDniC() {
        return dniC;
    }

    public void setDniC(String dniC) {
        this.dniC = dniC;
    }
    
    
    
    
} //FIn clase Cliente

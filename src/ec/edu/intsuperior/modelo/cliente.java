/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Usuario
 */
public class cliente extends persona{
    private String iDcliente;

    public cliente() {
    }

    public cliente(String iDcliente, String Cedula, String nombre1, String nombre2, String apellido1, String apellido2, String edad, String direccion, String telefono) {
        super(Cedula, nombre1, nombre2, apellido1, apellido2, edad, direccion, telefono);
        this.iDcliente = iDcliente;
    }

    public void setiDcliente(String iDcliente) {
        this.iDcliente = iDcliente;
    }

    public String getiDcliente() {
        return iDcliente;
    }
    
   
}

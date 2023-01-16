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
public class empleado extends persona{
    private String iDempleado;
    private Empresa TEmpresa;
    private String sueldo;
    private tipoEmpleado tipoEmpleado;
    private directivo directivo;

    public empleado() {
    }

    public empleado(String iDempleado, Empresa TEmpresa, String sueldo, tipoEmpleado tipoEmpleado, directivo directivo) {
        this.iDempleado = iDempleado;
        this.TEmpresa = TEmpresa;
        this.sueldo = sueldo;
        this.tipoEmpleado = tipoEmpleado;
        this.directivo = directivo;
    }

    public String getiDempleado() {
        return iDempleado;
    }

    public void setiDempleado(String iDempleado) {
        this.iDempleado = iDempleado;
    }

    public Empresa getTEmpresa() {
        return TEmpresa;
    }

    public void setTEmpresa(Empresa TEmpresa) {
        this.TEmpresa = TEmpresa;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public tipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(tipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public directivo getDirectivo() {
        return directivo;
    }

    public void setDirectivo(directivo directivo) {
        this.directivo = directivo;
    }
    
    

    
}

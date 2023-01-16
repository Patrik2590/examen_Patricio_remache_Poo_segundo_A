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
public class tipoEmpleado {
    private String iDtipoEmpleado;
    private String cargo;
    private String areaDeTrabajo;
    private double sueldoBruto;
    private double sueldoPorCargo;

    public tipoEmpleado(String iDtipoEmpleado, String cargo, String areaDeTrabajo, double sueldoBruto, double sueldoPorCargo) {
        this.iDtipoEmpleado = iDtipoEmpleado;
        this.cargo = cargo;
        this.areaDeTrabajo = areaDeTrabajo;
        this.sueldoBruto = sueldoBruto;
        this.sueldoPorCargo = sueldoPorCargo;
    }
    

    public tipoEmpleado() {
    }

    public tipoEmpleado(String iDtipoEmpleado, String cargo, String areaDeTrabajo, double sueldoPorCargo) {
        this.iDtipoEmpleado = iDtipoEmpleado;
        this.cargo = cargo;
        this.areaDeTrabajo = areaDeTrabajo;
        this.sueldoPorCargo = sueldoPorCargo;
    }

    public String getiDtipoEmpleado() {
        return iDtipoEmpleado;
    }

    public void setiDtipoEmpleado(String iDtipoEmpleado) {
        this.iDtipoEmpleado = iDtipoEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAreaDeTrabajo() {
        return areaDeTrabajo;
    }

    public void setAreaDeTrabajo(String areaDeTrabajo) {
        this.areaDeTrabajo = areaDeTrabajo;
    }

    public double getSueldoPorCargo() {
        return sueldoPorCargo;
    }

    public void setSueldoPorCargo(double sueldoPorCargo) {
        this.sueldoPorCargo = sueldoPorCargo;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
    
    
}

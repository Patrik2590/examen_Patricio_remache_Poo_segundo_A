/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Empresa;

/**
 *
 * @author Usuario
 */
class empresa extends Empresa{
    
    private String idEmpresa;

    public empresa() {
    }

    public empresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    
    
    
}

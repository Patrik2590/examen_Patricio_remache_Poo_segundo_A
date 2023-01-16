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
public class directivo {
    private String iddirectivo;
    private String PersonalAdministrativo;
    private String PersonalObreros;

    public directivo() {
    }

    public directivo(String iddirectivo, String PersonalAdministrativo, String PersonalObreros) {
        this.iddirectivo = iddirectivo;
        this.PersonalAdministrativo = PersonalAdministrativo;
        this.PersonalObreros = PersonalObreros;
    }

    public String getIddirectivo() {
        return iddirectivo;
    }

    public void setIddirectivo(String iddirectivo) {
        this.iddirectivo = iddirectivo;
    }

    public String getPersonalAdministrativo() {
        return PersonalAdministrativo;
    }

    public void setPersonalAdministrativo(String PersonalAdministrativo) {
        this.PersonalAdministrativo = PersonalAdministrativo;
    }

    public String getPersonalObreros() {
        return PersonalObreros;
    }

    public void setPersonalObreros(String PersonalObreros) {
        this.PersonalObreros = PersonalObreros;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.water;

import java.io.Serializable;
import java.util.ArrayList;


public class CondominosDTO implements Serializable{
    private String apto;
    private String responsavel;
    private String telefone;
    private String email;
    private ArrayList<ParametrosHidroDTO> medidas;
    
    
    public ArrayList<ParametrosHidroDTO> getMedidas() {
        return medidas;
    }
    
    public void setMedidas(ArrayList<ParametrosHidroDTO> medidas){
        this.medidas = medidas;
    }

    public String getApto() {
        return apto;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setApto(String apto) {
        this.apto = apto;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    


}
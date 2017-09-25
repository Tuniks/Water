
package com.mycompany.water;

import java.io.Serializable;


public class ParametrosHidroDTO implements Serializable{
    private String apto;
    private String datahora;
    private int nropulsos;
    private int hidrometro;
    private int serialmedidas;
    private float m3noperiodo;
    private int nropulsosacumulados;
    private float m3acumulados;
    private float custoacumulado;

    public void setNropulsos(int nropulsos) {
        this.nropulsos = nropulsos;
    }

    public void setHidrometro(int hidrometro) {
        this.hidrometro = hidrometro;
    }

    public void setSerialmedidas(int serialmedidas) {
        this.serialmedidas = serialmedidas;
    }

    public void setM3noperiodo(float m3noperiodo) {
        this.m3noperiodo = m3noperiodo;
    }

    public void setNropulsosacumulados(int nropulsosacumulados) {
        this.nropulsosacumulados = nropulsosacumulados;
    }

    public void setM3acumulados(float m3acumulados) {
        this.m3acumulados = m3acumulados;
    }

    public void setCustoacumulado(float custoacumulado) {
        this.custoacumulado = custoacumulado;
    }

    public int getNropulsos() {
        return nropulsos;
    }

    public int getHidrometro() {
        return hidrometro;
    }

    public int getSerialmedidas() {
        return serialmedidas;
    }

    public float getM3noperiodo() {
        return m3noperiodo;
    }

    public int getNropulsosacumulados() {
        return nropulsosacumulados;
    }

    public float getM3acumulados() {
        return m3acumulados;
    }

    public float getCustoacumulado() {
        return custoacumulado;
    }

    public String getApto() {
        return apto;
    }

    public void setApto(String apto) {
        this.apto = apto;
    }

    public String getDatahora() {
        return datahora;
    }

    public void setDatahora(String datahora) {
        this.datahora = datahora;
    }
    
}

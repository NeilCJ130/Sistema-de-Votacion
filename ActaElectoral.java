/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import TDAA.Lista;
/**
 *
 * @author msi-pc
 */

import java.util.Date;
import java.util.List;


public class ActaElectoral {
    private String numeroActa;
    private Date fechaHora;
    private String lugarVotacion;
    private String mesaElectoral;
    private Lista<String> miembrosMesa; 
    private int totalVotantes;
    private int votantesEfectivos;
    private int votosBlancos;
    private int votosNulos;
    private String observaciones;
    private Lista<String> firmasMiembros; 
    private boolean selloOficial; 

    // Constructor
    public ActaElectoral(String numeroActa, Date fechaHora, String lugarVotacion, String mesaElectoral, Lista<String> miembrosMesa) {
        this.numeroActa = numeroActa;
        this.fechaHora = fechaHora;
        this.lugarVotacion = lugarVotacion;
        this.mesaElectoral = mesaElectoral;
        this.miembrosMesa = new Lista<>();
        this.firmasMiembros = new Lista<>();
        this.selloOficial = false; // 
    }

    // Métodos

    public void registrarVotoBlanco() {
        this.votosBlancos++;
        this.votantesEfectivos++;
    }

    public void registrarVotoNulo() {
        this.votosNulos++;
        this.votantesEfectivos++;
    }

    public void agregarFirma(String firma) {
        this.firmasMiembros.agregar(firma);
    }

    public void colocarSelloOficial() {
        this.selloOficial = true;
    }

    public void agregarObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void registrarTotalVotantes(int totalVotantes) {
        this.totalVotantes = totalVotantes;
    }

    public boolean validarActa() {
        return !firmasMiembros.esVacia()&& selloOficial && totalVotantes >= votantesEfectivos;
    }

    // Getters y Setters
    public String getNumeroActa() {
        return numeroActa;
    }

    public void setNumeroActa(String numeroActa) {
        this.numeroActa = numeroActa;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getLugarVotacion() {
        return lugarVotacion;
    }

    public void setLugarVotacion(String lugarVotacion) {
        this.lugarVotacion = lugarVotacion;
    }

    public String getMesaElectoral() {
        return mesaElectoral;
    }

    public void setMesaElectoral(String mesaElectoral) {
        this.mesaElectoral = mesaElectoral;
    }

    public Lista<String> getMiembrosMesa() {
        return miembrosMesa;
    }

    public void setMiembrosMesa(Lista<String> miembrosMesa) {
        this.miembrosMesa = miembrosMesa;
    }

    public int getTotalVotantes() {
        return totalVotantes;
    }

    public int getVotantesEfectivos() {
        return votantesEfectivos;
    }

    public int getVotosBlancos() {
        return votosBlancos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public Lista<String> getFirmasMiembros() {
        return firmasMiembros;
    }

    public boolean tieneSelloOficial() {
        return selloOficial;
    }
}


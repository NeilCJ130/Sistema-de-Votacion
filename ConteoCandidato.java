/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.Candidato;

/**
 *
 * @author msi-pc
 */public class ConteoCandidato {
    // Atributos
    private Candidato candidato;
    private int votos;

 
    public ConteoCandidato(Candidato candidato, int votosIniciales) {
        this.candidato = candidato;
        this.votos = votosIniciales;
    }

    
    public void incrementarVoto() {
        votos++;
    }

    
    public void decrementarVoto() {
        if (votos > 0) votos--;
    }

   
    public Candidato getCandidato() {
        return candidato;
    }

    public int getVotos() {
        return votos;
    }
}

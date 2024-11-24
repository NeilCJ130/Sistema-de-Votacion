/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import TDAA.*;

public class Reporte {
    public static void generarReporte(Pila<String> votos, int totalVotantes, int votosNulos, int votosBlancos) {
        System.out.println("----- Reporte de Elección -----");
        System.out.println("Total de votantes: " + totalVotantes);
        System.out.println("Votos nulos: " + votosNulos);
        System.out.println("Votos en blanco: " + votosBlancos);

        Pila<String> copiaVotos = new Pila<>();

        
        while (!votos.isEmpty()) { 
            copiaVotos.push(votos.pop()); 
        }

      
        while (!copiaVotos.isEmpty()) { 
            System.out.println("Voto para: " + copiaVotos.pop());
        }
    }
}

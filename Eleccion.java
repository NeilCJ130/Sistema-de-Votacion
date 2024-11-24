

package clases;

import TDAA.Lista;
import java.time.LocalDateTime;


  

    
    
public class Eleccion extends Usuario {
    private LocalDateTime fecha;
    private String tipo;
    private Candidato candidato; 
    private MesaElectoral mesaElectoral; 
    
    // Constructor
  

    public Eleccion(String nombre,LocalDateTime fecha, String tipo, Candidato candidato, MesaElectoral mesaElectoral, String username, String password, String dni) {
        super(nombre, username, password, dni);
        this.fecha = fecha;
        this.tipo = tipo;
        this.candidato = candidato;
        this.mesaElectoral = mesaElectoral;
    }

    
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public MesaElectoral getMesaElectoral() {
        return mesaElectoral;
    }

    public void setMesaElectoral(MesaElectoral mesaElectoral) {
        this.mesaElectoral = mesaElectoral;
    }
    
     
   
}
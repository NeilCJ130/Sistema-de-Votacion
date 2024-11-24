package clases;

import java.io.File;
import TDAA.Lista;

public class Participante extends Usuario {


private Lista<Candidato> listaCandidatos;
    public Participante(String nombre, String username, String password, String dni, String telefono, String email) {
        super(nombre, username, password, dni);
          this.listaCandidatos = new Lista<>();  
    }

   
    public boolean haVotado(Sistema sistema) {
        return sistema.haVotado(this);  
    }

    
    public Voto registrarVoto(Candidato candidato, MesaElectoral mesa, TIPOVOTO tipoVoto,Sistema sistema) {
        return sistema.registrarVoto(this, candidato, mesa, tipoVoto); 
    }


    public Lista<Voto> obtenerVotos(Sistema sistema) {
        return sistema.obtenerVotos();  
    }

   
    public Voto iniciarVoto(Candidato candidato, MesaElectoral mesaElectoral, TIPOVOTO estado,Sistema sistema) {
        return sistema.crearVoto(candidato, mesaElectoral, estado, this);  
    }
      public Lista<Candidato> obtenerCandidatos() {
        return this.listaCandidatos;
    }
  public boolean agregarCandidato(Candidato candidato, Sistema sistema) {
    
    boolean resultado = sistema.agregar(candidato);  
    if (resultado) {
       
        this.listaCandidatos.agregar(candidato);
    }
    return resultado;
}
    
}

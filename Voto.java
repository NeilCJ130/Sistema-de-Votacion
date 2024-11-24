package clases;




public class Voto {
    private int id;                     
    private Candidato candidato;        
    private MesaElectoral mesaElectoral; 
    private TIPOVOTO estado;            
    private Participante votante;       

    // Constructor
    public Voto(int id, Candidato candidato, MesaElectoral mesaElectoral,TIPOVOTO estado, Participante votante) {
        this.id = id;
        this.candidato = candidato;
        this.mesaElectoral = mesaElectoral;
        this.estado = estado; 
        this.votante = votante;
    }


    public int getId() {
        return id;
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

    public TIPOVOTO getEstado() {
        return estado;
    }

    public void setEstado(TIPOVOTO estado) {
        this.estado = estado;
    }

    public Participante getVotante() {
        return votante;
    }

    public void setVotante(Participante votante) {
        this.votante = votante;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "id=" + id +
                ", candidato=" + (candidato != null ? candidato.getNombre() : "Blanco/Nulo") +
                ", mesaElectoral=" + mesaElectoral.getNumeroMesa() +
                ", estado=" + estado +
                ", votante=" + (votante != null ? votante.getDni() : "Anónimo") +
                '}';
    }

    boolean esNulo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    boolean esBlanco() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

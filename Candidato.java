package clases;





public class Candidato extends Usuario{
   
    private String PartidoPolitico;
     private String Apellido;
   

    public Candidato(String nombre , String Apellido,String dni,String PartidoPolitico,  String username, String password) {
        super(nombre, username, password, dni);
        this.PartidoPolitico = PartidoPolitico;
        this.Apellido = Apellido;
    }

    public String getPartidoPolitico() {
        return PartidoPolitico;
    }

    public void setPartidoPolitico(String PartidoPolitico) {
        this.PartidoPolitico = PartidoPolitico;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }



  

    }

 


    
    
    



package clases;



public class MiembroDeMesa extends Usuario {
    private String tipo;
    private String claveAcceso;
    private String Apellido;

    public MiembroDeMesa(String nombre, String Apellido, String tipo, String claveAcceso, String username, String password, String dni) {
        super(nombre, username, password, dni);
        this.tipo = tipo;
        this.claveAcceso = claveAcceso;
        this.Apellido = Apellido;
    }

    

    
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
}
    

    

   
  


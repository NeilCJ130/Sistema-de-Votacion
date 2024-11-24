package clases;

public class Usuario {
    private String nombre;
    private String username;
    private String password;
    private String dni;
  

    public Usuario(String nombre, String username, String password, String dni) {
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.dni = dni;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    

    

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", username='" + username + '\'' +
                ", dni='" + dni + '\'' +
              
                '}';
    }
}

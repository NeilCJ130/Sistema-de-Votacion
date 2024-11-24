package clases;

import TDAA.*;

public class Operador extends Usuario {

    
    private Lista<MiembroDeMesa> miembrosDeMesa;
    

    public Operador(String nombre, String username, String password, String dni, String telefono, String email) {
        super(nombre, username, password, "");  
       
        
        this.miembrosDeMesa = new Lista<>();
       
    }

    

   

    public Lista<MiembroDeMesa> obtenerMiembrosDeMesa() {
        return this.miembrosDeMesa;
    }
  
    public boolean agregarMesaElectoral(MesaElectoral mesa ,Sistema sistema) {
        return sistema.agregar(mesa);  
    }
    
    public boolean agregarMiembroDeMesa(MiembroDeMesa miembrodemesa, Sistema sistema) {
    
    boolean resultado = sistema.agregar(miembrodemesa);  
    if (resultado) {
       
        this.miembrosDeMesa.agregar(miembrodemesa);
    }
    return resultado;
}
}




    
    
   



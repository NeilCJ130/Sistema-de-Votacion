/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import TDAA.Lista;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author msi-pc
 */
public class MesaElectoral extends MiembroDeMesa {

    public static void setModel(DefaultComboBoxModel modelmesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // Atributos
    private String ubicacion;
    private String numeroMesa;
    private Lista<MiembroDeMesa> miembros;

    public MesaElectoral(String numeroMesa, String ubicacion,String tipo, Lista<MiembroDeMesa> miembros,  String claveAcceso, String Apellido, String nombre, String username, String password, String dni) {
        super(tipo, claveAcceso, Apellido, nombre, username, password, dni);
        this.ubicacion = ubicacion;
        this.numeroMesa = numeroMesa;
        this.miembros = miembros;
    }

  

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public Lista<MiembroDeMesa> getMiembros() {
        return miembros;
    }

    public void setMiembros(Lista<MiembroDeMesa> miembros) {
        this.miembros = miembros;
    }
    
    public String obtenerMiembrosString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= miembros.longitud(); i++) {
            MiembroDeMesa miembro = miembros.iesimo(i);
            sb.append(miembro.getNombre())
              .append(" (")
              .append(miembro.getTipo())
              .append(")");
            if (i < miembros.longitud()) {
                sb.append(", ");
            }
        }
        return sb.toString();
     }
    
}
    

    // Constructor

   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import TDAA.*;

public class Autenticacion {
    private Lista usuarios;

    public Autenticacion() {
        usuarios = new Lista<>();
        usuarios.agregar(new Nodo("admin,1234", null)); 
    }

    public boolean autenticar(String usuario, String contrasena) {
        String credenciales = usuario + "," + contrasena; 

        for (int i = 1; i <= usuarios.longitud(); i++) {
            Nodo nodo = (Nodo) usuarios.iesimo(i); 
            if (nodo != null && nodo.getElemento().equals(credenciales)) {
                return true;
            }
        }
        return false;
    }
}

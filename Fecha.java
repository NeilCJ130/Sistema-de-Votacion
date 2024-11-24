/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author acer
 */


import java.util.Scanner;

public class Fecha {
    // Atributos
    private int dia;
    private int mes;
    private int año;

   
    public Fecha() {
        dia = 1;
        mes = 1;
        año = 1900;
    }

    
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

 
    public Fecha(String fechaStr) {
        String[] partes = fechaStr.split("[-/ ]");  
        this.dia = Integer.parseInt(partes[0]);
        this.mes = Integer.parseInt(partes[1]);
        this.año = Integer.parseInt(partes[2]);
    }

    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

   
    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el Dia: ");
        this.dia = sc.nextInt();
        System.out.print("Ingrese el Mes: ");
        this.mes = sc.nextInt();
        System.out.print("Ingrese el año: ");
        this.año = sc.nextInt();        
    }

    
    public String verFecha() {
        return dia + "/" + mes + "/" + año;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_mariasandoval;

/**
 *
 * @author Labam
 */
public class Carta {
    //Atributos
    private String color;
    private String pinta;
    private int numero;
    
    //Constructors
    public Carta() { //Sin parametros
        color=pinta="";
        numero=0;
    }
    
    public Carta (String color, String pinta, int numero){
        this.color=color; //Con parametros
        this.pinta=pinta;
        this.numero=numero;
    }
    
    //SET/GET
    public void setColor(String color) {
        this.color = color;
    }

    public void setPinta(String pinta) {
        this.pinta = pinta;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColor() {
        return color;
    }

    public String getPinta() {
        return pinta;
    }

    public int getNumero() {
        return numero;
    }
    
    //Otros metodos
    public void ImprimirInfo() {
        System.out.println("Color: "+color);
        System.out.println("Pinta: "+pinta);
        System.out.println("Numero: "+numero);
    }
}

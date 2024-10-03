/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4._mariasandoval;

/**
 *
 * @author Labam
 * @param <M>
 */
public class Objeto <M> {
    private M obj;
    private int clave;
    
    //Constructor
    public Objeto(){
        clave=0; //Sin parametros
    }
    
    public Objeto(M obj, int clave){
        this.obj=obj;  //Con parametros
        this.clave=clave;
    }
    
    //SET/GET

    public void setObj(M obj) {
        this.obj = obj;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public M getObj() {
        return obj;
    }

    public int getClave() {
        return clave;
    }
    
    //Otros metodos
    public void ImprimirInfo(){
        System.out.println("Objeto: "+obj);
        System.out.println("Clave: "+clave);
    }
    
}

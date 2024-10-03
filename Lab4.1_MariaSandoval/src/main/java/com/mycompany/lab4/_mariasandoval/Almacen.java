/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4._mariasandoval;

/**
 *
 * @author Labam
 */
public class Almacen {
    //Atributos
    private int capacidad;
    private Objeto almacenG[];
    private int cantidad;
    
    //Constructores
    public Almacen(){
        capacidad=cantidad=0;  //Sin parametros
        almacenG= new Objeto[capacidad];
    }
    
    public Almacen(int capacidad,int cantidad) {
        this.capacidad = capacidad;  //Con parametros
        this.almacenG = new Objeto[capacidad];
        this.cantidad=cantidad;
    }
    
    //SET/GET
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setAlmacenG(Objeto[] almacenG) {
        this.almacenG = almacenG;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public Objeto[] getAlmacenG() {
        return almacenG;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    //Otros metodos
    public void AgregarObj (Objeto obj) throws LlenoExcepcion {
        if (cantidad==capacidad)
            throw new LlenoExcepcion("El almacen esta lleno");
        else{
            for(int i=0; i<almacenG.length; i++){
                if (almacenG[i]!=null && almacenG[i].getClave()== obj.getClave()){
                    almacenG[i]=obj;
                    break;
                }else if (almacenG[i]==null){
                    almacenG[i]=obj;
                    cantidad++;
                    break;
                }
            }
        }
    }
    
    public Objeto BuscarObjeto (int clave){
        for (Objeto aux: almacenG)
            if(aux.getClave()==clave)
                return aux;
        return null;
    }
    
    public void ImprimirInfo(){
        for (int i=0; i<cantidad;i++){
            if(almacenG[i]!=null){
                almacenG[i].ImprimirInfo();
                System.out.println("---------------------------");
        }
    }
}
}

package com.mycompany.lab7_mariasandoval;

/**
 *
 * @author Labam
 */
public class CantanteFamoso implements Comparable <CantanteFamoso>{
    private String nombre;
    private String discoMasVentas;
    private int duracion;
    private int annoEmision;
    
    //Constructores
    public CantanteFamoso(){
        nombre="";
        discoMasVentas=null;
        duracion=annoEmision=0;
    }
    
    public CantanteFamoso(String nombre, String discoMasVentas, int duracion, int annoEmision){
        this.nombre=nombre;
        this.discoMasVentas=discoMasVentas;
        this.duracion=duracion;
        this.annoEmision=annoEmision;
    }
    
    //SET/GET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiscoMasVentas(String discoMasVentas) {
        this.discoMasVentas = discoMasVentas;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setAnnoEmision(int annoEmision) {
        this.annoEmision = annoEmision;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDiscoMasVentas() {
        return discoMasVentas;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getAnnoEmision() {
        return annoEmision;
    }
    
    //Otros metodos
    public void ImprimirInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Disco con mas ventas: "+discoMasVentas);
        System.out.println("Anno de emision: "+annoEmision);
        System.out.println("Duracion: "+duracion);
    }

    @Override
    public int compareTo(CantanteFamoso aux) {
        return (annoEmision-aux.annoEmision);
    }
    
    
}

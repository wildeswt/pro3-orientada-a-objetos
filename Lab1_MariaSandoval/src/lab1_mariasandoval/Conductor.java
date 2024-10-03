/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_mariasandoval;
/**
 *
 * @author Labam
 */
import java.util.ArrayList;

public class Conductor {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;
    private ArrayList<Transporte> transportes;
    
    //Constructor
    public Conductor() {  //Sin parametros
        nombre=apellido=" ";
        edad=cedula=0;
    }
    
    public Conductor (String nombre, String apellido, int edad, int cedula){
        this.nombre=nombre;    //Con parametros
        this.apellido=apellido;
        this.cedula=cedula;
        this.edad=edad;
        this.transportes=new ArrayList<>();
    }
    
    //SET/GET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
     public void setTransporte (Transporte tipoT) {
        transportes.add(tipoT);
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getCedula() {
        return cedula;
    }
    
    //Otros metodos
     public ArrayList<Peligrosa> getMercanciasPeligrosas() {
        ArrayList<Peligrosa> peligrosas = new ArrayList<>();
        for (Transporte transporte : transportes) {
            if (transporte instanceof Peligrosa) {
                peligrosas.add((Peligrosa) transporte);
            }
        }
        return peligrosas;
    }

     public double sueldo() {
        double sueldoTotal = 0;
        for (Transporte transporte : transportes) {
            sueldoTotal += transporte.sueldo();
        }
        return sueldoTotal;
    }
    
}

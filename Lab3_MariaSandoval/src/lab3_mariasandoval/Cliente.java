/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_mariasandoval;

import java.util.ArrayList;

/**
 *
 * @author Maria Sandoval
 */
public class Cliente {
    //Atributos
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private ArrayList <OrdenComp> ordenC;
    
    //Constructores
    public Cliente (){ //Sin parametros
        nombre=apellido=direccion=" ";
        telefono=0;
        ordenC=new ArrayList<>();
    }
    
    public Cliente (String nombre, String apellido, String direccion, int telefono, ArrayList <OrdenComp> ordenC){
        this.nombre=nombre;     //Con parametros
        this.apellido=apellido;
        this.direccion=direccion;
        this.telefono=telefono;
        this.ordenC=ordenC;
    }
    
    //SET/GET

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setOrdenC(OrdenComp ordenC) {
        this.ordenC.add(ordenC);
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public ArrayList <OrdenComp> getOrdenC() {
        return ordenC;
    }
    
    //Otros metodos
    public void ImprimirInfo(){
        System.out.println("----------------------------- FACTURA -----------------------------");
        System.out.println("Nombre: "+nombre+" "+apellido);
        System.out.println("Direccion: "+direccion);
        System.out.println("Telefono: "+telefono);
        for (OrdenComp ordenC1: ordenC){
            ordenC1.ImprimirInfo();
            System.out.println("---------------------------------------------------------------------");
        }
    }
    
}

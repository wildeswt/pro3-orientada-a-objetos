/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_mariasandoval;

/**
 *
 * @author Labam
 */
public abstract class Guerreros {
    //Atributos
    private String nombre;
    private int edad;
    private int fuerza;
    private char estado;
    private int contador=0;
    
    //Constructores
    public Guerreros(){   //Sin parametros
        contador++;
        nombre="Guerrero"+contador;
        edad=15;
        fuerza=1;
        estado='V';
    }
    public Guerreros(String nombre, int edad, int fuerza, char estado) {
        this.nombre = nombre;   //Con parametros
        this.edad = edad;
        this.fuerza = fuerza;
        this.estado = estado;
    }
    
    //SET/GET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public char getEstado() {
        return estado;
    }
    
    //Otros métodos
     public static boolean validarEdad2(int edad) {
        return edad >= 5 && edad <= 60;
    }

    public static boolean validarFuerza(int fuerza) {
        return fuerza >= 1 && fuerza <= 10;
    }
    
    public static boolean validarEstado (char estado){
        return estado == 'V';
    }
    
    public abstract boolean retirarse ();
    public abstract void imprimirInfo ();
    public abstract Guerreros crearCopia (String nombre);
}
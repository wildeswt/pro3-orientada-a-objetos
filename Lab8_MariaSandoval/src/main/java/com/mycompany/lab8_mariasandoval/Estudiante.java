package com.mycompany.lab8_mariasandoval;

/**
 *
 * @author Labam
 */
public class Estudiante{
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double calificacion;
    
    //Constructores
    public Estudiante(){ //Sin parametros
        nombre=apellido=" ";
        edad=0;
        calificacion=0.00;
    }
    
    public Estudiante(String nombre, String apellido, int edad, double calificacion) throws NumeroNegativoExcepcion{
        this.nombre=nombre; //Con parametros
        this.apellido=apellido;
        if (edad < 0)
            throw new NumeroNegativoExcepcion("La edad no puede ser negativa");
        this.edad=edad;
        if (calificacion < 0)
            throw new NumeroNegativoExcepcion("La calificacion no puede ser negativa");
        this.calificacion=calificacion;
    }
    
    //SET/GET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) throws NumeroNegativoExcepcion {
        if (edad < 0)
            throw new NumeroNegativoExcepcion("La edad no puede ser negativa");
        this.edad=edad;
    }

    public void setCalificacion(double calificacion) throws NumeroNegativoExcepcion{
        if (calificacion < 0)
            throw new NumeroNegativoExcepcion("La calificacion no puede ser negativa");
        this.calificacion=calificacion;
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

    public double getCalificacion() {
        return calificacion;
    }
    
    //Otros metodos
    public void ImprimirInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Calificacion: "+calificacion);
    }
    
    public void ImprimirNombre(){
        System.out.print(" Nombre: "+nombre);
    }
    
    @Override
    public String toString(){
        return "Estudiante: "+nombre+" "+apellido+" Edad: "+edad+" Calificacion: "+calificacion;
    }
}

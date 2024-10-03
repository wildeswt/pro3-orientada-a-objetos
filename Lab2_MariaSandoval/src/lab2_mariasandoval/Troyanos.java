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
public class Troyanos extends Guerreros{
    //Atributos:(
    
    //Contructores
    public Troyanos (){
        super();
    }
    
    public Troyanos (String nombre, int edad, int fuerza, char estado) {
        super(nombre, edad, fuerza, estado);     //Con parametros
    }
    
    //Otros métodos
    @Override
    public boolean retirarse(){
        System.out.println("No puede retirarse de la batalla ya que es un Troyano");
        return false;
    }
    
    @Override
    public void imprimirInfo(){
        System.out.println("Nombre: "+getNombre()+" Edad: "+getEdad()+" "
                    + "Fuerza: "+getFuerza()+" Estado: "+getEstado());
    }
    
    @Override
    public Guerreros crearCopia(String nombre) {
        return new Troyanos(nombre, this.getEdad(), this.getFuerza(), this.getEstado());
    }
}
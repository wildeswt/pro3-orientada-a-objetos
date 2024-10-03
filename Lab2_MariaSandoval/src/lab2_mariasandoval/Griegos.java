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
public class Griegos extends Guerreros{
    //Atributos
    private boolean montado;
    
    //Contructores
    public Griegos() { //Sin parametros
        super();       
        montado=false;
    }

    public Griegos(String nombre, int edad, int fuerza, char estado, boolean montado) {
        super(nombre, edad, fuerza, estado);     //Con parametros
        this.montado=montado;
    }
    
    //SET/GET
    public void setMontado(boolean montado) {
        this.montado = montado;
    }

    public boolean isMontado() {
        return montado;
    }
    
    //Otros métodos
    @Override
    public boolean retirarse(){
        return getEstado() == 'V';
    }
    
    @Override
    public void imprimirInfo(){
        System.out.println("Nombre: "+getNombre()+" Edad: "+getEdad()+" "
                    + "Fuerza: "+getFuerza()+" Estado: "+getEstado());
    }
    
    @Override
    public Guerreros crearCopia(String nombre) {
        return new Griegos(nombre, this.getEdad(), this.getFuerza(), this.getEstado(), false);
    }
}
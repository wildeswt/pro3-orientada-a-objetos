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
public abstract class Transporte {
    //Atributos
    private int horasT;
    
    //Constructor
    public Transporte (){
        horasT=0;
    }
    
    public Transporte (int horasT){
        this.horasT=horasT;
    }
    //SET/GET
    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }
    
    public int getHorasT() {
        return horasT;
    }
    
    //Otros metodos
    public double sueldo() {
        return 700 + (5 * horasT) + SueldoE();
    }
    public abstract double SueldoE();
}

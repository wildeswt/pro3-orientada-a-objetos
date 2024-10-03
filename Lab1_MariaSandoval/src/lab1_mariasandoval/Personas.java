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
public class Personas extends Transporte {
    //Atributos
    int numPersonas;
    
    //Constructor 
    public Personas (){   //Sin parametros
        super();
        numPersonas=0;
    }
    
    public Personas (int horasT, int numPersonas){
        super(horasT);     //Con parametros
        this.numPersonas=numPersonas;
    }
    
    //SET/GET

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public int getNumPersonas() {
        return numPersonas;
    }
    
    //Otros metodos
    @Override
    public double SueldoE (){
        if (numPersonas <= 9)
            return 0.5*getHorasT();
        else
            return 1*getHorasT();
    }
}

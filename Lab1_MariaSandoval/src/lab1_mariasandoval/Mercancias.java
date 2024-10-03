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
public class Mercancias extends Transporte {
    //Atributos
    private double toneladas;
    
    //Constructor
    public Mercancias (){
        super();   //Sin parametros
        toneladas=0;
    }
    
    public Mercancias (int horasT, double toneladas){
        super(horasT);      //Con parametros
        this.toneladas=toneladas;
    }
    
    //SET/GET
    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    public double getToneladas() {
        return toneladas;
    }
    
    //Otros metodos
    @Override
    public double SueldoE (){
        return 2*toneladas;
    }
}

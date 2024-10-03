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
public class Peligrosa extends Mercancias {
    //Atributos
    int numTransportes;
    String tipoPeligro;
    
    //Constructores
    public Peligrosa (){
        super();    //Sin parametros
        numTransportes=0;
        tipoPeligro=" ";
    }
    
    public Peligrosa (int horasT, double toneladas, int numTransportes, String tipoPeligro){
        super(horasT, toneladas);    //Con parametros
        this.numTransportes=numTransportes;
        this.tipoPeligro=tipoPeligro;
    }
    
    //SET/GET
    public void setNumTransportes(int numTransportes) {
        this.numTransportes = numTransportes;
    }

    public void setTipoPeligro(String tipoPeligro) {
        this.tipoPeligro = tipoPeligro;
    }
    
    public int getNumTransportes() {
        return numTransportes;
    }

    public String getTipoPeligro() {
        return tipoPeligro;
    }
    
    //Otros metodos
    @Override
    public double SueldoE(){
        return super.SueldoE()+50*numTransportes;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class Cheque extends MetPago{
    //Atributos
    private String entidadB;
    private int numCh;
    
    //Constructores
    public Cheque() {
        super();     //Sin parametros
        entidadB="";
        numCh=0;
    }

    public Cheque(double monto, String entidadB, int numCh) {
        super(monto);     //Con parametros
        this.entidadB=entidadB;
        this.numCh=numCh;
    }
    
    //SET/GET
    public void setEntidadB(String entidadB) {
        this.entidadB = entidadB;
    }

    public void setNumCh(int numCh) {
        this.numCh = numCh;
    }

    public String getEntidadB() {
        return entidadB;
    }

    public int getNumCh() {
        return numCh;
    }
    
    //Otros metodos
    @Override
    public double CalcMonto(){
        return getMonto()+getMonto()*0.05;
    }
    
    @Override
    public void ImprimirInfo(){
        System.out.println("Met.Pago: Cheque. Entidad Bancaria: "+entidadB+" NUM: "+numCh);
    }
}

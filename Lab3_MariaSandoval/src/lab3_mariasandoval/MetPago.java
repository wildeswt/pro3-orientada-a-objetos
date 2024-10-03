/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public abstract class MetPago {
    //Atributos
    private double monto;
    
    //Constructor
    public MetPago (){
        monto=0.00;
    }
    public MetPago(double monto) {    
        this.monto = monto; //Con parametro
    }

    //SET/GET
    public void setMonto(double monto) {    
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    //Otros metodos
    public abstract void ImprimirInfo();
    public abstract double CalcMonto();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class Efectivo extends MetPago{
    //Atributos:((
    
    //Constructores
    public Efectivo(){  //Sin parametro
        super();
    }
    
    public Efectivo(double monto) {    
        super(monto);  //Con parametro
    }

    //SET/GET
    
    //Otros metodos
    @Override
    public double CalcMonto() {
        return getMonto()-getMonto()*0.15;
    }
    
    @Override
    public void ImprimirInfo(){
        System.out.println("Met.Pago: Efectivo."); 
    }
}
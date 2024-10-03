/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class TarjetaC extends MetPago {
    //Atributos
    private String fecha;
    private int num;
    private boolean visa;
    private boolean mastercard;
    
    //Constructores
    public TarjetaC (){  //Sin parametros
        super();
        fecha=" ";
        num=0;
        visa=mastercard=false;
    }
    
    public TarjetaC(double monto, String fecha, int num, boolean visa, boolean mastercard) {
        super (monto);
        this.fecha = fecha;  //Con parametros
        this.num = num;
        this.visa = visa;
        this.mastercard = mastercard;
    }
    
    //SET/GET

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setVisa(boolean visa) {
        this.visa = visa;
    }

    public void setMastercard(boolean mastercard) {
        this.mastercard = mastercard;
    }

    public String getFecha() {
        return fecha;
    }

    public int getNum() {
        return num;
    }

    public boolean isVisa() {
        return visa;
    }

    public boolean isMastercard() {
        return mastercard;
    }
    
    //Otros metodos
    @Override
    public double CalcMonto (){
        return getMonto()+getMonto()*0.10;
    }
    
    @Override
    public void ImprimirInfo(){
       System.out.print("Met.Pago: Tarjeta de Credito NUM: "+num);
       if (visa)
           System.out.println(" VISA");
       if (mastercard)
           System.out.println(" MASTERCARD");
    }
}

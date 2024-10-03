/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_mariasandoval;

import java.util.ArrayList;

/**
 *
 * @author Maria Sandoval
 */
public class OrdenComp {
    //Atributos
    private int identificador;
    private String fechaform;
    private ArrayList <MetPago> metodoP;
    private int cantPagos;
    private ArrayList <LineaPedido> lineasP;
    
    //Constructores
    public OrdenComp (){  //Sin parametros
        identificador=cantPagos=0;
        fechaform=" ";
        lineasP= new ArrayList<>();
        metodoP=new ArrayList <>();
    }
    
    public OrdenComp (int identificador, String fechaform, int cantPagos, ArrayList <MetPago> metodoP){
        this.identificador=identificador;  //Con parametros
        this.fechaform=fechaform;
        this.cantPagos=cantPagos;
        this.lineasP= new ArrayList<>();
        this.metodoP=metodoP;
    }
    
    //SET/GET

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setFechaform(String fechaform) {
        this.fechaform = fechaform;
    }

    public void setMetodoP(MetPago metodoP) {
        this.metodoP.add(metodoP);
    }

    public void setCantPagos(int cantPagos) {
        this.cantPagos = cantPagos;
    }

    public void setLineasP(ArrayList<LineaPedido> lineasP) {
        this.lineasP = lineasP;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getFechaform() {
        return fechaform;
    }

    public ArrayList <MetPago> getMetodoP() {
        return metodoP;
    }

    public int getCantPagos() {
        return cantPagos;
    }

    public ArrayList<LineaPedido> getLineasP() {
        return lineasP;
    }

    //Otros metodos
    public void AgregarLP (LineaPedido lineaP){
        lineasP.add(lineaP);
    }
    
   public double[] CalcTotal() {
    double[] montoTotal = new double[metodoP.size()];
    for (int i=0; i<metodoP.size(); i++) {
        metodoP.get(i).setMonto(CalcSubT()/cantPagos);
        montoTotal[i] = metodoP.get(i).CalcMonto();
    }
    return montoTotal;
}
    
    public double CalcSubT(){
        double montoT=0;
        for (LineaPedido lineaP: lineasP)
            montoT+=lineaP.CalcSubtotal();
        return montoT;
    }
    
    public void ImprimirInfo(){
        System.out.println("Fecha de formalizacion: " + fechaform);
        System.out.println("Identificador: " + identificador);
        System.out.println("Pedido(s): ");
        for (LineaPedido lineaP : lineasP)
            lineaP.ImprimirInfo();
        System.out.println("SUBTOTAL: " + CalcSubT());
        double[] montos=CalcTotal();
        if (cantPagos == 1) {
            System.out.print("MONTO TOTAL A PAGAR: ");
            System.out.println(" "+montos[0]);
        }else{
            System.out.println("MONTOS A PAGAR DE ACUERDO A LOS METODOS DE PAGOS ELEGIDOS: ");
            for (int i = 0; i < metodoP.size(); i++) {
                int j=i+1;
                System.out.println("Pago ("+j+")");
                metodoP.get(i).ImprimirInfo();
                System.out.println(" " + montos[i]);
            }
        }
    }
}

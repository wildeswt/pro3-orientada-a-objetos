/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class LineaPedido {
    //Atributos
    private int identificador;
    private int cantidad;
    private Articulo articulo;
    private static int cont=1;
    
    //Constructores
    public LineaPedido(){  //Sin parametros
        identificador=cont++;
        cantidad=0;
        articulo=null;
        cont++;
    }
    
    public LineaPedido(int cantidad, Articulo articulo){
        this.identificador=cont++;  //Con parametros
        this.cantidad=cantidad;
        this.articulo=articulo;
    }
    
    //SET/GET

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Articulo getArticulo() {
        return articulo;
    }
    
    //Otros metodos
    public void ImprimirInfo (){
        System.out.println(""+identificador+" Articulo: "+articulo.getNombre()+" Cantidad: "+cantidad+" Precio: "+CalcSubtotal());
    }
    
    public double CalcSubtotal(){
        return cantidad*articulo.CalcPrecioF();
    }
}

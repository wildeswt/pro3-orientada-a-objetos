/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class Articulo {
    //Atributos
    private int codigo;
    private String nombre;
    private String descripcion;
    private int stock;
    private double precio;
    private double impuesto;
    
    //Constructores
    public Articulo (){ //Sin parametros
        codigo=stock=0;
        nombre=descripcion=" ";
        precio=impuesto=0.00;
    }
    
    public Articulo(int codigo, String nombre, String descripcion, int stock, double precio, double impuesto) {
        this.codigo = codigo;   //Con parametros
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.impuesto = impuesto;
    }
    
    //SET/GET

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public double getImpuesto() {
        return impuesto;
    }
    
    //Otros metodos
    public void ImprimirInfo(){
        System.out.println("---------- INFORMACION DEL ARTICULO ----------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Descripcion: "+descripcion);
        System.out.println("Precio: "+precio);
        System.out.println("Impuesto: "+impuesto);
        System.out.println("Stock: "+stock);
    }
    
    public double CalcPrecioF(){
        return precio+precio*impuesto;
    }
    
    public boolean ConsultarStock(int cantidad){
        if (cantidad==stock){
            stock=0;
            return true;
        }
        if (cantidad>stock)
            return false;
        stock-=cantidad;
        return true;
    }
}

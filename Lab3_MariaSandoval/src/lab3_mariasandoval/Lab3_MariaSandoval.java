/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_mariasandoval;

import java.util.ArrayList;

/**
 *
 * @author Maria Sandoval
 */
public class Lab3_MariaSandoval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Prueba: ");
        //Articulos
        Articulo articulo1= new Articulo(1, "Carpeta", "Carpeta anillada metalica", 7, 15, 0.16);
        Articulo articulo2= new Articulo(2, "Tinta", "Tinta china de color negro", 6, 30, 0.16);
        Articulo articulo3= new Articulo(2, "Cinta Pegante", "Cinta adhesiva de color transparente", 10, 80, 0.16);
        Articulo articulo4= new Articulo(2, "Cartulina", "Pliego de cartulina 60 x 40 cm", 8, 60, 0.16);
        
        //Lineas de pedido
        LineaPedido lineaP1= new LineaPedido(5, articulo1);
        LineaPedido lineaP2= new LineaPedido(3, articulo2);
        LineaPedido lineaP3= new LineaPedido(2, articulo3);
        LineaPedido lineaP4= new LineaPedido(4, articulo4);
        
        //Metodo de pago
        MetPago metodoP= new TarjetaC(0.00, "07/07/25", 12453733, true, false);
        MetPago metodoP2= new Efectivo(0.00);
        MetPago metodoP3= new Cheque(0.00,"BANESCO", 8893478);
        ArrayList <MetPago> metodosPagos= new ArrayList<>();
        metodosPagos.add(metodoP);
        metodosPagos.add(metodoP2);
        metodosPagos.add(metodoP3);
        //Orden de compra
        OrdenComp ordenC= new OrdenComp(1254, "02/05/24", 3, metodosPagos);
        ordenC.AgregarLP(lineaP1);
        ordenC.AgregarLP(lineaP2);
        ordenC.AgregarLP(lineaP3);
        ordenC.AgregarLP(lineaP4);
        ArrayList <OrdenComp> ordenCompras= new ArrayList<>();
        ordenCompras.add(ordenC);
        
        //Crear cliente
        Cliente cliente= new Cliente("Maria","Sandoval","Unare II",87676434, ordenCompras);
        cliente.ImprimirInfo();
    }
}

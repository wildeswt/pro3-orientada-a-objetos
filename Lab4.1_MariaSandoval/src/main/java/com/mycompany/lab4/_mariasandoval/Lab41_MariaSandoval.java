/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4._mariasandoval;

/**
 *
 * @author Labam
 */
public class Lab41_MariaSandoval {

    public static void main(String[] args) {
        Almacen almacen= new Almacen(3,0);
        try{
            Objeto obj1= new Objeto(4555, 999);
            Objeto obj2= new Objeto("Mariiia", 30994533);
            Objeto obj3= new Objeto(3.77, 888);
            Objeto obj4= new Objeto(true, 8);
            almacen.AgregarObj(obj1);
            almacen.AgregarObj(obj2);
            almacen.AgregarObj(obj3);
            almacen.AgregarObj(obj4);
        }catch(LlenoExcepcion e){
            System.out.println("Error: "+e.getMessage());
        }
        almacen.ImprimirInfo();
        Objeto objB= almacen.BuscarObjeto(8);
        if (objB != null){
            System.out.println("\nObjeto encontrado: ");
            objB.ImprimirInfo();
        } else
            System.out.println("\nObjeto no encontrado.");
    }
}

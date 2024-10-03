 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4_mariasandoval;

/**
 *
 * @author Labam
 */
public class Lab4_MariaSandoval {
    /**
    * Método principal de prueba de la clase Vector
     * @param args
    */
    public static void main(String[] args) {
        try{
            // crea vector (1, 2, 3)
            Vector v3a = new Vector(3);
            v3a.cambiaComponente(0, 1);
            v3a.cambiaComponente(1, 2);
            v3a.cambiaComponente(2, 3);
            
            // crea vector (10, 20, 30)
            Vector v3b = new Vector(3);
            v3b.cambiaComponente(0, 10);
            v3b.cambiaComponente(1, 20);
            v3b.cambiaComponente(2, 30);
            
            // crea vector (0, 0, 0, 0)
            Vector v4a = new Vector(4);
            v4a.Suma(v3a, v3b);
            
            v3a.ImprimirInfo();
            System.out.println();
            v3b.ImprimirInfo();
            System.out.println();
            v4a.ImprimirInfo();
            System.out.println();
            v4a.Acumula(v4a,v3a);
            v4a.ImprimirInfo();
        }catch(DimensionExcepcion e){
            System.out.println("Error: "+e.getMessage());
        }catch (IndiceExcepcion e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

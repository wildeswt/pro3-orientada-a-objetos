package com.mycompany.lab5_mariasandoval;

/**
 *
 * @author Labam
 */
public class Lab5_MariaSandoval {
    public static void main(String[] args) {
        try{
        //Crear pilas
        Pila<Object> pila1= new Pila<> (4);
        Pila<Object> pila2= new Pila<> (5);
        
        //Crear objetos
        Carta carta1=new Carta("Negro", "Picas", 7);
        Carta carta2= new Carta("Negro", "Treboles", 2);
        Carta carta3= new Carta("Rojo", "Corazones", 4);
        Carta carta4= new Carta("Rojo", "Diamantes", 10);
        Libro libro1= new Libro("La metamorfosis", "Franz Kafka");
        Libro libro2= new Libro("El secreto", "Donna Tart");
        Libro libro3= new Libro("El principito", "Antoine de Saint-Exupéry");
        Libro libro4= new Libro("El extranjero", "Albert Camus");
        Libro libro5= new Libro("Almendra", "Sohn Won-pyung");
        
        //Annadir elementos a las pilas
        pila1.Apilar(carta1);
        pila1.Apilar(carta2);
        pila1.Apilar(carta3);
        pila1.Apilar(carta4);
        
        pila2.Apilar(libro1);
        pila2.Apilar(libro2);
        pila2.Apilar(libro3);
        pila2.Apilar(libro4);
        pila2.Apilar(libro5);
        
        //Imprimir pilas
        System.out.println("Pila 1:");
        pila1.ImprimirInfo();
        System.out.println();
        System.out.println("Pila 2:");
        pila2.ImprimirInfo();
        
        //Mezclar pilas
        System.out.println("\nPila mezcla de pila1 y pila2:\n");
        Pila<Object> aux=pila1.mezcla(pila2);
        aux.ImprimirInfo();
        }catch(TamannoInvalidoExcepcion | PilaLlenaExcepcion | PilaVaciaExcepcion e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

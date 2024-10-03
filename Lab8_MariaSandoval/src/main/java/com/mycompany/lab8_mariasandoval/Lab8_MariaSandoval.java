package com.mycompany.lab8_mariasandoval;
/**
 *
 * @author Labam
 */
public class Lab8_MariaSandoval {

    public static void main(String[] args)  {
        try{
            //Crear instancias
            Estudiante est1=new Estudiante("Maria", "Sandoval", 18, 15);
            Carro carro1= new Carro("Ford", "Fiesta", "Plateado", "FBY405V", 34.22);
            Estudiante est2= new Estudiante("Samuel", "Guzman", 19, 0);
            Carro carro2= new Carro("Ford", "Explorer", "Azul Marino", "HJ67T28", 98.00);
            Estudiante est3= new Estudiante("Taylor", "Swift", 34, 20);
            Carro carro3= new Carro("Fiat", "Palio", "Rojo", "A67FR21", 27.00);
            MatrizGenerica matriz= new MatrizGenerica(4,4);
            
            //Agregar elementos
            matriz.EstablecerElem(0, 0, est1);
            matriz.EstablecerElem(0, 1, carro1);
            matriz.EstablecerElem(1, 1 , est2);
            matriz.EstablecerElem(2, 2, carro2);
            matriz.EstablecerElem(0, 3 , est2);
            matriz.EstablecerElem(2, 3, carro2);
            
            //Prueba de funciones
            System.out.println("Matriz completa: ");
            matriz.Imprimir();
            
            //Estudiantes
            System.out.println("\nMatriz de Estudiantes: ");
            matriz.ImprimirEst();
            System.out.println("\nCantidad de estudiantes: "+matriz.CantEst());
            System.out.println("Promedio de notas: "+matriz.PromedioNotas());
            
            //Carros
            System.out.println("\nMatriz de Carros: ");
            matriz.ImprimirCarro();
            System.out.println("\nCantidad de carros: "+matriz.CantCarros());
            System.out.println("Promedio de kilometrajes: "+matriz.PromedioKilometraje());
            
            //Buscar objetos
            Object encontrado1=matriz.BuscarObjeto(0, 3);
            if(encontrado1 instanceof Estudiante est){
                System.out.println("\nEl objeto ha sido encontrado:");
                est.ImprimirInfo();
            }else if (encontrado1 instanceof Carro carro){
                System.out.println("El objeto ha sido encontrado:");
                carro.ImprimirInfo();
            }
            Object encontrado2=matriz.BuscarObjetoPalabra("Explorer");
            System.out.println();
            if(encontrado2 instanceof Estudiante est){
                System.out.println("El objeto ha sido encontrado:");
                est.ImprimirInfo();
            }else if (encontrado2 instanceof Carro carro){
                System.out.println("El objeto ha sido encontrado:");
                carro.ImprimirInfo();
            }
        }catch(NumeroNegativoExcepcion | MatrizVaciaExcepcion | MatrizLlenaExcepcion | 
                PosicionNoValidaExcepcion | PosicionOcupadaExcepcion e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

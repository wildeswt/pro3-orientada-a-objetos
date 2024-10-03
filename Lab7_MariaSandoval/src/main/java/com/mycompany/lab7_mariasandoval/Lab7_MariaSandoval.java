package com.mycompany.lab7_mariasandoval;

import java.util.Scanner;

/**
 *
 * @author Labam
 */
public class Lab7_MariaSandoval {
    public static void main(String[] args) {
        ListaCantantesFamosos lista= new ListaCantantesFamosos();
        Scanner entrada= new Scanner(System.in);
        int opcion=0;
        while (opcion != 7){
            System.out.println("-------------------------- MENU --------------------------");
            System.out.println("     1. Agregar cantante(s) famoso(s)");
            System.out.println("     2. Eliminar cantante famoso");
            System.out.println("     3. Buscar cantante famoso");
            System.out.println("     4. Tamaño de la lista de cantantes famosos");
            System.out.println("     5. Ordenar lista de cantantes famosos");
            System.out.println("     6. Imprimir lista de cantantes famosos");
            System.out.println("     7. Salir");
            opcion= entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:
                    char opcion2='s';
                    while (opcion2!='n'){
                        //Ingresar informacion
                        System.out.println("Ingrese el nombre del cantante: ");
                        String nombre=entrada.nextLine();
                        System.out.println("Ingrese el nombre del disco con mas ventas: ");
                        String disco=entrada.nextLine();
                        System.out.println("Ingrese la duracion del disco: ");
                        int duracion= entrada.nextInt();
                        System.out.println("Ingrese el anno de emision: ");
                        int annoEmision= entrada.nextInt();
                        entrada.nextLine();
                        CantanteFamoso cantante= new CantanteFamoso(nombre, disco, duracion, annoEmision);
                        lista.Agregar(cantante);
                        System.out.println("Lista actualizada: ");
                        lista.Imprimir();
                        System.out.println("\nDesea ingresar otro cantante? s/n");
                        opcion2=entrada.nextLine().charAt(0);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del famoso que desea eliminar: ");
                    String nombre= entrada.nextLine();
                    CantanteFamoso cantante= lista.Buscar(nombre);
                    if(cantante != null){
                        lista.Eliminar(cantante);
                        System.out.println("Cantante eliminado exitosamente");
                    }else 
                        System.out.println("Cantante no encontrado");
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del famoso que desea encontrar: ");
                    String nombre2= entrada.nextLine();
                    CantanteFamoso cantante2= lista.Buscar(nombre2);
                    if(cantante2 != null){
                        System.out.println("Cantante encontrado");
                        cantante2.ImprimirInfo();  
                    }else 
                        System.out.println("Cantante no encontrado");
                    break;
                case 4:
                    System.out.println("El tamanno de la lista es: "+lista.Tamanno());
                    break;
                case 5:
                    System.out.println("------------------ ORDENAR ------------------");
                    System.out.println("  1. Por nombre.");
                    System.out.println("  2. Por nombre del disco mas vendido.");
                    System.out.println("  3. Por anno de emision.");
                    System.out.println("  4. Por duracion.");
                    System.out.println("  5.Salir");
                    int resp= entrada.nextInt();
                    switch(resp){
                        case 1:
                            lista.ordenarPorNombre();
                            break;
                        case 2:
                            lista.ordenarPorDisco();
                            break;
                        case 3:
                            lista.ordenarPorAnno();
                            break;
                        case 4:
                            lista.ordenarPorDuracion();
                            break;
                        default:
                            break;
                    }
                    break;
                case 6:
                    lista.Imprimir();
                    break;
                default :
                    System.out.println("Cerrando programa...");
                    break;
            }
        }
    }
}

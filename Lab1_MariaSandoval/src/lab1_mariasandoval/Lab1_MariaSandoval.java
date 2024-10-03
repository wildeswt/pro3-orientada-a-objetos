/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_mariasandoval;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Labam
 */
public class Lab1_MariaSandoval {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        List<Conductor> conductores= new ArrayList<>();
        char opcion=' ';
        while (opcion != 'E'){
            System.out.println("\n--------------------- MENU ---------------------");
            System.out.println("   Seleccione una de las siguientes opciones:");
            System.out.println("A) Añadir conductor");
            System.out.println("B) Añadir tipo de transporte a conductor");
            System.out.println("C) Imprimir lista de transportes peligrosos");
            System.out.println("D) Informe de sueldos");
            System.out.println("E) Salir");
            System.out.print("Opcion: ");
            char aux=entrada.next().charAt(0);
            opcion=Character.toUpperCase(aux);
            entrada.nextLine();
            switch (opcion){
                case 'A' :{
                    System.out.println("-------------------------------------------");
                    System.out.print("Ingrese el nombre de su conductor: ");
                    String nombre=entrada.nextLine();
                    System.out.print("Ingrese el apellido de su conductor: ");
                    String apellido=entrada.nextLine();
                    System.out.print("Ingrese la edad de su conductor: ");
                    int edad=entrada.nextInt();
                    System.out.print("Ingrese su cedula de identidad: ");
                    int cedula=entrada.nextInt();
                    Conductor conductor= new Conductor (nombre, apellido, edad, cedula);
                    if (!conductores.contains(conductor)) {
                        conductores.add(conductor);
                        System.out.println("El conductor fue registrado exitosamente");
                    } else {
                        System.out.println("El conductor ya está registrado");
                    }
                    break;
                }
                case 'B' :{
                    System.out.println("-------------------------------------------");
                    System.out.print("Ingrese la cedula del conductor: ");
                    int cedula=entrada.nextInt();
                    boolean encontrado=false;
                    Conductor encontradoC= new Conductor ();
                    for (Conductor conductor : conductores) {
                        if (conductor.getCedula() == cedula){
                            encontrado=true;
                            encontradoC=conductor;
                        }
                    }
                    if (encontrado){
                        System.out.println("Ingrese el tipo de transporte que realiza: ");
                        System.out.println("     1. Personas");
                        System.out.println("     2. Mercancias");
                        System.out.print("Opcion: ");
                        int resp=entrada.nextInt();
                        if (resp == 1){
                              System.out.println("-----------------------------------------------");
                              System.out.print("Ingrese el numero de horas trabajadas: ");
                              int horasT=entrada.nextInt();
                              System.out.print("Ingrese el numero de personas transportadas: ");
                              int numPersonas=entrada.nextInt();
                              Transporte transporte= new Personas(horasT, numPersonas);
                              encontradoC.setTransporte(transporte);
                        }else if (resp == 2){
                               System.out.println("-----------------------------------------------");
                               System.out.print("Ingrese el numero de horas trabajadas: ");
                               int horasT=entrada.nextInt();
                               System.out.print("Ingrese las toneladas: ");
                               double toneladas=entrada.nextDouble();
                               System.out.print("Transporta mercancia peligrosa? (S/N): ");
                               char aux2=entrada.next().charAt(0);
                               char resp2=Character.toUpperCase(aux2);
                               entrada.nextLine();
                               if(resp2 == 'S'){
                                   System.out.print("Que tipo de mercancia peligrosa transporta: ");
                                   String tipoPeligro=entrada.nextLine();
                                   System.out.print("Ingrese la cantidad de transportes realizados: ");
                                   int numTransportes=entrada.nextInt();
                                   Transporte transporte= new Peligrosa(horasT, toneladas, numTransportes, tipoPeligro);
                                   encontradoC.setTransporte(transporte);
                               }else if (resp2  == 'N'){
                                   Transporte transporte= new Mercancias(horasT, toneladas);
                                   encontradoC.setTransporte(transporte);
                               }
                               System.out.println("Transporte registrado exitosamente");
                        }
                    }else{
                        System.out.println("El conductor no está registrado");
                    }
                    break;
                } 
                case 'C' :{
                    System.out.println("-------------------------------------------");
                    System.out.print("Ingrese la cedula del conductor: ");
                    int cedula=entrada.nextInt();
                    boolean encontrado=false;
                    ArrayList<Peligrosa> mercanciasPeligrosas = new ArrayList<>();
                    for (Conductor conductor : conductores) {
                        if (conductor.getCedula() == cedula){
                            encontrado=true;
                            mercanciasPeligrosas = conductor.getMercanciasPeligrosas();
                        }
                     }
                    if (encontrado){
                       System.out.println("Mercancías peligrosas transportadas:");
                        for(Peligrosa  peligrosas: mercanciasPeligrosas) {
                                System.out.println("Tipo de peligro: " + peligrosas.getTipoPeligro());
                        }
                    }else
                        System.out.println("El conductor no está registrado");
                    break;
                }
                case 'D' :{
                    System.out.println("\n--------------------------------------------------------------------------");
                    System.out.println("                          INFORME DE SUELDOS");
                    System.out.println("--------------------------------------------------------------------------");
                    for (Conductor conductor : conductores) {
                        System.out.println("CI: " + conductor.getCedula() + " / Nombre: " + conductor.getNombre() + 
                                " Apellido: " + conductor.getApellido() + " / Sueldo: " + conductor.sueldo() + "$");
                    }
                    break;
                }
                default :{
                    break;
                }   
            }
        }
    }
}
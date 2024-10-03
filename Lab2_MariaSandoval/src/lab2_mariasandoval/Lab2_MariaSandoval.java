/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_mariasandoval;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Labam
 */
public class Lab2_MariaSandoval {
    
    public static boolean validarEntero (int num) {
        return num>=0;
    }
    
     public static boolean validarString(String str) {
        return str!=null && !str.isEmpty();
    }
     
    public static boolean validarEstado2(char estado) {
        return estado=='V' || estado=='H' || estado=='M';
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        List <Guerreros> guerreros= new ArrayList <>();
        System.out.println("Ingrese la capacidad del caballo de troya: ");
        int capacidad=entrada.nextInt();
        CaballoT caballoTroya= new CaballoT (capacidad);
        int opcion=0;
        while (opcion != 10){
            System.out.println("----------------------- MENU -----------------------");
            System.out.println("  1. Crear nuevo guerrero");
            System.out.println("  2. Montar guerrero al Caballo de Troya");
            System.out.println("  3. Desmontar guerrero del Caballo de Troya");
            System.out.println("  4. Mostrar informacion de los guerreros");
            System.out.println("  5. Mostrar información de los guerreros");
            System.out.println("     en el Caballo de Troya");
            System.out.println("  6. Buscar guerrero en el Caballo de Troya");
            System.out.println("  7. Modificar estado del guerrero (V/H/M)");
            System.out.println("  8. Crear copia de un guerrero");
            System.out.println("  9. Retirar guerrero de la batalla");
            System.out.println("  10. Salir");
            System.out.print("  Opcion: ");
            opcion=entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:{
                    //Crear nuevo guerrero
                    boolean correcto=false;
                    while (!correcto){
                        System.out.println("Desea crearlo con datos por defecto? (S/N): ");
                        char aux=entrada.next().charAt(0);
                        char opcion2=Character.toUpperCase(aux);
                        entrada.nextLine();
                        switch (opcion2) {
                            //Datos por defecto
                            case 'S':{
                                System.out.print("Desea crear un Griego (1) o un Troyano (2) ?: ");
                                int opcion3= entrada.nextInt();
                                if (!validarEntero(opcion3)) {
                                    System.out.println("La opcion no puede ser negativa");
                                    continue;
                                }
                                if (opcion3==1){
                                    Guerreros newGuerrero =new Griegos();
                                    guerreros.add(newGuerrero);
                                }else if(opcion3==2){
                                    Guerreros newGuerrero =new Troyanos();
                                    guerreros.add(newGuerrero);
                                }
                                break;
                            }
                            //Datos ingresados por consola
                            case 'N':{
                                System.out.print("Ingrese el nombre para su guerrero: ");
                                String nombre=entrada.nextLine();
                                if (!validarString(nombre)) {
                                    System.out.println("El nombre no puede ser nulo ni vacío.");
                                    continue;
                                }
                                boolean encontrado=false;
                                for (Guerreros guerrero: guerreros){
                                    if (guerrero.getNombre().equals(nombre)){
                                        System.out.println("Ya existe un guerrero con ese nombre");
                                        encontrado=true;
                                        break;
                                    }
                                }
                                if(encontrado){
                                    System.out.print("Ingrese otro nombre: ");
                                    nombre=entrada.nextLine();
                                }
                                if (!validarString(nombre)) {
                                    System.out.println("El nombre no puede ser nulo ni vacío.");
                                    continue;
                                }
                                System.out.print("Ingrese la edad del guerrero: ");
                                int edad=entrada.nextInt();
                                if (!validarEntero(edad)) {
                                    System.out.println("La edad no puede ser negativa");
                                    continue;
                                }       
                                if(!Guerreros.validarEdad2(edad))
                                    edad=25;
                                System.out.print("Ingrese la fuerza para del guerrero: ");
                                int fuerza=entrada.nextInt();
                                if (!validarEntero(fuerza)) {
                                    System.out.println("La fuerza no puede ser negativa");
                                    continue;
                                }       
                                if(!Guerreros.validarFuerza(fuerza))
                                    fuerza=5;
                                entrada.nextLine();
                                System.out.print("Ingrese el estado del guerrero, vivo (V), herido (H) o muerto (M): ");
                                char aux2=entrada.next().charAt(0);
                                char estado=Character.toUpperCase(aux2);
                                if (!validarEstado2(estado)){
                                    System.out.println("El estado debe ser 'V', 'H' o 'M'. Intente nuevamente");
                                    continue;
                                }
                                if (!Guerreros.validarEstado(estado))
                                    estado='V';
                                System.out.print("Desea crear un Griego (1) o un Troyano (2) ?: ");
                                int opcion3= entrada.nextInt();
                                if (!validarEntero(opcion3)) {
                                    System.out.println("La opcion no puede ser negativa");
                                    continue;
                                }
                                if (opcion3==1){
                                    Guerreros newGuerrero =new Griegos(nombre,edad, fuerza, estado, false);
                                        guerreros.add(newGuerrero);
                                }else if(opcion3==2){
                                    Guerreros newGuerrero =new Troyanos(nombre,edad, fuerza, estado);
                                        guerreros.add(newGuerrero);
                                }       
                                break;
                            }
                            default:
                                System.out.println("Opcion incorrecta. Intente nuevamente");
                                continue;
                        }
                        correcto=true;
                    }
                    break;
                }
                case 2:{
                    //Montar guerreros al caballo de troya
                    System.out.print("Ingrese el nombre del guerrero que desea montar al caballo de troya: ");
                    String nombre=entrada.nextLine();
                    Guerreros aux=null;
                    if (!validarString(nombre)) {
                        System.out.println("El nombre no puede ser nulo ni vacío.");
                        break;
                    }   
                    for (Guerreros guerrero: guerreros){
                        if(guerrero.getNombre().equals(nombre)){
                            aux=guerrero;
                            break;
                        }
                    }
                    if (aux != null){
                        int result=caballoTroya.montar(aux);
                        if (result==-1){
                            System.out.println("El caballo de troya esta lleno");
                            break;
                        }
                        if (result==-2){
                            System.out.println("Solo se pueden montar Griegos al caballo de troya");
                            break;
                        }
                        System.out.println("El guerrero fue montado exitosamente");
                        System.out.println("Hay en total "+result+" guerrero(s) montado(s)");
                    }else
                        System.out.println("No existe un guerrero con ese nombre");
                    break;
                }
                case 3:{
                    //Desmontar guerreros del caballo de troya
                    System.out.print("Ingrese el nombre del guerrero que desea bajar del caballo de troya: ");
                    String nombre=entrada.nextLine();
                    if (!validarString(nombre)) {
                        System.out.println("El nombre no puede ser nulo ni vacío.");
                        break;
                    }
                    Guerreros aux=null;
                    for (Guerreros guerrero: guerreros){
                        if (guerrero.getNombre().equals(nombre)){
                           aux=guerrero;
                           break;
                        }
                    }
                    if (aux != null){
                        if (aux instanceof Griegos){
                            caballoTroya.desmontar((Griegos) aux);
                        }else
                            System.out.println("El guerrero no es un griego");
                    }else
                        System.out.println("No existe un guerrero con ese nombre");
                    break;
                }
                case 4:{
                    //Imprmir la informacion de todos los guerreros en la batalla
                    System.out.println("---------------------- INFORMACION DE LOS GUERREROS ----------------------");
                    for (Guerreros guerrero: guerreros){
                        guerrero.imprimirInfo();
                    }
                    System.out.println("--------------------------------------------------------------------------");
                    break;
                }
                case 5:{
                    //Imprimir la infromacion de los guerreros montados en el caballo de troya
                    caballoTroya.imprimirInfo();
                    break;
                }
                case 6:{
                    //Buscar guerreros en el caballo de troya
                    System.out.print("Ingrese el nombre del guerrero que desea buscar en el caballo de troya: ");
                    String nombre=entrada.nextLine();
                    if (!validarString(nombre)) {
                        System.out.println("El nombre no puede ser nulo o vacio");
                        break;
                    }
                    boolean encontrado=false;
                    for (Guerreros guerrero: guerreros){
                        if(guerrero.getNombre().equals(nombre))
                            encontrado=true;
                    }
                    if (encontrado){
                        int result=caballoTroya.buscarG(nombre);
                        if(result==-1){
                            System.out.println("El guerrero "+nombre+" no se encuentra montado en el caballo de troya");
                        }else
                            System.out.println("El guerrero "+nombre+" se encuentra montado en el caballo de troya y ocupa la posicion "+result);
                    }else
                        System.out.println("No existe un guerrero con ese nombre");
                    break;
                }
                case 7:{
                    //Cambiar el estado de un guerrero
                    System.out.print("Ingrese el nombre del guerrero al cual desea cambiarle el estado: ");
                    String nombre=entrada.nextLine();
                    if (!validarString(nombre)) {
                        System.out.println("El nombre no puede ser nulo o vacio");
                        break;
                    }
                    Guerreros aux=null;
                    for (Guerreros guerrero: guerreros){
                        if (guerrero.getNombre().equals(nombre)){
                           aux=guerrero;
                           break;
                        }
                    }
                    if (aux != null){
                        System.out.println("Ingrese el estado que desea colocarle al guerrero");
                        System.out.println(" Vivo (V)   Muerto (M)   Herido (H)");
                        char aux2=entrada.next().charAt(0);
                        char nuevoEstado=Character.toUpperCase(aux2);
                        if (!validarEstado2(nuevoEstado)){
                                System.out.println("El estado debe ser 'V', 'H' o 'M'. Intente nuevamente");
                                break;
                        }
                        aux.setEstado(nuevoEstado);
                        System.out.println("El estado de su guerrero fue modificado correctamente");
                        if (nuevoEstado == 'M'){
                            if (aux instanceof Griegos){
                                if (((Griegos) aux).isMontado())
                                    caballoTroya.desmontar((Griegos) aux);
                            }
                        }
                    }else
                        System.out.println("No existe un guerrero con ese nombre");
                    break;
                }
                case 8:{
                    //Copiar guerreros
                    System.out.print("Ingrese el nombre del guerrero que desea copiar : ");
                    String nombre=entrada.nextLine();
                    if (!validarString(nombre)) {
                        System.out.println("El nombre no puede ser nulo o vacio");
                        break;
                    }   
                    Guerreros aux=null;
                    for(Guerreros guerrero: guerreros){
                        if(guerrero.getNombre().equals(nombre)){
                            aux=guerrero;
                            break;
                        }
                    }
                    if (aux != null) {
                        System.out.println("Ingrese el nombre para la copia del guerrero: ");
                        String copiaNombre=entrada.nextLine();
                        if (!validarString(copiaNombre)) {
                            System.out.println("El nombre no puede ser nulo ni vacío.");
                            break;
                        }   
                        Guerreros copiaG=aux.crearCopia(copiaNombre);
                        if (copiaG != null) {
                            guerreros.add(copiaG);
                            System.out.println("Se ha creado una copia del guerrero griego exitosamente.");
                        }else
                            System.out.println("No se pudo crear la copia del guerrero.");
                    }else
                        System.out.println("No existe un guerrero con ese nombre");
                    break;
                }
                case 9:{
                    //Retirar guerreros de la batalla
                    System.out.print("Ingrese el nombre del guerrero que desea retirar de la batalla: ");
                    String nombre=entrada.nextLine();
                    if (!validarString(nombre)) {
                        System.out.println("El nombre no puede ser nulo o vacio");
                        break;
                    }
                    Guerreros aux=null;
                    for (Guerreros guerrero: guerreros){
                        if (guerrero.getNombre().equals(nombre)){
                           aux=guerrero;
                           break;
                        }
                    }
                    if (aux != null){
                        boolean resp=aux.retirarse();
                        if (aux instanceof Griegos){
                            if (resp){
                                System.out.println("Guerrero retirado de la batalla exitosamente");
                                if(((Griegos) aux).isMontado())
                                    caballoTroya.desmontar((Griegos) aux);
                                guerreros.remove(aux);
                            }else
                                System.out.println("No se puede retirar de la batalla ya que se encuentra herido o muerto");
                        }   
                    }else
                        System.out.println("No existe un guerrero con ese nombre");
                    break;
                }
                default:{
                    System.out.println("Cerrando programa...");
                    break;
                }
            }
        }
    }
}
package com.mycompany.lab7_mariasandoval;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Labam
 */
public class ListaCantantesFamosos {
    private ArrayList<CantanteFamoso> cantantesFamosos;
    
    //Constructor
    public ListaCantantesFamosos(){
        cantantesFamosos= new ArrayList<>();
    }
    
    public ListaCantantesFamosos(ArrayList<CantanteFamoso> cantantesFamosos) {
        this.cantantesFamosos = cantantesFamosos;
    }
    
    //SET/GET
    public void setCantantesFamosos(ArrayList<CantanteFamoso> cantantesFamosos) {
        this.cantantesFamosos = cantantesFamosos;
    }

    public ArrayList<CantanteFamoso> getCantantesFamosos() {
        return cantantesFamosos;
    }
    
    //Otros metodos
    public void Agregar(CantanteFamoso newC){
        cantantesFamosos.add(newC);
    }
    
    public void Eliminar(CantanteFamoso aux){
        cantantesFamosos.remove(aux);
    }
    
    public CantanteFamoso Buscar (String nombre){
        for (CantanteFamoso x: cantantesFamosos)
            if (nombre.equals(x.getNombre()))
                return x;
        return null;
    }
    
    public int Tamanno (){
        int cont=0;
        for(CantanteFamoso aux: cantantesFamosos)
            cont++;
        return cont;
    }
    
    public void Imprimir(){
        System.out.println("Lista de cantantes famosos:");
        for(CantanteFamoso aux: cantantesFamosos){
            aux.ImprimirInfo();
            System.out.println("------------------------------------------------");
        }
    }
    
    //Ordenar lista 
    public void ordenarPorNombre(){
        Collections.sort(cantantesFamosos, new CompararNombre());
    }

    public void ordenarPorDisco() {
        Collections.sort(cantantesFamosos, new CompararDisco());
    }
    
    public void ordenarPorAnno() {
        Collections.sort(cantantesFamosos);
    }
    
    public void ordenarPorDuracion() {
        Collections.sort(cantantesFamosos, new CompararDuracion());
    }
}

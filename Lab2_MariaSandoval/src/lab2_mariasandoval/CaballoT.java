/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_mariasandoval;

import java.util.ArrayList;

/**
 *
 * @author Labam
 */
public class CaballoT {
    //Atributos
    private int cantMAX;
    private int cantidad;
    private ArrayList<Guerreros> guerreros;
    
    //Constructores
    public CaballoT (){   //Sin parametros
        cantMAX=cantidad=0;
    }
    
    public CaballoT (int cantMAX){
        this.cantMAX=cantMAX;     //Con parametros
        this.cantidad=0;
        this.guerreros=new ArrayList <>();
    }
    
    //SET/GET
    public void setCantMAX(int cantMAX) {
        this.cantMAX = cantMAX;
    }
     
    public int getCantMAX() {
        return cantMAX;
    }

    public int getCantidad() {
        return cantidad;
    }

    public ArrayList<Guerreros> getGuerreros() {
        return guerreros;
    }

    //Otros metodos
    
    //Montar guerrero al caballo
    public int montar (Guerreros guerrero){
        if (cantidad == cantMAX)
            return -1;
        if (guerrero instanceof Griegos){
            guerreros.add(guerrero);
            cantidad++;
            ((Griegos) guerrero).setMontado(true);
            return cantidad;
        }else
            return -2;
    }
    
    //Desmontar guerrero
    public void desmontar(Griegos guerrero) {
        if (guerreros.contains(guerrero)) {
            guerreros.remove(guerrero);
            ((Griegos) guerrero).setMontado(false);
            cantidad--;
            System.out.println("El guerrero fue desmontado exitosamente");
        }else
            System.out.println("El guerrero no está montado en el caballo");
    } 
    
    //Buscar guerrero en el caballo
    public int buscarG (String nombre){
        for (int i=0; i<guerreros.size(); i++) {
            if (guerreros.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }
    
    //Imprimir informacion de los guerreros 
    public void imprimirInfo (){
        System.out.println("---------------------- INFORMACION DE LOS GUERREROS ----------------------");
        for (Guerreros guerrero: guerreros ){
            guerrero.imprimirInfo();
        }
        System.out.println("--------------------------------------------------------------------------");
    }
}
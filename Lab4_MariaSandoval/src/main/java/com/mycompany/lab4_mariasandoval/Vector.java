/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4_mariasandoval;

/**
 *
 * @author Labam
 */
public class Vector {
    // componentes del vector
    private int[] componentes;
    /**
    * Constructor que crea un vector de la dimensión indicada, inicialmente con todas sus
    componentes a cero.
    *
    * @param dimension
    * El número de componentes del vector
     * @throws com.mycompany.lab4_mariasandoval.IndiceExcepcion
    */
    public Vector(int dimension) throws IndiceExcepcion {
        if (dimension < 0)
            throw new IndiceExcepcion("El indice no puede ser negativo");
        componentes = new int[dimension];
    }
    
    //SET/GET
    
    public void setComponentes(int[] componentes) {
        this.componentes = componentes;
    }

    public int[] getComponentes() {
        return componentes;
    }

    /**
     * Este método cambia la componente i-ésima del vector por el valor pasado * como
    argumento.
     *
     * @param pos
     * El índice de la posición cuyo valor se va a cambiar.
     * @param valor
     * El nuevo valor que le damos a la componente i-ésima del * vector.
     * @throws com.mycompany.lab4_mariasandoval.IndiceExcepcion
     */
    public void cambiaComponente(int pos, int valor) throws IndiceExcepcion {
        if (pos < 0)
            throw new IndiceExcepcion("El indice no puede ser negativo");
        componentes[pos] = valor;
    }
    
    public boolean compararDim(Vector vector1, Vector vector2){
        return vector1.getComponentes().length == vector2.getComponentes().length;    
    }
    
    public Vector Suma (Vector vector1, Vector vector2) throws DimensionExcepcion{ 
        if (!compararDim(vector1, vector2)){
            throw new DimensionExcepcion("La dimension de ambos vectores no es la misma");
        }else if (!compararDim(this, vector1)){
            throw new DimensionExcepcion("La dimension de ambos vectores no es la misma");
        }else
            for (int i=0; i<vector1.getComponentes().length; i++)
               this.getComponentes()[i]=vector1.getComponentes()[i]+vector2.getComponentes()[i];
            return this;
    }
    
    public Vector Acumula(Vector vector1, Vector vector2)throws DimensionExcepcion{
        if (!compararDim(vector1, vector2))
             throw new DimensionExcepcion("La dimension de ambos vectores no es la misma");
        else
            for (int i=0; i<vector1.getComponentes().length; i++)
               vector1.getComponentes()[i]+=vector2.getComponentes()[i];
        return vector1;
    }
    
    public void ImprimirInfo(){
        for (int i=0; i<componentes.length; i++)
            System.out.println(" "+componentes[i]);
    }
}

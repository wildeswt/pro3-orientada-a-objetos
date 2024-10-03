package com.mycompany.lab7_mariasandoval;

import java.util.Comparator;

/**
 *
 * @author Maria Sandoval
 */
public class CompararNombre implements Comparator<CantanteFamoso>{

    @Override
    public int compare(CantanteFamoso o1, CantanteFamoso o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
    
}

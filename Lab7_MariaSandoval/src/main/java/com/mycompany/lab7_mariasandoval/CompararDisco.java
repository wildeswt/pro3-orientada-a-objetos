package com.mycompany.lab7_mariasandoval;

import java.util.Comparator;
/**
 *
 * @author Maria Sandoval
 */
public class CompararDisco implements Comparator<CantanteFamoso>{

    @Override
    public int compare(CantanteFamoso o1, CantanteFamoso o2) {
        return o1.getDiscoMasVentas().compareTo(o2.getDiscoMasVentas());
    }
    
}

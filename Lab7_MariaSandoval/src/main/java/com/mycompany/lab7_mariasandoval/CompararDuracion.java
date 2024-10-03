package com.mycompany.lab7_mariasandoval;

import java.util.Comparator;
/**
 *
 * @author Maria Sandoval
 */
public class CompararDuracion implements Comparator<CantanteFamoso> {

    @Override
    public int compare(CantanteFamoso o1, CantanteFamoso o2) {
        return Integer.compare(o1.getDuracion(), o2.getDuracion());
    }
    
}
